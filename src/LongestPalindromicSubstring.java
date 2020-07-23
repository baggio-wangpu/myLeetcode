public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int len = s.length();
        int palindromeStartsAt = 0, maxLen = 0;
        boolean[][] f = new boolean[len][len];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) &&
                        (j - i < 3 || f[i + 1][j - 1]);
                if (f[i][j] && (j - i + 1) > maxLen) {
                    palindromeStartsAt = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(palindromeStartsAt, palindromeStartsAt + maxLen);
    }
}
