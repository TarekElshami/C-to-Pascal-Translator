package classes;

public class VarDcl implements Declaration{
    private String type;
    private String name;
    private  String value;

    public boolean isConst(){
        return value!=null;
    }
}
