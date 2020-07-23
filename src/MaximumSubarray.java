public class MaximumSubarray {

    /*
    Input: [-2,1,-3,4,-1,2,1,-5,4],
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
     */
    public int maxSubArray1(int[] nums) {
        if(nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int add = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                add += nums[j];
                int tmp_max = Math.max(nums[i], add);
                max = tmp_max > max ? tmp_max : max;
            }
            max = max > add ? max : add;
        }
        return max;
    }

    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > maxSum) maxSum = sum;
            if(sum <= 0) sum = 0;
        }
        return maxSum;
    }
}
