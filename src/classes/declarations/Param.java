package classes.declarations;

import classes.Translation;

public class Param implements Translation {
    private String name;
    private String type;

    public Param() {
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
