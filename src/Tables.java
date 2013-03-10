import java.util.HashMap;
import java.util.Map;

final class Tables {
    private Tables() {}

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
