package classes.factors.conditionalfactors;

import classes.Translation;
import classes.expression.Expression;

public class Comp implements FactorCond {
    private Expression p1;
    private Expression p2;
    private CompOp op;

    public Comp() {}

    @Override
    public String getTranslation() {
        String translation = "";
        translation += p1.getTranslation();
        translation += " " + op.toString() + " ";
        translation += p2.getTranslation();
        return translation;
    }

    public Expression getP1() {
        return p1;
    }

    public void setP1(Expression p1) {
        this.p1 = p1;
    }

    public Expression getP2() {
        return p2;
    }

    public void setP2(Expression p2) {
        this.p2 = p2;
    }

    public CompOp getOp() {
        return op;
    }

    public void setOp(CompOp op) {
        this.op = op;
    }
}
