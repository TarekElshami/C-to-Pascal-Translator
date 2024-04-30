package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.factors.conditionalfactors.Cond;

public class WhileLoop implements Sent, Translation {

    private Sent beforeWhile;
    private Cond cond;
    private Blq block;
    private boolean isWhile;

    public WhileLoop() {
        beforeWhile=null;
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public Cond getCond() {
        return cond;
    }

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public Blq getBlock() {
        return block;
    }

    public void setBlock(Blq block) {
        this.block = block;
    }

    public boolean isWhile() {
        return isWhile;
    }

    public void setWhile(boolean aWhile) {
        isWhile = aWhile;
    }

    public Sent getBeforeWhile() {
        return beforeWhile;
    }

    public void setBeforeWhile(Sent beforeWhile) {
        this.beforeWhile = beforeWhile;
    }
}
