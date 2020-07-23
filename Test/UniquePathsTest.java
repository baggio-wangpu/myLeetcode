import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {

    private UniquePaths util = new UniquePaths();

    @Test
    public void uniquePaths() {
        assertEquals(3, util.uniquePaths(3,2));
        assertEquals(28, util.uniquePaths(7, 3));
    }
}