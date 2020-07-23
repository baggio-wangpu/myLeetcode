import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {

    private MaximumSubarray max = new MaximumSubarray();

    @Test
    public void maxSubArray() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, max.maxSubArray(nums));

        int[] nums1 = {1};
        assertEquals(1, max.maxSubArray(nums1));

        int[] nums2 = {-2, 1};
        assertEquals(1, max.maxSubArray(nums2));
    }
}