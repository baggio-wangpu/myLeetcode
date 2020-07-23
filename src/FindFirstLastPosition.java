public class FindFirstLastPosition {

    /*
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
     */
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int[] res = {-1, -1};

        if (start > end || target < nums[start] || target > nums[end]) {
            return res;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                //解决重复问题
                int first = mid, last = mid;
                for(; first >= 0 && nums[first] == target; first--);
                for(; last <= nums.length - 1 && nums[last] == target; last++);
                res[0] = first + 1;
                res[1] = last - 1;
                break;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
