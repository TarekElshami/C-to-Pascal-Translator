package classes.sentences;

import classes.Blq;
import classes.Program;
import classes.expression.Expression;
import classes.expression.MathOp;
import classes.factors.conditionalfactors.Cond;
import classes.factors.normalfactors.CallOrVar;
import classes.factors.normalfactors.Factor;
import classes.factors.normalfactors.Inmediate;

public class ForManager {
    private String nameAsig;
    private Expression expAsig;
    private Cond cond;
    private String nameIncrement;
    private Expression expIncrement;

    private Blq block;

    public Sent get(){
        if (
            expIncrement.getFactorList().size()==2
            && expIncrement.getOpList().size() == 1
        ) {
            boolean to;
            if (expIncrement.getOpList().get(0) == MathOp.SUM)  to = true;
            else if (expIncrement.getOpList().get(0) == MathOp.SUB) to = false;
            else return null; //for now



            Factor plus1 = expIncrement.getFactorList().get(1);
            if (!(plus1 instanceof Inmediate)) return null;

            //check second op
            Inmediate i = (Inmediate) plus1;
            if (!"1".equals(i.getValue())) return null;

            //check first op
            Factor varName = expIncrement.getFactorList().get(0);
            if (!(varName instanceof CallOrVar)) return null;

            CallOrVar cov = (CallOrVar) varName;
            if (!cov.getName().equals(nameIncrement) || cov.getListParams()!=null) return null;


        }

            //&& expIncrement.getFactorList().get(1)
        return new ForLoop();
    }

    public ForManager() {
    }

    public String getNameAsig() {
        return nameAsig;
    }

    public void setNameAsig(String nameAsig) {
        this.nameAsig = nameAsig;
    }

    public Expression getExpAsig() {
        return expAsig;
    }

    public void setExpAsig(Expression expAsig) {
        this.expAsig = expAsig;
    }

    public Cond getCond() {
        return cond;
    }

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public String getNameIncrement() {
        return nameIncrement;
    }

    public void setNameIncrement(String nameIncrement) {
        this.nameIncrement = nameIncrement;
    }

    public Expression getExpIncrement() {
        return expIncrement;
    }

    public void setExpIncrement(Expression expIncrement) {
        this.expIncrement = expIncrement;
    }

    public Blq getBlock() {
        return block;
    }

    public void setBlock(Blq block) {
        this.block = block;
    }
}
