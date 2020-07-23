import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void intToRoman() {
        IntegerToRoman roman = new IntegerToRoman();
        assertEquals("III", roman.intToRoman(3));
        assertEquals("IV", roman.intToRoman(4));
        assertEquals("IX", roman.intToRoman(9));
        assertEquals("LVIII", roman.intToRoman(58));
        assertEquals("MCMXCIV", roman.intToRoman(1994));
        assertEquals("XX", roman.intToRoman(20));
    }
}
