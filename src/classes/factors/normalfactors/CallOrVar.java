package classes.factors.normalfactors;

import classes.Translation;
import classes.declarations.Param;

import java.util.List;

public class CallOrVar implements Factor, Translation {
    private String name;
    private List<Param> listParams;

    @Override
    public String getTranslation() {
        return null;
    }
}
