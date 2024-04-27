package classes;

public enum MathOp {
    SUM {
        @Override
        public String toString(){
            return "+";
        }
    },
    SUB {
        @Override
        public String toString(){
            return "-";
        }
    },
    MULT {
        @Override
        public String toString(){
            return "*";
        }
    },
    DIV{
        @Override
        public String toString(){
            return "div";
        }
    },
    MOD {
        @Override
        public String toString(){
            return "mod";
        }
    }

}
