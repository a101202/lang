public class Tokens {
    enum eKeyToken {eInt}
    enum eOperatorToken {ePlus}

    class NumToken {
        final int val;

        NumToken(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "NumToken " + val;
        }
    }

    class KeyToken {
        final eKeyToken type;

        KeyToken(eKeyToken type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "KeyToken " + type.toString();
        }
    }

    class OperatorToken {
        final eOperatorToken op;

        OperatorToken(eOperatorToken op) {
            this.op = op;
        }

        @Override
        public String toString() {
            return "OperatorToken " + op.toString();
        }
    }
}
