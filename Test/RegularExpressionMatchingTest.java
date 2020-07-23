import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

    @Test
    public void isMatchTest() {

        RegularExpressionMatching matching = new RegularExpressionMatching();
        assertTrue(matching.isMatch("", ""));
        assertTrue(matching.isMatch("a", "."));
        assertFalse(matching.isMatch("aa", "a"));
        assertTrue(matching.isMatch("aa", "a*"));
        assertFalse(matching.isMatch("mississippi", "mis*is*p*."));
        assertTrue(matching.isMatch("aab", "c*a*b"));
    }
}