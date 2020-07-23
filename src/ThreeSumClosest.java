import java.util.Arrays;

public class ThreeSumClosest {

    public int threeSumClosest1(int[] nums, int target) {

        int result = nums[0] + nums[1] + nums[2];


        for(int i = 0; i < nums.length - 2; i++)
            for(int j = i + 1; j < nums.length; j++)
                for(int k = j + 1; k < nums.length; k++)
                    if(nums[i] + nums[j] + nums[k] == target) return target;
                    else if(Math.abs(target - nums[i] - nums[j] - nums[k]) < Math.abs(target - result)){
                        result = nums[i] + nums[j] + nums[k];
                    }
        return result;
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];

        for(int i = 0; i < nums.length - 2; i++) {

            int low = i + 1;
            int high = nums.length - 1;
            while(low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if(sum == target) return target;
                if(sum > target) {
                    high--;
                } else {
                    low++;
                }
                if(Math.abs(target - result) > Math.abs(target - sum)) {
                    result = sum;
                }
            }
        }
        return result;
    }

}
