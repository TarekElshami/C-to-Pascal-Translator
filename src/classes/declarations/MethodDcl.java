package classes.declarations;

import classes.Blq;
import classes.Translation;

import java.util.List;

public class MethodDcl implements Declaration, Translation {

    private String name;
    private List<Param> listParam;
    private Blq block;
    private String type;

    @Override
    public String getTranslation() {
        return null;
    }

}
