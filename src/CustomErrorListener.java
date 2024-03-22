import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class CustomErrorListener extends BaseErrorListener {

    private int type;
    public CustomErrorListener(int i) {
        this.type = i;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String message = "";
        if (type == 1){
            message = "Error de léxico en la línea ";
        } else if (type == 2){
            message = "Error de sintaxis en la línea ";
        }
        System.err.println(message + line + " y columna " + charPositionInLine + " - " + msg);
    }
}
