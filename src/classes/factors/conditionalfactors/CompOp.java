package classes.factors.conditionalfactors;

public enum CompOp {
    GREATER_THAN {
        @Override
        public String toString() {
            return ">";
        }
    },
    LESSER_THAN {
        @Override
        public String toString() {
            return "<";
        }
    },
    GREATER_EQUAL {
        @Override
        public String toString() {
            return ">=";
        }
    },
    LESSER_EQUAL {
        @Override
        public String toString() {
            return "<=";
        }
    },
    EQUAL {
        @Override
        public String toString() {
            return "=";
        }
    }
}
