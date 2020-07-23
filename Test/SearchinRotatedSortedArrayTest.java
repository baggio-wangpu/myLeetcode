import org.junit.Test;

import static org.junit.Assert.*;

public class SearchinRotatedSortedArrayTest {

    @Test
    public void search() {
        SearchinRotatedSortedArray utils = new SearchinRotatedSortedArray();
        int[] nums = {6,7,0,1,2,4,5};
        assertEquals(2, utils.search(nums, 0));
    }
}