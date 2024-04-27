package classes.expression;

import classes.Translation;
import classes.factors.normalfactors.Factor;

import java.util.List;

public class Expression implements Translation{
    private List<Factor> factorList;
    private List<MathOp> opList;

    @Override
    public String getTranslation() {
        return null;
    }
}
