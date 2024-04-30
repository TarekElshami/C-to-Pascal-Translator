package classes;

import classes.declarations.Declaration;
import classes.declarations.VarDcl;
import classes.sentences.Sent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Blq implements Translation{
    private List<Declaration> dclList;
    private List<Sent> sentList;

    public Blq(){
        dclList = new ArrayList<>();
        sentList = new ArrayList<>();
    }

    public void addDcl(Declaration dcl){
        this.dclList.add(dcl);
    }

    public void addSent(Sent sent){
        this.sentList.add(sent);
    }

    @Override
    public String getTranslation() {
        String translation = "";

        String constants = "";
        String vars = "";
        String other = "";
        for (Declaration dcl : dclList) {
            if ((dcl instanceof VarDcl) && ((VarDcl) dcl).isConst()) {
                constants += "\t";
                constants += dcl.getTranslation();
                constants += "\n";
            } else if ((dcl instanceof VarDcl) && !((VarDcl) dcl).isConst()) {
                vars += "\t";
                vars += dcl.getTranslation();
                vars += "\n";
            } else {
                other += "\t";
                other += dcl.getTranslation();
                other += "\n";
            }
        }
        translation += "const\n";
        translation += constants;
        translation += "var\n";
        translation += vars;
        translation += other;

        translation += "begin\n";
        for (Sent sent : sentList) {
            translation += "\t";
            translation += sent.getTranslation();
            translation += "\n";
        }
        translation += "end";

        return translation;

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
