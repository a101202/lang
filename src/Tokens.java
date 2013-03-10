public class Tokens {
    enum eKeyToken {eDecl, eInt}

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
}
