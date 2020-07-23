import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefixTest() {

        LongestCommonPrefix prefix = new LongestCommonPrefix();
        String[] strs1 = {"flower","flow","flight"};
        assertEquals(prefix.longestCommonPrefix(strs1), "fl");
        String[] strs2 = {"dog","racecar","car"};
        assertEquals(prefix.longestCommonPrefix(strs2), "");
        String[] strs3 = {"dog", "cat"};
        assertEquals(prefix.longestCommonPrefix(strs3), "");
        String[] strs4 = {"mall", "malls", "mal", "mals"};
        assertEquals(prefix.longestCommonPrefix(strs4), "mal");

        String[] strs5 = {"small"};
        assertEquals(prefix.longestCommonPrefix(strs5), "small");

        String[] strings = {"aca","cba"};
        assertEquals("", prefix.longestCommonPrefix(strings));
    }
}