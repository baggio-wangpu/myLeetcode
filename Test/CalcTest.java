import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    private Calc calc = new Calc();
    @Test
    public void shouldWorkForAnEmptyString() {
        assertEquals(0, calc.evaluate(""), 0);
    }
    @Test
    public void shouldParseNumbers() {
        assertEquals(3, calc.evaluate("1 2 3"), 0);
    }
    @Test
    public void shouldParseFloats() {
        assertEquals(3.5, calc.evaluate("1 2 3.5"), 0);
    }
    @Test
    public void shouldSupportAddition() {
        assertEquals(4, calc.evaluate("1 3 +"), 0);
    }
    @Test
    public void shouldSupportMultiplication() {
        assertEquals(3, calc.evaluate("1 3 *"), 0);
    }
    @Test
    public void shouldSupportSubtraction() {
        assertEquals(-2, calc.evaluate("1 3 -"), 0);
    }
    @Test
    public void shouldSupportDivision() {
        assertEquals(2, calc.evaluate("4 2 /"), 0);
    }
    @Test
    public void shouldSupportMulti() {
        assertEquals(6, calc.evaluate("4 10 5 / +"), 0);
    }
}