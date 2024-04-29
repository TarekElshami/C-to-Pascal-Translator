package classes.factors.normalfactors;

import classes.Translation;
import classes.declarations.Param;
import classes.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class CallOrVar implements Factor, Translation {
    private String name;
    private List<Expression> listParams;

    public CallOrVar() {
        listParams = new ArrayList<>();
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

    public List<Expression> getListParams() {
        return listParams;
    }

    public void setListParams(List<Expression> listParams) {
        this.listParams = listParams;
    }
}
