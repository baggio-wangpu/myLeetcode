import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationSequenceTest {

    @Test
    public void getPermutation() {
        PermutationSequence utils = new PermutationSequence();
        assertEquals("213", utils.getPermutation(3, 3));
    }
}