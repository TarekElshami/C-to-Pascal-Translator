package classes.factors.conditionalfactors;

import classes.Translation;
import classes.declarations.Param;

public class Comp implements FactorCond, Translation {
    private Param p1;
    private Param p2;
    private CompOp op;

    @Override
    public String getTranslation() {
        return null;
    }
}
