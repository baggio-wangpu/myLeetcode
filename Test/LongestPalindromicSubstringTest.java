import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring util = new LongestPalindromicSubstring();

    @Test
    public void longestPalindrome() {
        assertEquals("aba", util.longestPalindrome("babad"));
        assertEquals("bb", util.longestPalindrome("cbbd"));
    }
}