import java.util.Stack;

public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        int left;
        int right;

        for(int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    left = stack.pop();
                    right = stack.pop();
                    result = left + right;
                    stack.push(result);
                    break;
                case "-":
                    right = stack.pop();
                    left = stack.pop();
                    result = left - right;
                    stack.push(result);
                    break;
                case "*":
                    right = stack.pop();
                    left = stack.pop();
                    result = left * right;
                    stack.push(result);
                    break;
                case "/":
                    right = stack.pop();
                    left = stack.pop();
                    result = left / right;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        return stack.isEmpty() ? result : stack.pop();
    }
}
