import org.junit.Test;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams utils = new GroupAnagrams();
        System.out.println(utils.groupAnagrams(strs));
    }
}