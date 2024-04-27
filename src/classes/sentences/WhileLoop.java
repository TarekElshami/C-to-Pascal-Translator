package classes.sentences;

import classes.Blq;
import classes.Translation;
import classes.factors.conditionalfactors.Cond;

public class WhileLoop implements Sent, Translation {
    private Cond cond;
    private Blq block;

    @Override
    public String getTranslation() {
        return null;
    }
}
