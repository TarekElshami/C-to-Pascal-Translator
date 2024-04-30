package classes.sentences;

import classes.Translation;
import classes.expression.Expression;

public class Asig implements SentWithName {
    private String name;
    private Expression value;

    public Asig() {
    }

    @Override
    public String getTranslation() {
        String translation = "";
        translation += name;
        translation += " := ";
        translation += value.getTranslation();
        translation += ";";
        return translation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
