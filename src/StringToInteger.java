public class StringToInteger {

    public int myAtoi(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        long result = 0;
        boolean flag = true;    //positive or negative
        boolean number = false;

        for(int i = 0; i < str.length(); i++) {

            //first check this string is valid or not
            if(str.charAt(i) == ' ' && !number) {
                continue;
            }

            char c = str.charAt(i);
            if((c > '9' || c < '0') && c != '-' && c != '+') {
                if(!number) {
                    return 0;
                } else {
                    return flag ? (int)result : -1 * (int)result;
                }
            }

            if((c == '-' || c == '+') && number) {
                return flag ? (int)result : -1 * (int)result;
            }

            if(c == '-') {
                number = true;
                flag = false;
            } else if(c == '+') {
                number = true;
                flag = true;
            } else if(c >= '0' && c <= '9') {
                number = true;
                result = 10 * result + (c - '0');
                if(result > Integer.MAX_VALUE) {
                    break;
                }
            }
        }

        if(flag && result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(!flag && -1 * result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return flag ? (int)result : -1 * (int)result;
        }
    }
}
