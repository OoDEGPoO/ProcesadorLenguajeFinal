lexer grammar gCSVLexer;

JSON: 'json';
SCHEMA: 'schema';
DOT: 'dot';
NEATO: 'neato';
SVG: 'svg';

LETRAS: ([a-zA-Z]|'á'|'é'|'í'|'ó'|'ú')+;
NUMEROS: [0-9]+;
PTO: '.';
DPTO: ':';
COMA: ',';
GUION: '-';
B_BAJA: '_';
SLASH: '/'|'\\';
WS: ' '+;
TAB: '\t'+;
INTRO: [\r\n]+;

/* 
INCLUDE: 'include';
FUN: 'function';
BEGIN: 'begin';
END: 'end';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
DEVOLVER: 'devolver';
NUM: 'numero';
STRING: 'cadena';
VOID: 'void';

COMEN_LINEA: '//' -> pushMode(COMEN_LINEA_MODE);
COMEN_ABRIR: '/*' -> pushMode(COMEN_MULTILINEA_MODE);

TEXTO_ABRIR: '"' -> pushMode(TEXTO_MODE);
IDENTIFICADOR: [a-zA-Z]+;
INT: [0-9]+;
SAP: '(';
SCP: ')';
SSEPARADOR: ',';
SDETERMINADOR: ':';
STERMINADOR: ';';
OP_ASIG: ':=';
OP_SUM: '+';
OP_RES: '-';
OP_MUL: '*';
OP_DIV: '/';
OPB_LT: '<';
OPB_GT: '>';
OPB_EQ: '==';
OPB_NEQ: '!=';
OPB_LTEQ: '<=';
OPB_GTEQ: '>=';

WS: ' '+;
TAB: '\t'+;
INTRO: [\r\n]+;

mode COMEN_LINEA_MODE;
COMEN_LINEA_FIN: [\r\n]+ -> popMode;
COMEN_LINEA_CAR: .+?;

mode TEXTO_MODE;
TEXTO_ESPECIAL: '\\' .+?;
TEXTO_CERRAR: '"' -> popMode;
TEXTO_CARACTER: .+?;*/