lexer grammar GcsvlexerLexer;

@header {
	package gramaticas;
}

JSON: 'json';
SCHEMA: 'schema';
DOT: 'dot';
NEATO: 'neato';
SVG: 'svg';

DPTO: ':';
PTO: '.';
SLASH: '/'|'\\';
SEPARADOR: ',';
INTRO: [\r\n]+;

TEXTO: ~[.:/,\n\r]+; //todos menos una coma ni un intro
CADENA: '"' ('""' | ~'"')* '"' {setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));}; //cualquier cosa que venga entre comillas


