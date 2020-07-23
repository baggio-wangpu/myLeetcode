// L9
public class Palindrome {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        for(int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(s.length() - i - 1) == s.charAt(i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        boolean b = isPalindrome(1112222111);
        if (b) {
            System.out.println("111122221111 is Palindrome");
        } else {
            System.out.println("111122221111 is not Palindrome");
        }
    }
}
