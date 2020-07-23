import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        if(s == null || s.length() == 0) return true;

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && isRightBrackets(stack.peek(), s.charAt(i))) stack.pop();
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }

    private boolean isRightBrackets(char s, char d) {
        if(s == '{' && d == '}') return true;
        else if(s == '(' && d == ')') return true;
        else return (s == '[' && d == ']');
    }

}
