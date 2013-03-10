import java.util.HashMap;
import java.util.Map;

enum eTokenType {eVarToken, eConstIntToken, eKeyToken, eOperatorToken}
enum eKeyToken {eIf}
enum eVarToken {eInt}
enum eOperatorToken {ePlus, eSet}

abstract class Token {
    final eTokenType tokenType;

    protected Token(eTokenType tokenType) {
        this.tokenType = tokenType;
    }
}

final class Utils {
    private Utils() {}

    final Map<String, eKeyToken> keyMap;
    final Map<String, eVarToken> varMap;
    final Map<String, eOperatorToken> operatorMap;

    {
        keyMap = new HashMap<>();
        keyMap.put("if", eKeyToken.eIf);

        varMap = new HashMap<>();
        varMap.put("int", eVarToken.eInt);

        operatorMap = new HashMap<>();
        operatorMap.put("+", eOperatorToken.ePlus);
        operatorMap.put("=", eOperatorToken.eSet);
    }
}





class Tokenzzz {
    class VarToken {
        final Integer address;
        final eVarToken varType;

        VarToken(Integer address, eVarToken varType) {
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
        final eVarToken constIntType;

        ConstIntToken(Integer address, eVarToken constIntType) {
            this.address = address;
            this.constIntType = constIntType;
        }

        @Override
        public String toString() {
            return "ConstIntToken " + constIntType.toString() + " @" + address;
        }
    }

    class KeyToken {
        final eKeyToken keyType;

        KeyToken(eKeyToken keyType) {
            this.keyType = keyType;
        }

        @Override
        public String toString() {
            return "KeyToken " + keyType.toString();
        }
    }

    class OperatorToken {
        final eOperatorToken opType;

        OperatorToken(eOperatorToken opType) {
            this.opType = opType;
        }

        @Override
        public String toString() {
            return "OperatorToken " + opType.toString();
        }
    }
}