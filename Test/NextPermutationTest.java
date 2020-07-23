import org.junit.Test;

import static org.junit.Assert.*;

public class NextPermutationTest {

    @Test
    public void nextPermutation() {
        int[] nums = {1,2,3};
        NextPermutation permutation = new NextPermutation();
        permutation.nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }

        System.out.println();

        int[] nums2 = {1, 3, 2};
        permutation.nextPermutation(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i]);
        }
    }
}