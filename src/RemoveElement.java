public class RemoveElement {

    /*
    public int removeElement(int[] nums, int val) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int num = 0;  //find element number
        int index = 0;

        while(index < nums.length - num) {

            if(nums[index] == val) {
                for(int j = index + 1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                num++;
            } else {
                index++;
            }
        }
        return index;
    }
    */

    public int removeElement(int[] nums, int val) {

        int index = 0; //find element index
        for(int n : nums) {
            if(n != val) {
                nums[index++] = n;
            }
        }
        return index;
    }
}
