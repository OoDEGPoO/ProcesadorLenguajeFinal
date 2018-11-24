parser grammar gFiboParser;
options {
    tokenVocab = gFiboLexer;
    language = Java;
}

fichero: prog*;

prog:   comentario+ prog
    |   prog comentario+
    |   espacio+ prog
    |   prog espacio+
    |   incl
    |   dfun
    ;

espacio: (WS|TAB|INTRO);
tipo: (t_num|t_string|t_void);
t_num: NUM;
t_string: STRING;
t_void: VOID;

incl: includ espacio+ include sterminador;
dfun: fun espacio+ nfun sap (tipo espacio+ variable)* scp sdeterminador tipo espacio* cuerpo;
includ: INCLUDE;
fun: FUN;
sterminador: STERMINADOR;
sap: SAP;
scp: SCP;
sdeterminador: SDETERMINADOR;

cuerpo: begin ( ((expr|decl|asignacion|devolver) sterminador) | mientras )* espacio* comentario* espacio* end;

decl:   comentario+ decl
    |   decl comentario+
    |   espacio+ decl
    |   decl espacio+
    |   tipo espacio+ variable espacio* op_asig expr
    ;

expr:	comentario+ expr
    |   expr comentario+
    |   espacio+ expr
    |   expr espacio+
    |   expr (op_mul|op_div) expr
    |	expr (op_sum|op_res) expr
    |   expr (opb_lt|opb_gt|opb_eq|opb_neq|opb_lteq|opb_gteq) expr
    |	numero
    |   texto
    |   funcion
    |   variable
    |	sap expr scp
    ;

asignacion: comentario+ asignacion
    |   espacio+ asignacion
    |   variable espacio* op_asig espacio* expr espacio*
    ;
comentario: COMEN_ABRIR (texto_comen)* COMEN_CERRAR
    |   COMEN_LINEA (texto_comen)* COMEN_LINEA_FIN
    ;
texto_comen: COMEN_LINEA_CAR+|COMEN_MULTILINEA_CAR+;

mientras: espacio+ mientras
    |   mientras espacio+
    |   comentario+ mientras
    |   mientras comentario+
    |   bucle espacio* sap expr scp espacio* cuerpo
    ;
bucle: WHILE;

numero: INT;
texto: TEXTO_ABRIR (TEXTO_CARACTER|TEXTO_ESPECIAL)* TEXTO_CERRAR;
devolver: espacio+ devolver
    |   comentario+ devolver
    |   dev espacio* sap expr scp
    ;
dev: DEVOLVER;

funcion: nfun espacio* sap (expr (sseparador expr)*)? scp;
variable: IDENTIFICADOR;
nfun: IDENTIFICADOR;
include: IDENTIFICADOR;

begin: BEGIN;
end: END;
op_asig: OP_ASIG;
op_sum: OP_SUM;
op_res: OP_RES;
op_mul: OP_MUL;
op_div: OP_DIV;
opb_lt: OPB_LT;
opb_gt: OPB_GT;
opb_eq: OPB_EQ;
opb_neq: OPB_NEQ;
opb_lteq: OPB_LTEQ;
opb_gteq: OPB_GTEQ;
sseparador: SSEPARADOR;