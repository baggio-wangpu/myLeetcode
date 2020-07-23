import org.junit.Test;

import static org.junit.Assert.*;

public class LongestValidParenthesesTest {

    @Test
    public void longestValidParentheses() {
        LongestValidParentheses utils = new LongestValidParentheses();
        String str1 = "(()";
        assertEquals(2, utils.longestValidParentheses(str1));

        String str2 = ")()())";
        assertEquals(2, utils.longestValidParentheses(str2));

        String str3 = ")";
        assertEquals(0, utils.longestValidParentheses(str3));

        String str4 = "(()(((((())";
        assertEquals(4, utils.longestValidParentheses(str4));
    }
}