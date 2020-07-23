import org.junit.Test;

import static org.junit.Assert.*;

public class LengthofLastWordTest {

    private LengthofLastWord utils = new LengthofLastWord();

    @Test
    public void lengthOfLastWord() {
        assertEquals(5, utils.lengthOfLastWord("Hello World"));
        assertEquals(5, utils.lengthOfLastWord("Hello"));
        assertEquals(1, utils.lengthOfLastWord("Hello W A B"));
        assertEquals(0, utils.lengthOfLastWord(""));
        assertEquals(1, utils.lengthOfLastWord("A"));
        assertEquals(1, utils.lengthOfLastWord(" A"));
        assertEquals(0, utils.lengthOfLastWord("A "));

    }
}