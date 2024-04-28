package classes.factors.conditionalfactors;

import classes.Translation;
import classes.declarations.Param;

public class Comp implements FactorCond, Translation {
    private Param p1;
    private Param p2;
    private CompOp op;

    public Comp() {
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public Param getP1() {
        return p1;
    }

    public void setP1(Param p1) {
        this.p1 = p1;
    }

    public Param getP2() {
        return p2;
    }

    public void setP2(Param p2) {
        this.p2 = p2;
    }

    public CompOp getOp() {
        return op;
    }

    public void setOp(CompOp op) {
        this.op = op;
    }
}
