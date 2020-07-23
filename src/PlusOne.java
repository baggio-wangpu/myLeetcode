public class PlusOne {

    public int[] plusOne(int[] digits) {

        boolean flag;
        if(digits[digits.length - 1] == 9) {
            digits[digits.length - 1] = 0;
            flag = true;
        } else {
            digits[digits.length - 1]++;
            return digits;
        }

        for(int i = digits.length - 2; i >= 0; i--) {
            if (flag && digits[i] == 9) {
                digits[i] = 0;
            } else {
                if(flag) {
                    digits[i] = digits[i] + 1;
                    flag = false;
                } else {
                    return digits;
                }
            }
        }

        if(flag) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            //System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
