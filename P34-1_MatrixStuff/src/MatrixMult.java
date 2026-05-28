public class MatrixMult {
    public static int[][] mult(int[][] a, int[][] b) {
        int row_A = a.length, row_B = b.length, col_A = a[0].length, col_B = b[0].length;
        int[][] result = new int[row_A][col_B];

        for (int x = 0; x < row_A; x++) {
            for (int y = 0; y < col_B; y++) {
                for (int num_time = 0; num_time < row_B; num_time++) {
                    result[x][y] += a[x][num_time] * b[num_time][y];
                }
            }
        }
        return result;

    }
}

