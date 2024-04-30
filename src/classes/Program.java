package classes;

public class Program implements Translation{

    private boolean hasMain;
    private String name;
    private Blq block;

    public Program() {
        this.block = new Blq();
        hasMain = false;
    }

    @Override
    public String getTranslation() {
        if (hasMain) return getTranslationProgram();
        else return getTranslationUnit();
    }

    private String getTranslationUnit() {
        String translation = "";
        translation += "unit ";
        translation += "nombreDeLaUnidad";
        translation += ";\n";
        translation += block.getDclListTranslation();
        translation += ".";
        return translation;
    }

    private String getTranslationProgram() {
        String translation = "";
        translation += "program ";
        translation += "nombreDelPrograma";
        translation += ";\n";
        translation += block.getTranslation();
        translation += ".";
        return translation;
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
