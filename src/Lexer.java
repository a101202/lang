import java.io.*;
import java.util.*;

class Lexer {
    private boolean isWSpace(char c) {
        return c == 10 || c == 13 || c == ' ' || c == ';' || c == '@';
    }

    private boolean isNum(char c) {
        return '0' <= c && c <= '9';
    }

    private boolean isAlpha(char c) {
        return 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    static List<Token> tokenList(BufferedReader br) throws IOException {
        List<Token> tokenList = new LinkedList<>();
        String strToken; char c;
        do{
            c = (char)br.read();
            strToken = "";
        }while (c != '@');
        return null;
    }
}
