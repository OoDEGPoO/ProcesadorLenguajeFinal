import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class Analizador{
    public static void main(String[] args) throws Exception{
        String nombreFicheroCSV = "ficheroCSV.csv";
        if (args.length == 1) {
            nombreFicheroCSV = args[0];
            if (nombreFicheroCSV.endsWith(".csv")) System.out.println("Sergio melón");
        }
        /*
        InputStream entrada = System.in;
        if (nombreFicheroCSV != null) entrada = new FileInputStream(nombreFicheroCSV);
        File fichero = new File(nombreFicheroCSV + ".html");
        FileOutputStream salida = new FileOutputStream(fichero);
        fichero.createNewFile();

        //Análisis del Lexer y Parser
        ANTLRInputStream entradaANTLR = new ANTLRInputStream(entrada);

        gCSVLexer lexer = new gCSVLexer(entradaANTLR);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gCSVParser parser = new gCSVParser(tokens);
        ParseTree tree = parser.fichero();

        ParseTreeWalker walker = new ParseTreeWalker();
        AnalizadorListener escuchador = new AnalizadorListener(salida);
        walker.walk(escuchador, tree);*/

        //salida.close();
    }
}