import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitioningTest {

    @Test
    public void partition() {
        PalindromePartitioning utils = new PalindromePartitioning();
        String str = "aab";
        System.out.println(utils.partition(str));
    }
}