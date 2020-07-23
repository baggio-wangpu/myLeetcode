import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElementTest() {
        RemoveElement element = new RemoveElement();

        int[] nums1 = {3,2,2,3};
        int len1 = element.removeElement(nums1, 3);
        assertEquals(2, len1);

        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i]);
        }

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int len2 = element.removeElement(nums2, 2);
        assertEquals(5, len2);

        int[] nums3 = {0,1,2};
        int len3 = element.removeElement(nums3, 3);
        assertEquals(3, len3);

        int[] nums4 = {};
        int len4 = element.removeElement(nums4, 2);
        assertEquals(0, len4);
    }
}
