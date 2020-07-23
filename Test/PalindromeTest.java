import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void main() {
        assertTrue(Palindrome.isPalindrome(121));
        assertFalse(Palindrome.isPalindrome(-121));
        assertFalse(Palindrome.isPalindrome(10));
        assertTrue(Palindrome.isPalindrome(1));
        assertTrue(Palindrome.isPalindrome(22));
        assertTrue(Palindrome.isPalindrome(112211));
        assertTrue(Palindrome.isPalindrome(223322));
    }
}
