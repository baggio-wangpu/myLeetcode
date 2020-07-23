import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsTest {

    @Test
    public void subsets() {
        int[] nums = {1, 2, 3};
        Subsets utils = new Subsets();
        System.out.println(utils.subsets(nums));
    }
}