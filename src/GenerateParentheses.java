import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        generateAll(new char[2 * n], 0, combinations);
        return combinations;
    }

    private void generateAll(char[] current, int pos, List<String> result) {
        if (current.length == pos) {
            if(valid(current)) result.add(new String(current));
        } else {
            current[pos] = '(';
            generateAll(current, pos + 1, result);
            current[pos] = ')';
            generateAll(current, pos + 1, result);
        }
    }

    private boolean valid(char[] s) {
        int balance = 0;
        for(char c : s) {
            if(c == '(') balance++;
            else balance--;
            if(balance < 0) return false;
        }
        return (balance == 0);
    }
}
