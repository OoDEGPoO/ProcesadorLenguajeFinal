parser grammar GjsonParser;

options {
	tokenVocab = GjsonLexer;
}

@header {
	package gramaticas;
}

json: context graph+;

cabecera: columna (SEPARADOR columna)* INTRO;

linea: campo (SEPARADOR campo)* INTRO;

columna:
		TEXTO		#columnaSinComillas
	|	CADENA		#columnaConComillas
	|				#columnaVacio
	;

campo:
		TEXTO		#textosSinComillas
	|	CADENA		#stringConComillas
	|				#campoVacio
	;
graph: (property|class|relationship)+
property: id_property
id_property: "@id"DPTO ruta / property # Texto
