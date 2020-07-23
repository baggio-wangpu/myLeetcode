import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {

    @Test
    public void evalRPN() {
        ReversePolishNotation notation = new ReversePolishNotation();
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertEquals(9, notation.evalRPN(tokens));

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        assertEquals(6, notation.evalRPN(tokens2));

        String[] token3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, notation.evalRPN(token3));

        String[] tokens4 = {"2"};
        assertEquals(2, notation.evalRPN(tokens4));

    }
}