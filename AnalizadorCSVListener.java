import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class AnalizadorListener extends gFiboParserBaseListener {
    
    private FileOutputStream salida = null;
    private byte[] buf;
    private String output;

    public AnalizadorListener(FileOutputStream salida){
        this.salida = salida;
        buf = null;
    }
/*
    @Override
    public void visitTerminal(TerminalNode node) {
        output = node.getText();

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }*/
    //Palabras Reservadas

    @Override
    public void enterFun(gFiboParser.FunContext ctx) {
        output = "<span class=\"PalabraReservada\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterInclud(gFiboParser.IncludContext ctx) {
        output = "<span class=\"PalabraReservada\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterBucle(gFiboParser.BucleContext ctx) {
        output = "<span class=\"PalabraReservada\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Comentarios
    
    @Override
    public void enterComentario(gFiboParser.ComentarioContext ctx) {
        output = "<span class=\"comentario\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Nombre Funcion

    @Override
    public void enterNfun(gFiboParser.NfunContext ctx) {
        output = "<span class=\"NombreFuncion\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterDev(gFiboParser.DevContext ctx) {
        output = "<span class=\"NombreFuncion\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Nombre Variable

    @Override
    public void enterVariable(gFiboParser.VariableContext ctx) {
        output = "<span class=\"NombreVariables\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Tipos
    
    @Override
    public void enterTipo(gFiboParser.TipoContext ctx) {
        output = "<span class=\"Tipos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Parentesis y simbolos de operadores
    @Override
    public void enterSap(gFiboParser.SapContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterScp(gFiboParser.ScpContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOp_div(gFiboParser.Op_divContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOp_mul(gFiboParser.Op_mulContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void exitOp_res(gFiboParser.Op_resContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOp_sum(gFiboParser.Op_sumContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void exitOpb_eq(gFiboParser.Opb_eqContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOpb_gt(gFiboParser.Opb_gtContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOpb_gteq(gFiboParser.Opb_gteqContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOpb_lt(gFiboParser.Opb_ltContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOpb_lteq(gFiboParser.Opb_lteqContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterOpb_neq(gFiboParser.Opb_neqContext ctx) {
        output = "<span class=\"Simbolos\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Asignacion

    @Override
    public void enterOp_asig(gFiboParser.Op_asigContext ctx) {
        output = "<span class=\"Asignacion\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Separadores y Terminadores

    @Override
    public void enterSseparador(gFiboParser.SseparadorContext ctx) {
        output = "<span class=\"SeparaTermina\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterSterminador(gFiboParser.SterminadorContext ctx) {
        output = "<span class=\"SeparaTermina\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Cuerpo

    @Override
    public void enterBegin(gFiboParser.BeginContext ctx) {
        output = "<span class=\"cuerpo\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterEnd(gFiboParser.EndContext ctx) {
        output = "<span class=\"cuerpo\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Numero
    
    @Override
    public void enterNumero(gFiboParser.NumeroContext ctx) {
        output = "<span class=\"numero\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //cadena

    @Override
    public void enterTexto(gFiboParser.TextoContext ctx) {
        output = "<span class=\"cadena\">" + ctx.getText() + "</span>";

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }
    //Resto

    @Override
    public void enterEspacio(gFiboParser.EspacioContext ctx) {
        output = ctx.getText();

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterInclude(gFiboParser.IncludeContext ctx) {
        output = ctx.getText();

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

    @Override
    public void enterSdeterminador(gFiboParser.SdeterminadorContext ctx) {
        output = ctx.getText();

        buf = output.getBytes();
        try {
            salida.write(buf);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
    }

}