public class Tester {
    public static void main(String[] args) {
        int a [][] = {
                 {1, 2, -2, 0},
                 {-3, 4, 7, 2},
                 {6, 0, 3, 1}
        };
        int b[][] = {
                {-1, 3},
                {0, 9},
                {1,-11},
                {4, -5}
        };


        int[][] multResult = MatrixMult.mult(a, b);

        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y <b[0].length; y++) {
                System.out.print(multResult[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
