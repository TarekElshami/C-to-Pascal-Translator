package classes.factors.normalfactors;

import classes.Translation;
import classes.declarations.Param;

import java.util.ArrayList;
import java.util.List;

public class CallOrVar implements Factor, Translation {
    private String name;
    private List<Param> listParams;

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

    public List<Param> getListParams() {
        return listParams;
    }

    public void setListParams(List<Param> listParams) {
        this.listParams = listParams;
    }
}
