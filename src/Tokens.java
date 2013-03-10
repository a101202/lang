import java.util.HashMap;
import java.util.Map;

public class Tokens {
    enum eKeyToken {eIf}
    enum eVarToken {eInt}
    enum eOperatorToken {ePlus, eSet}

    Map<String, eKeyToken> keyMap;
    {
        keyMap = new HashMap<>();
        keyMap.put("if", eKeyToken.eIf);
    }

    Map<String, eVarToken> varMap;
    {
        varMap = new HashMap<>();
        varMap.put("int", eVarToken.eInt);
    }

    Map<String, eOperatorToken> operatorMap;
    {
        operatorMap = new HashMap<>();
        operatorMap.put("+", eOperatorToken.ePlus);
        operatorMap.put("=", eOperatorToken.eSet);
    }

    class ConstIntToken {
        final int val;

        ConstIntToken(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "ConstIntToken " + val;
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
