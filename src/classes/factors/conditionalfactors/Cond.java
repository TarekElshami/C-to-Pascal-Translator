package classes.factors.conditionalfactors;

import classes.Translation;

import java.util.ArrayList;
import java.util.List;

public class Cond implements Translation{
    private List<FactorCond> factorList;
    private List<LogOp> opList;

    public Cond() {
        factorList = new ArrayList<>();
        opList = new ArrayList<>();
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public List<FactorCond> getFactorList() {
        return factorList;
    }

    public void setFactorList(List<FactorCond> factorList) {
        this.factorList = factorList;
    }

    public List<LogOp> getOpList() {
        return opList;
    }

    public void setOpList(List<LogOp> opList) {
        this.opList = opList;
    }
}
