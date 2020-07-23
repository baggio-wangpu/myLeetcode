import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        ValidParentheses parentheses = new ValidParentheses();
        assertTrue(parentheses.isValid("()"));
        assertTrue(parentheses.isValid("()[]{}"));
        assertFalse(parentheses.isValid("(]"));
        assertFalse(parentheses.isValid("([)]"));
        assertTrue(parentheses.isValid("{[]}"));
    }
}
