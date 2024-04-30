package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.expression.Expression;

public class ForLoop implements Sent {
    private String name;
    private Expression ini;
    private Expression fin;
    private boolean inc;
    private Blq block;

    @Override
    public String getTranslation() {
        String translation = "";
        translation += "for ";
        translation += name;
        translation += " := ";
        translation += ini.getTranslation();
        translation += (inc ? " to ":" downto ");
        translation += fin.getTranslation();
        translation += " do\n";
        translation += block.getTranslation();

        return translation;
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
