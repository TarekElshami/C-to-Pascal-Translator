package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.factors.conditionalfactors.Cond;

public class IfLoop implements Sent {
    private Cond cond;
    private Blq blockIf;
    private Blq blockElse;

    public IfLoop() {
    }

    @Override
    public String getTranslation() {
        return "if";
    }

    public Cond getCond() {
        return cond;
    }

    public void setCond(Cond cond) {
        this.cond = cond;
    }

    public Blq getBlockIf() {
        return blockIf;
    }

    public void setBlockIf(Blq blockIf) {
        this.blockIf = blockIf;
    }

    public Blq getBlockElse() {
        return blockElse;
    }

    public void setBlockElse(Blq blockElse) {
        this.blockElse = blockElse;
    }
}
