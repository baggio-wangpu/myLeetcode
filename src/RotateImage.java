public class RotateImage {
    /*
     * clockwise rotate
     * first reverse up to down, then swap the symmetry
     * 1 2 3     7 8 9     7 4 1
     * 4 5 6  => 4 5 6  => 8 5 2
     * 7 8 9     1 2 3     9 6 3
     */
    public void rotate(int[][] matrix) {
        swapRows(matrix);
        transpose(matrix);
    }

    private void swapRows(int[][] matrix) {
        int lo = 0;
        int hi = matrix.length - 1;
        while(lo < hi) {
            int[] tmp = matrix[lo];
            matrix[lo++] = matrix[hi];
            matrix[hi--] = tmp;
        }
    }

    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
    }
}
