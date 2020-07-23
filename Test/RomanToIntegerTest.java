import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void romanToInt() {
        RomanToInteger roman = new RomanToInteger();
        assertEquals(3, roman.romanToInt("III"));
        assertEquals(4, roman.romanToInt("IV"));
        assertEquals(9, roman.romanToInt("IX"));
        assertEquals(58, roman.romanToInt("LVIII"));
        assertEquals(1994, roman.romanToInt("MCMXCIV"));
        assertEquals(952, roman.romanToInt("CMLII"));
        assertEquals(991, roman.romanToInt("CMXCI"));
    }
}