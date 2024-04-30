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
        String translation = "";
        for (int i = 0; i < opList.size()-1; i++) {
            translation += factorList.get(i).getTranslation();
            translation += " ";
            translation += opList.get(i).toString();
            translation += " ";
        }
        translation += factorList.get(factorList.size()-1).getTranslation();
        return translation;
    }

    public void addAll(Cond condition){
        factorList.addAll(condition.getFactorList());
        opList.addAll(condition.getOpList());
    }
    public void addFactor(FactorCond factor){
        factorList.add(factor);
    }
    public void addOp(LogOp op){
        opList.add(op);
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
