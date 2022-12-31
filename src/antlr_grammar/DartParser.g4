parser grammar DartParser;
options {tokenVocab=DartLexer;}
program:
classDeclaration;
classDeclaration:
CLASS classMain;
classMain:
classHeader  classBody;
classHeader: ARRAY_STRING_VALUE;
//classScope: OPEN_CLASS classBody CLOSE_CLASS;
classBody:
OPEN_CLASS parameterClass function CLOSE_CLASS;
parameterClass:
parameterList  parameterInt;
parameterList :
LIST ARRAY_STRING_VALUE EQUAL  OPEN_LIST listbody CLOSE_LIST SMEI  ;          //equal
listbody:LIST_INT(COMMA LIST_INT)*;
parameterInt:
INTGER ARRAY_STRING_VALUE EQUAL LIST_INT SMEI;
function:
functionHeader    ;
functionHeader:
   VOID ARRAY_STRING_VALUE OPEN_B COLSE_B OPEN_CLASS functionBody print CLOSE_CLASS;
functionBody: FOR OPEN_B conditionFor COLSE_B OPEN_CLASS forBody CLOSE_CLASS;
conditionFor:
INTGER ARRAY_STRING_VALUE EQUAL LIST_INT SMEI ARRAY_STRING_VALUE SMALLER ARRAY_STRING_VALUE DOT LENGTH SMEI ARRAY_STRING_VALUE PLUS PLUS ;
forBody:
ARRAY_STRING_VALUE EQUAL ARRAY_STRING_VALUE PLUS ARRAY_STRING_VALUE OPEN_LIST ARRAY_STRING_VALUE CLOSE_LIST SMEI;
print: PRINT OPEN_B ARRAY_STRING_VALUE COLSE_B SMEI;




//class: classDef+;
//classDef:CLASS  CLASS_NAME OPEN_CLASS CLOSE_CLASS;
//list: listDef+;
//listDef: LIST OPEN_LIST listbody CLOSE_LIST;
//
//listbody: LIST_INT( COMMA LIST_INT)* #arrayInt;


