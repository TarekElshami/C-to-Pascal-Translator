package classes.factors.normalfactors;

import classes.Translation;

public class Inmediate implements Factor {
    private String value;

    public Inmediate() {
    }
    public Inmediate(String value) {
        this.value = value;
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
