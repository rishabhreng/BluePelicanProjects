// skeleton for reading/processing external files
import java.io.*;
import java.util.*;
import java.text.*;

public class BaseClass {
    public static void main(String[] args) throws IOException {
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);

        Scanner sf = new Scanner(new File("")); //fill in file name in particular project
        int maxIndex = -1;
        String text[] = new String[1000];

        while (sf.hasNext()) {
            maxIndex++;
            text[maxIndex] = sf.nextLine();
        }
        sf.close();

        for (int x = 0; x <= maxIndex; x++) {

            //use one of the following

            //StringTokenizer st = new StringTokenizer(text[x]);
            //Scanner sc = new Scanner(text[x]);

            //add code here


        }
    }
}
