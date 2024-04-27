package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.factors.conditionalfactors.Cond;

public class IfLoop implements Sent, Translation {
    private Cond cond;
    private Blq blockIf;
    private Blq blockElse;

    @Override
    public String getTranslation() {
        return null;
    }

}
