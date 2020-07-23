public class LengthofLastWord {

    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return 0;
        char[] array = s.toCharArray();
        if(s.length() == 1 && array[0] == ' ') return 0;
        int length = array.length;
        int res = 0;
        boolean flag = false;
        while(length-- > 0) {
            if(array[length] != ' ') {
                res++;
            } else {
                flag = true; //找到' '，则说明有最后一个words，跳出循环
                break;
            }
        }
        return (flag && length >= 0) ? res : (length < 0) ? s.length() : 0;
    }

}
