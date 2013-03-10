import java.util.HashMap;
import java.util.Map;


final class Utils {
    private Utils() {}

    static enum eKeyToken {eIf}
    static enum eVarToken {eInt}
    static enum eOperatorToken {ePlus, eSet}
}

class Tokenzzz {
    public Map<String, Utils.eKeyToken> keyMap;
    {
        keyMap = new HashMap<>();
        keyMap.put("if", Utils.eKeyToken.eIf);
    }

    Map<String, Utils.eVarToken> varMap;
    {
        varMap = new HashMap<>();
        varMap.put("int", Utils.eVarToken.eInt);
    }

    Map<String, Utils.eOperatorToken> operatorMap;
    {
        operatorMap = new HashMap<>();
        operatorMap.put("+", Utils.eOperatorToken.ePlus);
        operatorMap.put("=", Utils.eOperatorToken.eSet);
    }

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
