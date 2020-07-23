import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumIITest {

    @Test
    public void combinationSum2() {
        int[] nums = {10,1,2,7,6,1,5};
        CombinationSumII utils = new CombinationSumII();
        System.out.println(utils.combinationSum2(nums, 8));
    }
}