package classes.expression;

import classes.Translation;
import classes.factors.normalfactors.Factor;

import java.util.ArrayList;
import java.util.List;

public class Expression implements Translation{
    private List<Factor> factorList;
    private List<MathOp> opList;

    public Expression() {
        factorList = new ArrayList<>();
        opList = new ArrayList<>();
    }

    @Override
    public String getTranslation() {
        String translation = "";
        for (int i = 0; i < opList.size(); i++) {
            translation += factorList.get(i).getTranslation();
            translation += " ";
            translation += opList.get(i).toString();
            translation += " ";
        }
        translation += factorList.get(factorList.size()-1).getTranslation();
        return translation;
    }

    public void addFactor(Factor factor){
        factorList.add(factor);
    }
    public void addOp(MathOp op){
        opList.add(op);
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
