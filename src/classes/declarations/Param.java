package classes.declarations;

import classes.Translation;

public class Param implements Translation {
    private String name;
    private String type;

    public Param() {
    }

    public Param(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getTranslation() {
        String translation = "";
        translation += name;
        translation += ": ";
        translation += type;
        return translation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
