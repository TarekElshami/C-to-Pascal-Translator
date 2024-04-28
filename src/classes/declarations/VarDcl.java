package classes.declarations;

import classes.Translation;

public class VarDcl implements Declaration, Translation {
    private String type;
    private String name;
    private  String value;

    public boolean isConst(){
        return value!=null;
    }

    public VarDcl() {
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
