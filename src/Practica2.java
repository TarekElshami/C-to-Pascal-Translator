import java.io.*;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.*;

public class Practica2 {
    public static void main(String[] args) {
        try {
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            // Crear el objeto correspondiente al analizador léxico con el fichero de
            // entrada
            Practica2Lexer analex = new Practica2Lexer(input);
            // Identificar al analizador léxico como fuente de tokens para el
            // sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);

            // Añade el CustomErrorListener al lexer
            analex.removeErrorListeners();
            analex.addErrorListener(new CustomErrorListener(0));

            // Crear el objeto correspondiente al analizador sintáctico
            Practica2Parser anasint = new Practica2Parser(tokens);

            // Aquí se añade el CustomErrorListener al parser
            anasint.removeErrorListeners(); // Elimina los listeners de error predeterminados
            anasint.addErrorListener(new CustomErrorListener(1)); // Añade el custom listener

            String arg = args[0];
            List<String> split = Arrays.asList(arg.split("/"));
            String name = split.get(split.size() - 1).split("\\.")[0];
            String filename = "";
            for (String s : split.subList(0,split.size()-1)) {
                filename += s + "/";
            }
            filename += name + ".pas";

            PrintStream out = new PrintStream(new FileOutputStream(filename));
            System.setOut(out);
            anasint.program(name);
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            //Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            //Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            //Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }

    }

}
