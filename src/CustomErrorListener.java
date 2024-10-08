import org.antlr.v4.runtime.*;

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
                            RecognitionException e)
    {
        String RType = "";
        if (type == 0){
            RType = "lexico";
        } else {
            RType = "sintáctico";
        }
        System.err.println("Error " + RType + " en la línea "+line+" y columna "+charPositionInLine+" -> "+msg);
        if (type!=0){
            underlineError(recognizer,(Token)offendingSymbol,
                    line, charPositionInLine);
        }
    }

    protected void underlineError(Recognizer recognizer,
                                  Token offendingToken, int line,
                                  int charPositionInLine) {
        CommonTokenStream tokens =
                (CommonTokenStream)recognizer.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lines = input.split("\n");
        String errorLine = lines[line - 1];
        System.err.println(errorLine);
        for (int i=0; i<charPositionInLine; i++) System.err.print(" ");
        int start = offendingToken.getStartIndex();
        int stop = offendingToken.getStopIndex();
        if ( start>=0 && stop>=0 ) {
            for (int i=start; i<=stop; i++) System.err.print("^");
        }
        System.err.println();
    }
}
