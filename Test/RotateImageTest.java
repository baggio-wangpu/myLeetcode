import org.junit.Test;

import static org.junit.Assert.*;

public class RotateImageTest {

    @Test
    public void rotate() {
        RotateImage utils = new RotateImage();
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        utils.rotate(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}