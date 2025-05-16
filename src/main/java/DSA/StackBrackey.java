package DSA;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Stack;

public class StackBrackey {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String br) {
        Stack<Character> brack = new Stack<>();
        //  String br = "()";
        char[] cc = br.toCharArray();
        for (char a : cc) {
            if (a == '(' || a == '{' || a == '[') {
                brack.push(a);
            } else if (a == ')' || a == '}' || a == ']') {
                if (brack.isEmpty()) return false;
                char c = brack.pop();
                if (!isMatching(c, a)) {
                    return false;
                }
            }
        }
        return brack.isEmpty();
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
