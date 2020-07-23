public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int pos = 0;

        for(; pos < nums.length; pos++) {
            if(nums[pos] < target) continue;
            else if(nums[pos] == target){
                return pos;
            } else {
                break;
            }
        }
        return pos;
    }

//    public int searchInsert(int[] nums, int target) {
//
//        int low = 0, high = nums.length - 1;
//
//        while(low <= high) {
//            int mid = (low + high) / 2;
//            if(target < nums[mid]) low = mid + 1;
//            else if(target > nums[mid]) high = mid - 1;
//            else return mid;
//        }
//        return low;
//    }

}
