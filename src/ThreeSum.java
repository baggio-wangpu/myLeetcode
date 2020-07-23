import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            int cursor = nums[i];
            if(i > 0 && (nums[i] == nums[i-1])) continue;
                for (int j = i + 1; j < nums.length; j++) {
                    if(j > i+1 && (nums[j] == nums[j-1])) continue;
                    int p = nums[j];
                    int rest = 0 - cursor - p;
                    if (Arrays.binarySearch(nums, j + 1, nums.length, rest) > 0) {
                        res.add(Arrays.asList(cursor, p, rest));
                    }
                }
        }
        return res;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                        while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                        lo++; hi--;
                    } else if (nums[lo] + nums[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
