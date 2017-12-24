grammar MiniJava;

init    : mainClass (classDeclaration)* EOF;


//parser rule
mainClass: 'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' statement '}' '}';
classDeclaration : 'class' ID ('extends' ID)? '{' (varDeclaration)* (methodDeclaration)* '}';
varDeclaration   : type ID ';';
methodDeclaration: 'public' type ID '(' (type ID (',' type ID)*)? ')' '{' (varDeclaration)* (statement)* 'return' expr ';' '}';
type    : 'int' '[' ']'
        | 'boolean'
        | 'int'
        | ID
        ;
statement: '{' (statement)* '}'
         | 'if' '(' expr ')' statement 'else' statement
         | 'while' '(' expr ')' statement
         | 'System.out.println' '(' expr ')' ';'
         | ID '=' expr ';'
         | ID '[' expr ']' '=' expr ';'
         ;
expr    : expr ('&&'|'<'|'+'|'-'|'*') expr
        | expr '[' expr ']'
        | expr '.' 'length'
        | expr '.' ID '(' (expr (',' expr)*)? ')'
        | INT_LITE
        | 'true'
        | 'false'
        | ID
        | 'this'
        | 'new' 'int' '[' expr ']'
        | 'new' ID '(' ')'
        | '!' expr
        | '(' expr ')'
        ;


//lexer rule
ID :  [a-zA-Z] [a-zA-Z0-9]* ;
INT_LITE : ('0' | [1-9] [0-9]*);


