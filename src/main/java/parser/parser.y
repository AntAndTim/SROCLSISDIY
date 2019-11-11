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



%%

Program
    : ClassDeclarations
    ;

ClassDeclarations
    : /* empty */
    : ClassDeclaration ClassDeclarations
    ;
    
ClassDeclaration
    : CLASS ClassName Extends is MemberDeclarations end
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
    : var IDENTIFIER ':' Expression
    ;

MethodDeclaration
    : method IDENTIFIER [ Parameters ] [ : IDENTIFIER ] is Body end
    ;

Parameters
    : ( ParameterDeclaration { , ParameterDeclaration } )
    ;

ParameterDeclaration
    : IDENTIFIER : ClassName
    ;

Body
    : { VariableDeclaration | Statement }
    ;

ConstructorDeclaration
    : this [ Parameters ] is Body end
    ;

Statement
    : Assignment
    | WhileLoop
    | IfStatement
    | ReturnStatement
    ;

Assignment
    : IDENTIFIER ':=' Expression
    ;

WhileLoop
    : while Expression loop Body end
    ;

IfStatement
    : if Expression then Body [ else Body ] end
    ;

ReturnStatement
    : return [ Expression ]
    ;

Expression
    : Primary { '.' IDENTIFIER [ Arguments ] }
    ;

Arguments
    : '(' Expression { ',' Expression } ')'
    ;

Primary
    : IntegerLiteral
    | RealLiteral
    | BooleanLiteral
    | this
    | ClassName
    ;

%%
