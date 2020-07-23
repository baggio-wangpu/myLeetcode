import org.junit.Test;

public class CombinationSumTest {

    @Test
    public void combinationSum() {
        int[] nums = {2,3,6,7};
        CombinationSum utils = new CombinationSum();
        System.out.println(utils.combinationSum(nums, 7));
    }
}