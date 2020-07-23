import java.util.Stack;

public class LongestValidParentheses {

    /*
    Input: "(()"
    Output: 2
     */
    /*
    Input: ")()())"
    Output: 4
     */
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int num = 0, maxNum = 0;
        for(Character c : s.toCharArray()) {
            if(stack.empty()) stack.push(c);
            else {
                Character cur = stack.peek();
                if(cur == '(' && c == ')') {
                    num += 2;
                    stack.pop();
                    if(stack.empty()) maxNum = Math.max(num, maxNum);
                } else if(c == '(') {
                    num = 0;
                    stack.push(c);
                }
            }
        }
        return num;
    }
}
