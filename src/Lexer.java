import java.io.*;
import java.util.*;

final class Lexer {
    private Lexer() {}

    private static boolean isWSpace(char c) {
        return c == 10 || c == 13 || c == ' ' || c == '@';
    }

    private static boolean isNum(char c) {
        return '0' <= c && c <= '9';
    }

    private static boolean isAlpha(char c) {
        return 'a' <= c && c <= 'z' || 'A' <= c && c <= 'Z';
    }

    static List<Token> tokenList(BufferedReader br) throws IOException {
//        List<Token> tokenList = new LinkedList<>();
//        String strToken; char c;
//        do{
//            c = (char)br.read();
//            if(isWSpace(c))
//                continue;
//            strToken = "";
//        }while (c != '@');
//        return null;
    }
}
