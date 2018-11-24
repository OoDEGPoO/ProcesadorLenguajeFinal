import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Analizador{
    public static void main(String[] args) throws Exception{
        String nombreFichero = "fichero.prog";
        if (args.length > 0) nombreFichero = args[0];
        
        InputStream entrada = System.in;
        if (nombreFichero != null) entrada = new FileInputStream(nombreFichero);
        File fichero = new File(nombreFichero + ".html");
        FileOutputStream salida = new FileOutputStream(fichero);
        fichero.createNewFile();

        //HTML
        String outString = "<html>\n<head><title>"+ nombreFichero + "</title>\n"
            + "\n<style>"
                +"\nbody{ "
                    +"\nbackground:lightgray;"
                +"\n}\n"
                +"\n.PalabraReservada {"
                +"\n    color:blue;"
                +"\n    font-weight:bolder;"
                +"\n}"
                +"\n.comentario {"
                +"\n    color:lightgreen;"
                +"\n}"
                +"\n.NombreFuncion {"
                +"\n    color: white;"
                +"\n    font-weight:bolder;"
                +"\n}"
                +"\n.NombreVariables {"
                +"\n    color: yellow;"
                +"\n}"
                +"\n.Tipos {"
                +"\n    color: red;"
                +"\n}"
                +"\n.Simbolos {"
                +"\n    color: black;"
                +"\n    font-weight:bolder;"
                +"\n}"
                +"\n.Asignacion {"
                +"\n    color: yellow;"
                +"\n    font-weight:bolder;"
                +"\n}"
                +"\n.SeparaTermina {"
                +"\n    color: blue;"
                +"\n}"
                +"\n.Resto {"
                +"\n    color: black;"
                +"\n}"
                +"\n.cuerpo {"
                +"\n    color: orange;"
                +"\n    font-weight:bolder;"
                +"\n}"
                +"\n.numero {"
                +"\n    color: blue;"
                +"\n}"
                +"\n.cadena {"
                +"\n    color: purple;"
                +"\n    font-style:italic;"
                +"\n}\n\n"
            +"\n</style>"
            +"\n</head>"
            +"\n<body>"
            +"\n<h1>C&oacute;digo del fichero " + nombreFichero + "</h1>"
            +"\n<code>"
            +"\n    <pre>";
        byte[] outbyte = outString.getBytes();
        salida.write(outbyte);

        //Análisis del Lexer y Parser
        ANTLRInputStream entradaANTLR = new ANTLRInputStream(entrada);

        gFiboLexer lexer = new gFiboLexer(entradaANTLR);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gFiboParser parser = new gFiboParser(tokens);
        ParseTree tree = parser.fichero();

        ParseTreeWalker walker = new ParseTreeWalker();
        AnalizadorListener escuchador = new AnalizadorListener(salida);
        walker.walk(escuchador, tree);

        //HTML
        outString = "\n<pre>\n<code>\n<body>\n<html>";
        outbyte = outString.getBytes();
        salida.write(outbyte);

        salida.close();
    }
}