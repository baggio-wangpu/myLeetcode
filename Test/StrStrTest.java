import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StrStrTest {

    @Test
    public void StrStrTest() {
        StrStr string = new StrStr();
        assertEquals(string.strStr("hello", "ll"), 2);
        assertEquals(string.strStr("aaaaa", "bba"), -1);
        assertEquals(string.strStr("aaaaa", ""), 0);
        assertEquals(string.strStr("aaaaaaab", "aaaa"), 0);
        assertEquals(string.strStr("baaaaaab", "aaaa"), 1);
        assertEquals(string.strStr("a", "a"), 0);
    }

}