import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void removeDuplicates() {
        RemoveDuplicatesFromSortedArray array = new RemoveDuplicatesFromSortedArray();

        int[] nums = {1,1,1,1,1};
        int len = array.removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }

        System.out.println();
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int len1 = array.removeDuplicates(nums1);
        for (int i = 0; i < len1; i++) {
            System.out.print(nums1[i]);
        }

        System.out.println();
        int[] nums2 = {0, 0, 0};
        int len2 = array.removeDuplicates(nums2);
        for (int i = 0; i < len2; i++) {
            System.out.print(nums2[i]);
        }

        System.out.println();
        int[] nums3 = {1, 1, 2};
        int len3 = array.removeDuplicates(nums3);
        for (int i = 0; i < len3; i++) {
            System.out.print(nums3[i]);
        }
    }
}