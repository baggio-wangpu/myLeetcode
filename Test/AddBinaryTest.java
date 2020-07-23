
import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {

    @Test
    public void addBinary() {
        AddBinary utils = new AddBinary();
        assertEquals("11", utils.addBinary("10", "1"));
        assertEquals("100", utils.addBinary("11", "1"));
        assertEquals("101", utils.addBinary("1", "100"));
        assertEquals("100", utils.addBinary("1", "11"));
        assertEquals("10101", utils.addBinary("1010", "1011"));
        assertEquals("11110", utils.addBinary("1111", "1111"));
    }
}
