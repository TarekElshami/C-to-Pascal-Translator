package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.expression.Expression;

public class ForLoop implements Sent, Translation {
    private String name;
    private Expression ini;
    private Expression fin;
    private boolean inc;
    private Blq block;

    @Override
    public String getTranslation() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getIni() {
        return ini;
    }

    public void setIni(Expression ini) {
        this.ini = ini;
    }

    public Expression getFin() {
        return fin;
    }

    public void setFin(Expression fin) {
        this.fin = fin;
    }

    public boolean isInc() {
        return inc;
    }

    public void setInc(boolean inc) {
        this.inc = inc;
    }

    public Blq getBlock() {
        return block;
    }

    public void setBlock(Blq block) {
        this.block = block;
    }
}
