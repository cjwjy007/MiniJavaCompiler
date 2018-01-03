grammar MiniJava;

init    : mainClass (classDeclaration)* EOF;


//parser rules
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
        | expr ('&&' | '<' | '+' | '-' | '*' )
                {notifyErrorListeners(this.getCurrentToken(),
                    "Missing right operand",
                    new MyRecognitionException(this));}
        | ('&&' | '<' | '+' | '-' | '*' ) expr
                {notifyErrorListeners(this.getCurrentToken(),
                    "Missing left operand",
                    new MyRecognitionException(this));}
        | expr '[' expr ']'
        | expr '.' 'length'
        | expr '.' ID '(' (expr (',' expr)*)? ')'
        | expr '.' ID '(' (expr (',' expr)* )? ')' ')'
                        {notifyErrorListeners(this.getCurrentToken(),
                            "Too many parentheses",
                            new MyRecognitionException(this));}
        | expr '.' ID '(' (expr (',' expr)* )?
             {notifyErrorListeners(this.getCurrentToken(),
                 "Missing closing ')'",
                 new MyRecognitionException(this));}
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


//lexer rules
ID :  [a-zA-Z_$][a-zA-Z0-9_]*;
INT_LITE : ('0' | [1-9] [0-9]*);
WS      : [ \t\r\n]+ -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
ASSIGN  : '=';
GT      : '>';
LT      : '<';
GE      : '>=';
LE      : '<=';
PLUS    : '+';
MINUS   : '-';
TIMES   : '*';
BANG    : '!';
AND     : '&&';
OR      : '||';
L_PAREN : '(';
R_PAREN : ')';
L_BRACK : '[';
R_BRACK : ']';
L_BRACE : '{';
R_BRACE : '}';
COMMA   : ',';
DOT     : '.';
SEMI    : ';';

