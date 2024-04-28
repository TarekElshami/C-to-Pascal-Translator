package classes;

import classes.declarations.Declaration;
import classes.sentences.Sent;

import java.util.ArrayList;
import java.util.List;

public class Blq implements Translation{
    private List<Declaration> dclList;
    private List<Sent> sentList;

    public Blq(){
        dclList = new ArrayList<>();
        sentList = new ArrayList<>();
    }

    @Override
    public String getTranslation() {
        return null;
    }

    public List<Declaration> getDclList() {
        return dclList;
    }

    public void setDclList(List<Declaration> dclList) {
        this.dclList = dclList;
    }

    public List<Sent> getSentList() {
        return sentList;
    }

    public void setSentList(List<Sent> sentList) {
        this.sentList = sentList;
    }
}
