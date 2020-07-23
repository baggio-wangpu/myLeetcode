import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {

    @Test
    public void shouldMaskDigitsForBasicCreditCards() {
        assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
        assertEquals("4###########5616", CreditCard.maskify("4556364607935616"));
        assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
        assertEquals("6######5616", CreditCard.maskify("64607935616"));
    }

    @Test
    public void shouldNotMaskDigitsForShortCreditCards() {
        assertEquals("54321", CreditCard.maskify("54321"));
    }

    @Test
    public void shouldNotMaskDigitsCreditCards() {
        assertEquals("ABCD-EFGH-IJKLM-NOPQ", CreditCard.maskify("ABCD-EFGH-IJKLM-NOPQ"));
        assertEquals("Skippy", CreditCard.maskify("Skippy"));
    }

    @Test
    public void shouldNotMaskNullCreditCards() {
        assertEquals("", CreditCard.maskify(""));
    }
}