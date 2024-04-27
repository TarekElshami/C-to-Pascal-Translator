package classes.sentences;

import classes.Translation;
import classes.expression.Expression;

import java.util.List;

public class ProcCall implements Sent, Translation {
    private String name;
    private List<Expression> params;

    @Override
    public String getTranslation() {
        return null;
    }
}
