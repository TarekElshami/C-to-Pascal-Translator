package classes.factors;

import classes.Translation;
import classes.declarations.Param;
import classes.expression.Expression;
import classes.factors.conditionalfactors.FactorCond;
import classes.factors.normalfactors.Factor;

public class Parenthesis implements Factor, FactorCond {
    private Expression value;

    public Parenthesis() {
    }

    @Override
    public String getTranslation() {
        String translation = "";
        translation += "( ";
        translation += value.getTranslation();
        translation += " )";
        return translation;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }
}
