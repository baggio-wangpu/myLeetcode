import org.junit.Test;

import static org.junit.Assert.*;

public class SubsetsIITest {

    @Test
    public void subsetsWithDup() {
        int[] nums = {1, 2, 2};
        SubsetsII utils = new SubsetsII();
        System.out.println(utils.subsetsWithDup(nums));

    }
}