package classes.sentences;

import classes.Blq;
import classes.Program;
import classes.expression.Expression;
import classes.expression.MathOp;
import classes.factors.conditionalfactors.*;
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

    public Sent get() {
        ForLoop forLoop = checkAndGetFor();
        if (forLoop!=null) return forLoop;
        return getWhile();
    }

    private Sent getWhile() {
        WhileLoop whileLoop = new WhileLoop();

        Asig asig = new Asig();
        asig.setName(nameAsig);
        asig.setValue(expAsig);
        whileLoop.setBeforeWhile(asig);

        whileLoop.setCond(cond);
        whileLoop.setBlock(block);

        Asig inc = new Asig();
        inc.setName(nameIncrement);
        inc.setValue(expIncrement);
        whileLoop.getBlock().addSent(inc);

        whileLoop.setWhile(true);
        return whileLoop;
    }

    private ForLoop checkAndGetFor(){
        if (expIncrement.getFactorList().size()!=2 || expIncrement.getOpList().size() != 1)
            return null;
        //comprobando signo incremento
        boolean to;
        if (expIncrement.getOpList().get(0) == MathOp.SUM)  to = true;
        else if (expIncrement.getOpList().get(0) == MathOp.SUB) to = false;
        else return null; //for now

        //check second op
        Factor plus1 = expIncrement.getFactorList().get(1);
        if (!(plus1 instanceof Inmediate)) return null;

        Inmediate i = (Inmediate) plus1;
        if (!"1".equals(i.getValue())) return null;

        //check first op
        Factor varName = expIncrement.getFactorList().get(0);
        if (!(varName instanceof CallOrVar)) return null;

        CallOrVar cov = (CallOrVar) varName;
        if (!cov.getName().equals(nameIncrement) || cov.getListParams()!=null) return null;

        //comprobar la condición
        if (!(cond.getFactorList().size()==1) || !(cond.getOpList().isEmpty())) return null;
        FactorCond factorCond = cond.getFactorList().get(0);
        if (!(factorCond instanceof Comp)) return null;
        Comp comp = (Comp) factorCond;
        if (!comp.getOp().equals(CompOp.LESSER_THAN) && !comp.getOp().equals(CompOp.GREATER_THAN)) return null;
        if (comp.getOp().equals(CompOp.LESSER_THAN) && !to) return null;
        if (comp.getOp().equals(CompOp.GREATER_THAN) && to) return null;

        //check first op of conditional is a variable
        Expression p1 = comp.getP1();
        if (!(p1.getFactorList().size()==1) || !(p1.getOpList().isEmpty())) return null;
        Factor leftSide = p1.getFactorList().get(0);
        if (!(leftSide instanceof CallOrVar)) return null;
        CallOrVar cov2 = (CallOrVar) leftSide;
        if (cov2.getListParams()!=null) return null;

        //all checks done?
        ForLoop forLoop = new ForLoop();
        forLoop.setName(nameAsig);
        forLoop.setIni(expAsig);
        forLoop.setFin(comp.getP2());
        forLoop.setInc(to);
        forLoop.setBlock(block);
        return forLoop;
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
