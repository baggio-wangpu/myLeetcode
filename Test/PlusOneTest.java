import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void plusOne() {
        PlusOne utils = new PlusOne();
        int[] a = {3,2,1};
        int[] result = utils.plusOne(a);
        for(int i = 0; i < result.length; i++) System.out.print(" " + result[i]);

        int[] b = {1, 9, 9};
        int[] result2 = utils.plusOne(b);
        for(int i = 0; i < result2.length; i++) System.out.print(" " + result2[i]);


        int[] c = {9,9,9,9,9,9};
        int[] result3 = utils.plusOne(c);
        for(int i = 0; i < result3.length; i++) System.out.print(" " + result3[i]);
    }
}
