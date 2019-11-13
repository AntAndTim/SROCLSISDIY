%language "Java"
%define api.value.type {token.Token}

%token WHITESPACE
%token OPENING_CURLY_BRACES
%token CLOSING_CURLY_BRACES
%token OPENING_PARENTHESIS
%token CLOSING_PARENTHESIS
%token OPENING_BRACKETS
%token CLOSING_BRACKETS
%token DOUBLE_QUOTES
%token SINGLE_QUOTES
%token SINGLE_QUOTES_2
%token COMMA
%token DOT
%token SEMICOLON
%token NEWLINE
%token IDENTIFIER
%token ABSTRACT
%token ARGUMENTS
%token BOOLEAN
%token BREAK
%token BYTE
%token CASE
%token CATCH
%token CHAR
%token CONST
%token CONTINUE
%token DEBUGGER
%token DEFAULT
%token DELETE
%token DO
%token DOUBLE
%token ELSE
%token EVAL
%token FALSE
%token FINAL
%token FINALLY
%token FLOAT
%token FOR
%token FUNCTION
%token GOTO
%token IF
%token IMPLEMENTS
%token IN
%token INSTANCEOF
%token INT
%token INTERFACE
%token LET
%token LONG
%token NATIVE
%token NEW
%token NULL
%token PACKAGE
%token PRIVATE
%token PROTECTED
%token PUBLIC
%token RETURN
%token SHORT
%token STATIC
%token SWITCH
%token SYNCHRONIZED
%token THIS
%token THROW
%token THROWS
%token TRANSIENT
%token TRUE
%token TRY
%token TYPEOF
%token VAR
%token VOID
%token VOLATILE
%token WHILE
%token WITH
%token YIELD
%token CLASS
%token ENUM
%token EXPORT
%token EXTENDS
%token IMPORT
%token SUPER
%token NUMBER_LITERAL
%token ASSIGNMENT
%token ASSIGNMENT_WITH_INCREASE
%token ASSIGNMENT_WITH_DECREASE
%token ASSIGNMENT_WITH_MULTIPLICATION
%token ASSIGNMENT_WITH_DIVISION
%token ASSIGNMENT_WITH_REMAINDER
%token ASSIGNMENT_WITH_AND
%token ASSIGNMENT_WITH_OR
%token ASSIGNMENT_WITH_XOR
%token ASSIGNMENT_WITH_LEFT_SHIFT
%token ASSIGNMENT_WITH_RIGHT_SHIFT
%token ASSIGNMENT_WITH_UNSIGNED_RIGHT_SHIFT
%token TYPELESS_EQUALITY
%token TYPELESS_INEQUALITY
%token EQUALITY
%token INEQUALITY
%token GREATER
%token LESS
%token GREATER_OR_EQUAL
%token LESS_OR_EQUAL
%token PLUS
%token MINUS
%token MILTIPLICATION
%token DIVISION
%token REMAINDER
%token INCREMENT
%token DECREMENT
%token BITWISE_AND
%token BITWISE_OR
%token BITWISE_NOT
%token BITWISE_XOR
%token BITWISE_LEFT_SHIFT
%token BITWISE_RIGHT_SHIFT
%token BITWISE_UNSIGNED_RIGHT_SHIFT
%token LOGICAL_AND
%token LOGICAL_OR
%token LOGICAL_NOT
%token ARROW
%token COLON
%token UNKNOWN

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
    : IDENTIFIER
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
