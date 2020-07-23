import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtracking(list, new ArrayList<>(), s, 0);
        return list;
    }

    private void backtracking(List<List<String>> list, List<String> tempList, String str,
            int start) {
        if(str.length() == start) list.add(new ArrayList<>(tempList));
        else {
            for(int i = start; i < str.length(); i++) {
                if(isPalindrome(str, start, i)) {
                    tempList.add(str.substring(start, i + 1));
                    backtracking(list, tempList, str, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String str, int low, int high) {
        while (low < high)
            if (str.charAt(low++) != str.charAt(high--)) return false;
        return true;
    }
}
