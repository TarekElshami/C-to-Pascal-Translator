import java.io.*;

import org.antlr.v4.runtime.*;

/*
El nombre ClasePrincipal es arbitrario, escoge el que prefieras.
Sustituye Numbers por el nombre del fichero que contiene la especificación de la gramática ANTLR
(extensión .g4)
*/
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
            analex.addErrorListener(new CustomErrorListener(1));

// Crear el objeto correspondiente al analizador sintáctico
            Practica2Parser anasint = new Practica2Parser(tokens);

            // Aquí se añade el CustomErrorListener al parser
            anasint.removeErrorListeners(); // Elimina los listeners de error predeterminados
            anasint.addErrorListener(new CustomErrorListener(2)); // Añade el custom listener

            anasint.r();
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
