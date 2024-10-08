package classes.sentences;

import classes.Blq;
import classes.Program;
import classes.Translation;
import classes.factors.conditionalfactors.Cond;

public class WhileLoop implements Sent {

    private Sent beforeWhile;
    private Cond cond;
    private Blq block;
    private boolean isWhile;

    public WhileLoop() {
        beforeWhile=null;
    }

    @Override
    public String getTranslation() {
        if (isWhile) return getTranslationWhile();
        else return getTranslationUntil();
    }

    private String getTranslationWhile() {
        String translation = "";
        if (beforeWhile!=null) translation += beforeWhile.getTranslation() + "\n\t";
        translation += "while ";
        translation += cond.getTranslation();
        translation += " do";
        translation += block.getTabulatedTranslation();
        return translation;
    }

    private String getTranslationUntil() {
        String translation = "";
        translation += "repeat";
        translation += block.getTabulatedTranslation();
        translation += "\n\tuntil ";
        translation += cond.getTranslation();
        translation += ";";

        return translation;
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
