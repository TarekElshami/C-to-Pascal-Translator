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
        //String translation = "\n-------STARTING NEW BLOCK-------\n";
        String translation = "";
        translation += getDclListTranslation();

        translation += "begin\n";
        for (Sent sent : sentList) {
            translation += "\t";
            translation += sent.getTranslation();
            translation += "\n";
        }
        translation += "end";

        return translation;
    }

    public String getTabulatedTranslation(){
        String str = getTranslation();
        String result = "";
        for (String s : str.split("\n")) {
            result += "\n\t" + s;
        }
        return result;
    }

    public String getDclListTranslation(){
        String translation = "";
        String constants = "";
        String vars = "";
        String other = "";
        for (int i=0; i<dclList.size();i++) {
            Declaration dcl = dclList.get(i);
            if ((dcl instanceof VarDcl) && ((VarDcl) dcl).isConst()) {
                constants += "\t";
                constants += dcl.getTranslation();
                constants += "\n";
            } else if ((dcl instanceof VarDcl) && !((VarDcl) dcl).isConst()) {
                VarDcl current = (VarDcl) dcl;
                if (i==0 || !(dclList.get(i-1) instanceof VarDcl) || !Objects.equals(((VarDcl)dclList.get(i-1)).getType(), current.getType())){
                    vars += "\t";
                }
                if (i==dclList.size()-1) {
                    vars += current.getTranslation();
                    vars += "\n";
                } else {
                    Declaration next = dclList.get(i + 1);
                    if (next instanceof VarDcl && Objects.equals(((VarDcl) next).getType(), current.getType())){
                        vars += current.getName() + ", ";
                    } else {
                        vars += current.getTranslation();
                        vars += "\n";
                    }
                }


                //vars += dcl.getTranslation();

            } else {
                other += dcl.getTranslation();
                other += "\n";
            }
        }
        if (!constants.isEmpty()) {
            translation += "const\n";
            translation += constants;
        }
        if (!vars.isEmpty()) {
            translation += "var\n";
            translation += vars;
        }
        translation += other;
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
