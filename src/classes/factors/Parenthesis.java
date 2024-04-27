package classes.factors;

import classes.Translation;
import classes.declarations.Param;
import classes.factors.conditionalfactors.FactorCond;
import classes.factors.normalfactors.Factor;

public class Parenthesis implements Factor, FactorCond, Translation {
    private Param value;

    @Override
    public String getTranslation() {
        return null;
    }
}
