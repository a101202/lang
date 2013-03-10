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


class VarToken extends Token {
    final Integer address;
    final eVarToken varType;

    VarToken(eTokenType tokenType, Integer address, eVarToken varType) {
        super(tokenType);
        this.address = address;
        this.varType = varType;
    }

    @Override
    public String toString() {
        return "VarToken" + varType.toString() + " @" + address;
    }
}

class ConstIntToken extends Token {
    final Integer address;
    final eVarToken constIntType;

    ConstIntToken(eTokenType tokenType, Integer address, eVarToken constIntType) {
        super(tokenType);
        this.address = address;
        this.constIntType = constIntType;
    }

    @Override
    public String toString() {
        return "ConstIntToken " + constIntType.toString() + " @" + address;
    }
}

class KeyToken extends Token {
    final eKeyToken keyType;

    KeyToken(eTokenType tokenType, eKeyToken keyType) {
        super(tokenType);
        this.keyType = keyType;
    }

    @Override
    public String toString() {
        return "KeyToken " + keyType.toString();
    }
}

class OperatorToken extends Token {
    final eOperatorToken opType;

    OperatorToken(eTokenType tokenType, eOperatorToken opType) {
        super(tokenType);
        this.opType = opType;
    }

    @Override
    public String toString() {
        return "OperatorToken " + opType.toString();
    }
}