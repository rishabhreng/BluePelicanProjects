import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MatrixMultInput {
    public static void main(String[] args) throws IOException {

        Scanner sf = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P34-2file.txt"));
        int maxIndex = -1;
        String[] text = new String[1000];


        //reads each line into text array
        while (sf.hasNext()) {
            maxIndex++;
            text[maxIndex] = sf.nextLine();
        }
        sf.close();

        int[][] mat1 = new int[3][4];
        int[][] mat2 = new int[4][2];


        for (int x = 0; x <= maxIndex; x++) {
            Scanner sc = new Scanner(text[x]);
            String string = sc.nextLine();

            while (string.equals("matrix")) {
                while (sc.nextLine().equals("row")) {
                    mat1[x] = new int[4];

                }
            }
        }
    }
}