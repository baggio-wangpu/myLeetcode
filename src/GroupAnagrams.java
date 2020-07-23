import java.util.*;

public class GroupAnagrams {

    /*
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
    Output:
    [
        ["ate","eat","tea"],
        ["nat","tan"],
        ["bat"]
]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> ans = new HashMap<>();

        for(String s : strs) {
            char[] cur = s.toCharArray();
            Arrays.sort(cur);
            String key = String.valueOf(cur);
            if(!ans.containsKey(key)) ans.put(key, new ArrayList<>());
            ans.get(key).add(s);
        }
        return new ArrayList<List<String>>(ans.values());
    }
}
