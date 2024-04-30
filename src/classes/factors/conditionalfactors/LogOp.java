package classes.factors.conditionalfactors;

public enum LogOp {
    AND {
        @Override
        public String toString() {
            return "and";
        }
    },
    OR {
        @Override
        public String toString() {
            return "or";
        }
    }
}
