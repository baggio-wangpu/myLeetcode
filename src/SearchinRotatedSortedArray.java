public class SearchinRotatedSortedArray {

    /*
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
    [7,0,1,2,4,5,6] target = 1  out = 2
    [5,6,7,0,1,2,4]

    [0,1,2,4,5,6,7]
    [7,0,1,2,4,5,6]
    [6,7,0,1,2,4,5]
    [5,6,7,0,1,2,4]
    [4,5,6,7,0,1,2]
    [2,4,5,6,7,0,1]
    中间的数字比右边小，则右边为上升序列
    中间数字比右边大，则左边为上升序列
    先比较中间数字是否等于target，不等于，则对对应的分块进行二分查找
     */
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < nums[end]) {
                //在右边部分
                if (nums[mid] < target && nums[end] >= target) start = mid + 1;
                else end = mid - 1;
            } else {
                if(nums[start] <= target && nums[mid] > target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
