lexer grammar DartLexer;
 CLASS : 'class';
 //CLASS_NAME:'Test';
OPEN_CLASS : '{';
LIST : 'List';
//LIST_NAME:'number';
OPEN_LIST: '[' ;
WS:[ \t]+->channel(HIDDEN);
NEWLINE:[\n\r]->skip;
//mode LIST_MODE;
COMMA :',';
CLOSE_LIST:']' ;
LIST_INT : [0-9]+;
INTGER: 'int';
//INT_NAME : 'sumNumber';
EQUAL:'=';
//BODY_INT:[0-9]+;
PLUS:'+';
VOID:'void';
// SUM:'sum';
OPEN_B:'(';
COLSE_B:')';
FOR:'for';

SMALLER:'<';
DOT:'.';
LENGTH:'length';
PRINT:'print';
SMEI:';';
ARRAY_STRING_VALUE:[a-zA-Z]+|LETTER;
LETTER:('a'..'z'|'A'..'Z');
CLOSE_CLASS:'}';


