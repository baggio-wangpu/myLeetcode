import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void myAtoiTest() {
        StringToInteger utils = new StringToInteger();
        assertEquals(utils.myAtoi("  +0 123"), 0);
        assertEquals(utils.myAtoi("9223372036854775808"), 2147483647);
        assertEquals(utils.myAtoi("3.14159"), 3);
        assertEquals(utils.myAtoi(" 42"), 42);
        assertEquals(utils.myAtoi("   42"), 42);
        assertEquals(utils.myAtoi("   -42"), -42);
        assertEquals(utils.myAtoi("+42"), 42);
        assertEquals(utils.myAtoi(" +42 "), 42);
        assertEquals(utils.myAtoi(" +42 with words"), 42);
        assertEquals(utils.myAtoi("4193 with words"), 4193);
        assertEquals(utils.myAtoi("words and 987"), 0);
        assertEquals(utils.myAtoi("-91283472332"), -2147483648);
        assertEquals(utils.myAtoi("   "), 0);
        assertEquals(utils.myAtoi("words_only"), 0);
        assertEquals(utils.myAtoi("-42andwords"), -42);
        assertEquals(utils.myAtoi("91283472332"), 2147483647);
        assertEquals(utils.myAtoi(" 2147483647"), 2147483647);
        assertEquals(utils.myAtoi(" 2147483648"), 2147483647);
        assertEquals(utils.myAtoi("   2147483648"), 2147483647);
        assertEquals(utils.myAtoi("  -2147483649"), -2147483648);
        assertEquals(utils.myAtoi("+-2"), 0);
        assertEquals(utils.myAtoi("-5-"), -5);
        assertEquals(utils.myAtoi("-+52-+--"), 0);
    }
}