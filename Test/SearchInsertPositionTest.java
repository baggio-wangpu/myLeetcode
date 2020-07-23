import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {

    @Test
    public void searchInsert() {

        SearchInsertPosition utils = new SearchInsertPosition();
        int[] nums1 = {1,3,5,6};
        assertEquals(2, utils.searchInsert(nums1, 5));

        assertEquals(1, utils.searchInsert(nums1, 2));

        assertEquals(4, utils.searchInsert(nums1, 7));

        assertEquals(0, utils.searchInsert(nums1, 0));

    }
}