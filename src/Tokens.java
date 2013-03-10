import java.util.HashMap;
import java.util.Map;


final class Utils {
    private Utils() {}

    static enum eKeyToken {eIf}
    static enum eVarToken {eInt}
    static enum eOperatorToken {ePlus, eSet}

    public Map<String, eKeyToken> keyMap;
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
}

class Tokenzzz {
    class VarToken {
        final Integer address;
        final Utils.eVarToken varType;

        VarToken(Integer address, Utils.eVarToken varType) {
            this.address = address;
            this.varType = varType;
        }

        @Override
        public String toString() {
            return "VarToken" + varType.toString() + " @" + address;
        }
    }

    class ConstIntToken {
        final Integer address;
        final Utils.eVarToken constIntType;

        ConstIntToken(Integer address, Utils.eVarToken constIntType) {
            this.address = address;
            this.constIntType = constIntType;
        }

        @Override
        public String toString() {
            return "ConstIntToken " + constIntType.toString() + " @" + address;
        }
    }

    class KeyToken {
        final Utils.eKeyToken keyType;

        KeyToken(Utils.eKeyToken keyType) {
            this.keyType = keyType;
        }

        @Override
        public String toString() {
            return "KeyToken " + keyType.toString();
        }
    }

    class OperatorToken {
        final Utils.eOperatorToken opType;

        OperatorToken(Utils.eOperatorToken opType) {
            this.opType = opType;
        }

        @Override
        public String toString() {
            return "OperatorToken " + opType.toString();
        }
    }
}
