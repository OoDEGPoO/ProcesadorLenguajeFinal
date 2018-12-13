lexer grammar GjsonLexer;

// import GjsonFragments;

@header {
	package gramaticas;
}

TRUE: 'true' | 'TRUE';
FALSE: 'false' | 'FALSE';
NULL: 'null' | 'NULL';

TEXTO: ~[,\n\r"{}:]+; //todos menos una coma ni un intro
CADENA: '"' ('""' | ~'"')* '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));}; //cualquier cosa que venga entre comillas
INTRO: [\n\r]+;
SEPARADOR: ',';
ABRIRETIQUETA: '{';
CERRARETIQUETA: '}';
DP: ':';
CONTEXT: '';


