package classes;

import java.util.List;

public class Program implements Translation{

    private boolean hasMain;
    private String name;
    private Blq block;

    public Program() {
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public boolean hasMain() {
        return hasMain;
    }

    public void setHasMain(boolean hasMain) {
        this.hasMain = hasMain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blq getBlock() {
        return block;
    }

    public void setBlock(Blq block) {
        this.block = block;
    }
}
