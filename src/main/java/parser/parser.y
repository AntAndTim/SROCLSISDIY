%language "Java"
%code imports
{
package parser;

import ast.*;
import utils.Pair;

import java.util.ArrayList;
}

%code {public ProgramNode root;}


%token <token.Token> OPENING_CURLY_BRACES
%token <token.Token> CLOSING_CURLY_BRACES
%token <token.Token> OPENING_PARENTHESIS
%token <token.Token> CLOSING_PARENTHESIS
%token <token.Token> OPENING_BRACKETS
%token <token.Token> CLOSING_BRACKETS
%token <token.Token> COMMA
%token <token.Token> DOT
%token <token.Token> IDENTIFIER
%token <token.Token> ELSE
%token <token.Token> FALSE
%token <token.Token> IF
%token <token.Token> IN
%token <token.Token> THIS
%token <token.Token> TRUE
%token <token.Token> VAR
%token <token.Token> WHILE
%token <token.Token> CLASS
%token <token.Token> EXTENDS
%token <token.Token> ASSIGNMENT
%token <token.Token> COLON
%token <token.Token> UNKNOWN
%token <token.Token> RETURN

/*todo tokens*/
%token <token.Token> IS      /* is  */
%token <token.Token> END     /* end */
               /* todo ASSIGNMENT(':=') */
%token <token.Token> LOOP    /* loop */
%token <token.Token> THEN    /* then */
%token <token.Token> METHOD  /* method */
%token <token.Token> INTEGER /* regular int: 1,2,3 ..*/
%token <token.Token> REAL    /* fp value: 1.1 ,1.2, 5.5 ... */


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
    : IDENTIFIER COLON ClassName {$$ = new ParamsDeclNode(new IdentNode($1.getValue()), new TypeNode($3.ident, $3.generics));}
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
    | BooleanLiteral {$$ = $1}
    | THIS {$$ = null;}
    | ClassName {$$ = $1;}
    ;

BooleanLiteral
    : TRUE {$$ = new BooleanLitNode("True");}
    | FALSE {$$ = new BooleanLitNode("False");}
    ;

%%
