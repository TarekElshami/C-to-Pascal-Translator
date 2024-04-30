package classes.declarations;

import classes.Blq;
import classes.Program;
import classes.Translation;

import java.util.List;

public class MethodDcl implements Declaration {

    private String name;
    private List<Param> listParam;
    private Blq block;
    private String type;

    public MethodDcl() {
    }

    @Override
    public String getTranslation() {
        String translation = "";
        if ("void".equals(type)) translation += "procedure ";
        else translation += "function ";
        translation += name;
        translation += "(";
        String lastType = "";
        if (listParam!=null) for (int i = 0; i<listParam.size();i++) {
            Param param = listParam.get(i);
            //if (i!=0 && listParam.get(i-1).getType().equals(param.getType()))
            if (!lastType.equals(param.getType()) && !lastType.isEmpty()){
                translation = translation.substring(0,translation.length()-2);
                translation += ": ";
                translation += lastType;
                translation += "; ";
            }
            translation += param.getName() + ", ";
            lastType = param.getType();

            if (i == listParam.size()-1) {
                translation = translation.substring(0,translation.length()-2);
                translation += ": ";
                translation += lastType;
            }
            //translation += param.getTranslation();
            //translation += "; ";
        }
        translation += ")";
        if (!"void".equals(type)) translation += " : " + type;
        translation += ";";
        translation += block.getTabulatedTranslation();
        translation += ";";
        return translation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Param> getListParam() {
        return listParam;
    }

    public void setListParam(List<Param> listParam) {
        this.listParam = listParam;
    }

    public Blq getBlock() {
        return block;
    }

    public void setBlock(Blq block) {
        this.block = block;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
