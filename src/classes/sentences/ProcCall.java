package classes.sentences;

import classes.Translation;
import classes.expression.Expression;

import java.util.ArrayList;
import java.util.List;

public class ProcCall implements SentWithName {
    private String name;
    private List<Expression> params;

    public ProcCall() {
        params = new ArrayList<>();
    }

    @Override
    public String getTranslation() {
        String translation = "";
        translation += name;
        if (params != null && !params.isEmpty()) {
            translation += "(";
            for (Expression exp : params) {
                translation += exp.getTranslation();
            }
            translation += ")";
        }
        translation += ";";
        return translation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Expression> getParams() {
        return params;
    }

    public void setParams(List<Expression> params) {
        this.params = params;
    }
}
