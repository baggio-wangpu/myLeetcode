import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void letterCombinationsTest() {
        LetterCombinationsOfPhoneNumber combinations = new LetterCombinationsOfPhoneNumber();
        List<String> strings = combinations.letterCombinations("23");
        System.out.println(strings);
    }
}