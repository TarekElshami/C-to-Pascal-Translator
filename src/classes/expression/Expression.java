package classes.expression;

import classes.Translation;
import classes.factors.normalfactors.Factor;

import java.util.List;

public class Expression implements Translation{
    private List<Factor> factorList;
    private List<MathOp> opList;

    public Expression() {
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public List<Factor> getFactorList() {
        return factorList;
    }

    public void setFactorList(List<Factor> factorList) {
        this.factorList = factorList;
    }

    public List<MathOp> getOpList() {
        return opList;
    }

    public void setOpList(List<MathOp> opList) {
        this.opList = opList;
    }
}
