import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsIITest {

    @Test
    public void permuteUnique() {
        int[] nums = {1,1,2};
        PermutationsII utils = new PermutationsII();
        System.out.println(utils.permuteUnique(nums));
    }
}