import org.junit.Test;

import static org.junit.Assert.*;

public class ChallengeTest {

        @Test
        public void shouldHandleSingleDigits() {
            assertEquals("1st", Challenge.numberToOrdinal(1));
            assertEquals("2nd", Challenge.numberToOrdinal(2));
            assertEquals("3rd", Challenge.numberToOrdinal(3));
            assertEquals("21st", Challenge.numberToOrdinal(21));
            assertEquals("100th", Challenge.numberToOrdinal(100));
            assertEquals("11th", Challenge.numberToOrdinal(11));
            assertEquals("12th", Challenge.numberToOrdinal(12));
            assertEquals("101st", Challenge.numberToOrdinal(101));
        }
}