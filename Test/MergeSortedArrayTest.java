import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        MergeSortedArray utils = new MergeSortedArray();

        int[] num1 = {4,5,6,0,0,0};
        int[] num2 = {1,2,3};

        utils.merge(num1, 3, num2, 3);

        for(int index : num1) {
            System.out.print(" " + index);
        }

        int[] num3 = {0};
        int[] num4 = {1};

        utils.merge(num3, 0, num4, 1);

        for(int index : num3) {
            System.out.print(" " + index);
        }


        int[] num5 = {1,2,3,0,0,0};
        int[] num6 = {2,5,6};

        utils.merge(num5, 3, num6, 3);

        for(int index : num5) {
            System.out.print(" " + index);
        }

    }
}
