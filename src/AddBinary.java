public class AddBinary {

    public String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int capture = 0;

        for(int i = a.length() - 1, j = b.length() - 1; j >= 0 && i >= 0 ;) {
            if(a.charAt(i) - '0' + b.charAt(j) - '0' + capture >= 2) {
                sb.append(a.charAt(i) - '0' + b.charAt(j) - '0' + capture - 2);
                capture = 1;
            } else {
                sb.append(a.charAt(i) - '0' + b.charAt(j) - '0' + capture);
                capture = 0;
            }
            i--;
            j--;
            if(j < 0) {
                while(i >= 0) {
                    if(a.charAt(i) - '0' + capture == 2) {
                        sb.append(a.charAt(i) - '0' + capture - 2);
                        capture = 1;
                    } else {
                        sb.append(a.charAt(i) - '0' + capture);
                        capture = 0;
                    }
                    i--;
                }
                if(capture == 1) sb.append('1');
                break;
            }
            if(i < 0) {
                while(j >= 0) {
                    if(b.charAt(j) - '0' + capture == 2) {
                        sb.append(b.charAt(j) - '0' + capture - 2);
                        capture = 1;
                    } else {
                        sb.append(b.charAt(j) - '0' + capture);
                        capture = 0;
                    }
                    j--;
                }
                if(capture == 1) sb.append('1');
                break;
            }
        }

        return sb.reverse().toString();
    }

}
