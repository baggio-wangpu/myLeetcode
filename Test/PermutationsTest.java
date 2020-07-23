import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationsTest {

    @Test
    public void permute() {
        int[] nums = {1,2,3};
        Permutations utils = new Permutations();
        System.out.println(utils.permute(nums));
    }
}