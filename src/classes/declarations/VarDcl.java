package classes.declarations;

import classes.Translation;

public class VarDcl implements Declaration, Translation {
    private String type;
    private String name;
    private  String value;

    public boolean isConst(){
        return value!=null;
    }

    @Override
    public String getTranslation() {
        return null;
    }
}
