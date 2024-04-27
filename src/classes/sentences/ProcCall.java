package classes.sentences;

import classes.expression.Expression;

import java.util.List;

public class ProcCall implements Sent{
    private String name;
    private List<Expression> params;
}
