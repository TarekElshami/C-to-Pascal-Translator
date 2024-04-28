package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.factors.conditionalfactors.Cond;

public class WhileLoop implements Sent, Translation {
    private Cond cond;
    private Blq block;

    public WhileLoop() {
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
}
