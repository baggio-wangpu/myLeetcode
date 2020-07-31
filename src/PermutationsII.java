import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationsII {

    /*
    Input: [1,1,2]
    Output:
    [
    [1,1,2],
    [1,2,1],
    [2,1,1]
    ]
     */
    public List<List<Integer>> permuteUnique(int[] nums) {

            List<List<Integer>> list = new ArrayList<>();
            backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
            return list;
        }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
        if(tempList.size() == nums.length /* && !list.contains(tempList) */) {
            list.add(new ArrayList<>(tempList));
        } else {
            for(int i = 0; i < nums.length; i++) {
                //if(used[i]) continue;
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                tempList.add(nums[i]);
                used[i] = true;
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
        Arrays.sort(nums);
    }
}
