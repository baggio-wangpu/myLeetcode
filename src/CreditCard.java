public class CreditCard {

    /*

    Your task is to write a function maskify, which will:

    Mask all digits (0-9) with #, unless they are first or last four characters.
    Never mask credit cards with less than 6 characters.
    Never mask non-digit characters.
    */

    public static String maskify(String creditCardNumber) {
        // Add code here
        if(creditCardNumber == null || creditCardNumber.length() < 6) {
            return creditCardNumber;
        }

        StringBuilder sb = new StringBuilder(creditCardNumber);

        for(int i = 1; i < sb.length() - 4; i++) {
            if(sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }
}
