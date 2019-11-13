%language "Java"
%define api.value.type {token.Token}

%token OPENING_CURLY_BRACES
%token CLOSING_CURLY_BRACES
%token OPENING_PARENTHESIS
%token CLOSING_PARENTHESIS
%token OPENING_BRACKETS
%token CLOSING_BRACKETS
%token COMMA
%token DOT
%token IDENTIFIER
%token ELSE
%token FALSE
%token IF
%token IN
%token THIS
%token TRUE
%token VAR
%token WHILE
%token CLASS
%token EXTENDS
%token ASSIGNMENT
%token COLON
%token UNKNOWN
%token RETURN

/*todo tokens*/
%token IS      /* is  */
%token END     /* end */
               /* todo ASSIGNMENT(':=') */
%token LOOP    /* loop */
%token THEN    /* then */
%token METHOD  /* method */
%token INTEGER /* regular int: 1,2,3 ..*/
%token REAL    /* fp value: 1.1 ,1.2, 5.5 ... */

%%

Program
    : ClassDeclarations
    ;

ClassDeclarations
    : /* empty */
    | ClassDeclaration ClassDeclarations
    ;

ClassDeclaration
    : CLASS ClassName Extends IS MemberDeclarations END
    ;

Extends
    : /* empty */
    | EXTENDS ClassName
    ;

ClassName
    : IDENTIFIER /* no generics*/
    | IDENTIFIER OPENING_BRACKETS ClassName CLOSING_BRACKETS
    ;

MemberDeclarations
    : /* empty */
    | MemberDeclaration MemberDeclarations
    ;

MemberDeclaration
    : VariableDeclaration
    | MethodDeclaration
    | ConstructorDeclaration
    ;

VariableDeclaration
    : VAR IDENTIFIER COLON Expression
    ;

MethodDeclaration
    : METHOD IDENTIFIER Parameters MethodReturnType IS Body END
    ;

MethodReturnType
    : /* empty */
    | COLON IDENTIFIER
    ;

Parameters
    : OPENING_PARENTHESIS                       CLOSING_PARENTHESIS
    | OPENING_PARENTHESIS ParameterDeclarations CLOSING_PARENTHESIS
    ;

ParameterDeclarations
    : ParameterDeclaration
    | ParameterDeclarations COMMA ParameterDeclaration
    ;

ParameterDeclaration
    : IDENTIFIER COLON ClassName
    ;

Body
    : /* empty */
    | BodyMember Body
    ;

BodyMember
    : VariableDeclarationGroup
    | StatementGroup
    ;

VariableDeclarationGroup
    : /* empty */
    | VariableDeclaration VariableDeclarationGroup
    ;

StatementGroup
    : /* empty */
    | Statement StatementGroup
    ;

ConstructorDeclaration
    : THIS Parameters IS Body END
    ;

Statement
    : Assignment
    | WhileLoop
    | IfStatement
    | ReturnStatement
    | CallStatement
    ;

CallStatement
    : CompoundName OPENING_PARENTHESIS             CLOSING_PARENTHESIS
    | CompoundName OPENING_PARENTHESIS Parameters  CLOSING_PARENTHESIS
    ;

CompoundName
    :                  IDENTIFIER
    | CompoundName DOT IDENTIFIER
    ;

Assignment
    : IDENTIFIER ASSIGNMENT Expression
    ;

WhileLoop
    : WHILE Expression LOOP Body END
    ;

IfStatement
    : IF Expression THEN Body END
    | IF Expression THEN Body ELSE Body END
    ;

ReturnStatement
    : RETURN
    | RETURN Expression
    ;

Expression
    : Primary ExpressionCallGroup
    ;

/* one or more */
ExpressionCallGroup
    :                      ExpressionCallGroupComponent
    | ExpressionCallGroup  ExpressionCallGroupComponent
    ;

ExpressionCallGroupComponent
    : DOT IDENTIFIER Arguments
    ;

/* zero or more */
Arguments
    : OPENING_PARENTHESIS    /* empty */  CLOSING_PARENTHESIS
    | OPENING_PARENTHESIS ExpressionsList CLOSING_PARENTHESIS
    ;

/*one or more*/
/* expression, expression, expression */
ExpressionsList
    :                       Expression
    | ExpressionsList COMMA Expression
    ;

Primary
    : INTEGER
    | REAL
    | BooleanLiteral
    | THIS
    | ClassName
    ;

BooleanLiteral
    : TRUE
    | FALSE
    ;

%%
