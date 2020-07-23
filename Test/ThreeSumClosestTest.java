import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {

        ThreeSumClosest utils = new ThreeSumClosest();
        int[] nums1 = {-1, 2, 1, -4};
        assertEquals(2, utils.threeSumClosest(nums1, 1));

        int[] nums2 = {1, 1, 1, 0};
        assertEquals(2, utils.threeSumClosest(nums2, -100));
    }
}
