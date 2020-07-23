import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindFirstLastPositionTest {

    @Test
    public void searchRange() {
        int[] nums = {5,7,7,8,8,10};
        FindFirstLastPosition utils = new FindFirstLastPosition();
        int[] res1 = {3,4};
        assertArrayEquals(res1, utils.searchRange(nums, 8));

        int[] res2 = {-1, -1};
        assertArrayEquals(res2, utils.searchRange(nums, 6));

        int[] res3 = {1,2};
        assertArrayEquals(res3, utils.searchRange(nums, 7));

        int[] nums2 = {1,2,3,3,3,3,3,3,5,7,8,9};
        int[] res4 = {2,7};
        assertArrayEquals(res4, utils.searchRange(nums2, 3));

        int[] res5 = {8,8};
        assertArrayEquals(res5, utils.searchRange(nums2, 5));

        int[] res6 = {0,0};
        assertArrayEquals(res6, utils.searchRange(nums2, 1));

        int[] res7 = {11, 11};
        assertArrayEquals(res7, utils.searchRange(nums2, 9));

    }
}