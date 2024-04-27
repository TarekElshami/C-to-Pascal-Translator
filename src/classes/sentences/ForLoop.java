package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.expression.Expression;

public class ForLoop implements Sent, Translation {
    private String name;
    private Expression ini;
    private Expression fin;
    private boolean inc;
    private Blq block;

    @Override
    public String getTranslation() {
        return null;
    }
}
