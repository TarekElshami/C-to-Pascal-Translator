package classes.sentences;

import classes.Translation;
import classes.expression.Expression;

public class Asig implements Sent, Translation {
    private String name;
    private Expression value;

    @Override
    public String getTranslation() {
        return null;
    }
}
