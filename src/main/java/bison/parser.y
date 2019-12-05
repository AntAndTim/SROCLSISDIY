%language "Java"
%code imports
{
package bison;

import ast.*;
import utils.Pair;

import java.util.ArrayList;
}

%code {public ProgramNode root;}


%token <bison.Token> OPENING_CURLY_BRACES
%token <bison.Token> CLOSING_CURLY_BRACES
%token <bison.Token> OPENING_PARENTHESIS
%token <bison.Token> CLOSING_PARENTHESIS
%token <bison.Token> OPENING_BRACKETS
%token <bison.Token> CLOSING_BRACKETS
%token <bison.Token> COMMA
%token <bison.Token> DOT
%token <bison.Token> IDENTIFIER
%token <bison.Token> ELSE
%token <bison.Token> FALSE
%token <bison.Token> IF
%token <bison.Token> IN
%token <bison.Token> THIS
%token <bison.Token> TRUE
%token <bison.Token> VAR
%token <bison.Token> WHILE
%token <bison.Token> CLASS
%token <bison.Token> EXTENDS
%token <bison.Token> ASSIGNMENT
%token <bison.Token> COLON
%token <bison.Token> UNKNOWN
%token <bison.Token> RETURN

/*todo tokens*/
%token <bison.Token> IS      /* is  */
%token <bison.Token> END     /* end */
               /* todo ASSIGNMENT(':=') */
%token <bison.Token> LOOP    /* loop */
%token <bison.Token> THEN    /* then */
%token <bison.Token> METHOD  /* method */
%token <bison.Token> INTEGER /* regular int: 1,2,3 ..*/
%token <bison.Token> REAL    /* fp value: 1.1 ,1.2, 5.5 ... */


/* %type <ast.IfStatementNode> IfStatement */
%type <ArrayList<ClassDeclNode>> ClassDeclarations
%type <ast.ClassDeclNode> ClassDeclaration
%type <ast.ClassNameNode> Extends
%type <ast.ClassNameNode> ClassName
%type <ArrayList<MemberDeclNode>> MemberDeclarations
%type <ast.MemberDeclNode> MemberDeclaration
%type <ast.VariableDeclNode> VariableDeclaration
%type <ast.MethodDeclNode> MethodDeclaration
%type <ast.ConstructorDeclNode> ConstructorDeclaration
%type <ast.IdentNode> MethodReturnType
%type <ArrayList<ParamsDeclNode>> Parameters
%type <ArrayList<ParamsDeclNode>> ParameterDeclarations
%type <ast.ParamsDeclNode> ParameterDeclaration
%type <ArrayList<ast.Node>> Body
%type <ArrayList<ast.Node>> BodyMember
%type <ArrayList<ast.Node>> VariableDeclarationGroup
%type <ArrayList<ast.Node>> StatementGroup
%type <ast.Node> Statement
%type <ast.AssignmentNode> Assignment
%type <ast.WhileLoopNode> WhileLoop
%type <ast.IfStatementNode> IfStatement
%type <ast.ReturnStatement> ReturnStatement
%type <ast.ExpressionNode> Expression
%type <ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>> ExpressionCallGroup
%type <Pair<IdentNode, ArrayList<ExpressionNode>>> ExpressionCallGroupComponent
%type <ArrayList<ExpressionNode>> Arguments
%type <ArrayList<ExpressionNode>> ExpressionsList
%type <ast.Node> Primary
%type <ast.BooleanLitNode> BooleanLiteral
%type <ArrayList<IdentNode>> ClassGenerics
%type <ast.TypeNode> TypeName
%type <ArrayList<ast.TypeNode>> TypeNameList


%%

Program
    : ClassDeclarations {root = new ProgramNode($1);}
    ;

ClassDeclarations
    : /* empty */                        {$$ = new ArrayList<ClassDeclNode>();}
    | ClassDeclaration ClassDeclarations { $2.add($1); $$=$2; }
    ;

ClassDeclaration
    : CLASS ClassName Extends IS MemberDeclarations END {$$ = new ClassDeclNode($2, $3, $5);}
    ;

Extends
    : /* empty */ {$$ = null;}
    | EXTENDS ClassName {$$ = $2;}
    ;

ClassName
    : IDENTIFIER /* no generics*/ {$$ = new ast.ClassNameNode(new ast.IdentNode($1.getValue()), null);}
    | IDENTIFIER OPENING_BRACKETS ClassGenerics CLOSING_BRACKETS {$$ = new ast.ClassNameNode(new ast.IdentNode($1.getValue()), $3);}
    ;


TypeName
    : IDENTIFIER /* no generics*/ {$$ = new ast.TypeNode(new ast.IdentNode($1.getValue()), null);}
    | IDENTIFIER OPENING_BRACKETS TypeNameList CLOSING_BRACKETS {$$ = new ast.TypeNode(new ast.IdentNode($1.getValue()), $3);}
    ;

TypeNameList
    :                     TypeName {ArrayList<TypeNode> list = new ArrayList<TypeNode>(); list.add($1); $$ = list;}
    | TypeNameList COMMA TypeName {$1.add($3); $$ = $1;}

ClassGenerics
    :                     IDENTIFIER {ArrayList<IdentNode> list = new ArrayList<IdentNode>(); list.add(new IdentNode($1.getValue())); $$ = list;}
    | ClassGenerics COMMA IDENTIFIER {$1.add(new IdentNode($3.getValue())); $$ = $1;}

MemberDeclarations
    : /* empty */ {$$ = new ArrayList<MemberDeclNode>();}
    | MemberDeclaration MemberDeclarations {$2.add($1); $$ = $2;}
    ;

MemberDeclaration
    : VariableDeclaration {MemberDeclNode node = new MemberDeclNode(); node.declaration = $1; node.declType = MemberDeclNode.memberType.FIELD; $$ = node;}
    | MethodDeclaration {MemberDeclNode node = new MemberDeclNode(); node.declaration = $1; node.declType = MemberDeclNode.memberType.FIELD; $$ = node;}
    | ConstructorDeclaration {MemberDeclNode node = new MemberDeclNode(); node.declaration = $1; node.declType = MemberDeclNode.memberType.FIELD; $$ = node;}
    ;

VariableDeclaration
    : VAR IDENTIFIER COLON Expression {$$ = new ast.VariableDeclNode(new IdentNode($2.getValue()),$4);}
    ;

MethodDeclaration
    : METHOD IDENTIFIER Parameters MethodReturnType IS Body END {$$ = new ast.MethodDeclNode(new ast.IdentNode($2.getValue()),$3,$4,new ast.BodyNode($6));}
    ;

MethodReturnType
    : /* empty */ {$$ = null;}
    | COLON IDENTIFIER {$$ = new IdentNode($2.getValue());}
    ;

Parameters
    : OPENING_PARENTHESIS                       CLOSING_PARENTHESIS {$$ = new ArrayList<ParamsDeclNode>();}
    | OPENING_PARENTHESIS ParameterDeclarations CLOSING_PARENTHESIS {$$ = $2;}
    ;

ParameterDeclarations
    : ParameterDeclaration {ArrayList<ParamsDeclNode> params = new ArrayList<ParamsDeclNode>(); params.add($1); $$ = params;}
    | ParameterDeclarations COMMA ParameterDeclaration { $1.add($3); }
    ;

ParameterDeclaration
    : IDENTIFIER COLON TypeName {$$ = new ParamsDeclNode(new IdentNode($1.getValue()), $3);}
    ;

Body
    : /* empty */ {$$ = new ArrayList<Node>();}
    | BodyMember Body {$2.addAll($1);}
    ;

BodyMember
    : VariableDeclarationGroup {$$ = $1;}
    | StatementGroup {$$ = $1;}
    ;

VariableDeclarationGroup
    : /* empty */ {$$ = new ArrayList<ast.Node>();}
    | VariableDeclaration VariableDeclarationGroup {$2.add($1); $$ = $2;}
    ;

StatementGroup
    : /* empty */ {$$ = new ArrayList<ast.Node>();}
    | Statement StatementGroup {$2.add($1); $$ = $2;}
    ;

ConstructorDeclaration
    : THIS Parameters IS Body END {$$ = new ast.ConstructorDeclNode($2,new BodyNode($4));}
    ;

Statement
    : Assignment {$$ = $1;}
    | WhileLoop {$$ = $1;}
    | IfStatement {$$ = $1;}
    | ReturnStatement {$$ = $1;}
    | Expression {$$ = $1;}
    ;

/*
CallStatement
    : CompoundName OPENING_PARENTHESIS             CLOSING_PARENTHESIS
    | CompoundName OPENING_PARENTHESIS Parameters  CLOSING_PARENTHESIS
    ;

CompoundName
    :                  IDENTIFIER
    | CompoundName DOT IDENTIFIER
    ;*/

Assignment
    : IDENTIFIER ASSIGNMENT Expression {$$ = new AssignmentNode(new IdentNode($1.getValue()), $3);}
    ;

WhileLoop
    : WHILE Expression LOOP Body END {$$ = new WhileLoopNode($2, new BodyNode($4));}
    ;

IfStatement
    : IF Expression THEN Body END {$$ = new IfStatementNode($2, new BodyNode($4));}
    | IF Expression THEN Body ELSE Body END {$$ = new IfStatementNode($2, new BodyNode($4), new BodyNode($6));}
    ;

ReturnStatement
    : RETURN {$$ = new ReturnStatement(null);}
    | RETURN Expression {$$ = new ReturnStatement($2);}
    ;

Expression
    : Primary {$$ = new ExpressionNode($1, null);}
    | Primary ExpressionCallGroup {$$ = new ExpressionNode($1, $2);}
    ;

/* one or more */
ExpressionCallGroup
    :                      ExpressionCallGroupComponent {ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>> list = new ArrayList<Pair<IdentNode, ArrayList<ExpressionNode>>>(); list.add($1); $$ = list;}
    | ExpressionCallGroup  ExpressionCallGroupComponent {$1.add($2); $$ = $1;}
    ;

ExpressionCallGroupComponent
    : DOT IDENTIFIER Arguments {Pair<IdentNode, ArrayList<ExpressionNode>> component = new Pair<IdentNode, ArrayList<ExpressionNode>>(new IdentNode($2.getValue()), $3); $$ = component;}
    ;

/* zero or more */
Arguments
    : OPENING_PARENTHESIS    /* empty */  CLOSING_PARENTHESIS {$$ = new ArrayList<ExpressionNode>();}
    | OPENING_PARENTHESIS ExpressionsList CLOSING_PARENTHESIS {$$ = $2;}
    ;

/*one or more*/
/* expression, expression, expression */
ExpressionsList
    :                       Expression {ArrayList<ExpressionNode> list = new ArrayList<ExpressionNode>(); list.add($1); $$ = list;}
    | ExpressionsList COMMA Expression {$1.add($3); $$ = $1;}
    ;

Primary
    : INTEGER {$$ = new IntegerLitNode($1.getValue());}
    | REAL    {$$ = new RealLitNode($1.getValue());}
    | BooleanLiteral {$$ = $1;}
    | THIS {$$ = null;}
    | ClassName {$$ = $1;}
    ;

BooleanLiteral
    : TRUE {$$ = new BooleanLitNode("True");}
    | FALSE {$$ = new BooleanLitNode("False");}
    ;

%%
