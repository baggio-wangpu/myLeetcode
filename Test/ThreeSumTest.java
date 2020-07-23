import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        ThreeSum sum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.print(sum.threeSum(nums));

        System.out.println();
        int[] nums1 = {0,-4,-1,-4,-2,-3,2};
        System.out.print(sum.threeSum(nums1));

        System.out.println();
        int[] nums2 = {0,0,0,0};
        System.out.print(sum.threeSum(nums2));
    }
}
