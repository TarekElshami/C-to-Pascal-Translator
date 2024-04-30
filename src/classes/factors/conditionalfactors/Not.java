package classes.factors.conditionalfactors;

import classes.Translation;

public class Not implements FactorCond {
    private FactorCond factorCond;

    public Not() {
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public FactorCond getFactorCond() {
        return factorCond;
    }

    public void setFactorCond(FactorCond factorCond) {
        this.factorCond = factorCond;
    }
}
