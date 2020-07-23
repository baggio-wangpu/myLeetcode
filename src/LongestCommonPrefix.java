public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        if(strs.length == 1) {
            return strs[0];
        }

        String result = "";
        int totalNum = strs.length;
        boolean flag = false;

        for(int i = 0; i < strs[0].length(); i++) {
            int num = 0;
            for(String s : strs) {
                if(s.length() <= i || !s.substring(0, i + 1).equals(strs[0].substring(0, i + 1))) {
                    flag = true;
                    break;
                } else {
                    num++;
                    if(num == totalNum) {
                        if(strs[0].substring(0, i + 1).length() > result.length()) {
                            result = strs[0].substring(0, i + 1);
                            num = 0;
                        }
                    }
                }
            }
            if(flag) break;
        }
        return result;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

}
