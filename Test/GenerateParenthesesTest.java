import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
        GenerateParentheses util = new GenerateParentheses();
        System.out.println(util.generateParenthesis(4));
    }
}