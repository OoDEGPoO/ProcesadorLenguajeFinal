parser grammar GcsvlexerParser;

options {
	tokenVocab = GcsvlexerLexer;
}

@header {
	package gramaticas;
}

fichero: cabecera linea+;

cabecera: columna (SEPARADOR columna)* INTRO;

linea: campo (SEPARADOR campo)* INTRO;

columna:
		texto		#columnaSinComillas
	|	cadena		#columnaConComillas
	|				#columnaVacio
	;

campo:
	  rutafichero			#rutaFicheroJson
	| rutaficherosalida		#rutaFicheroDot
	| rutaficherografico	#rutaFicheroSvg
	| nombre 				#textoNombre
	|						#campoVacio
	;

nombre:
		texto
    |	cadena
    ;

rutafichero: ruta (ext_json|ext_schema);
rutaficherosalida: ruta (ext_dot|ext_neato);
rutaficherografico: ruta ext_svg;

ruta:   PTO slash ruta
    |   PTO PTO slash ruta
    |   texto dpto slash ruta
    |   slash ruta
    |   ruta slash ruta
    |   texto
    ;


cadena: CADENA;
texto: TEXTO;
dpto: DPTO;

ext_json: PTO json;
ext_schema: pto schema;
ext_dot: pto dot;
ext_neato: pto neato;
ext_svg: pto svg;

intro: INTRO;
separador: SEPARADOR;
json: JSON;
schema: SCHEMA;
dot: DOT;
neato: NEATO;
svg: SVG;
pto: PTO;
slash: SLASH;
