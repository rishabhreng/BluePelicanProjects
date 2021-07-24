// skeleton for reading/processing external files
import java.io.*;
import java.util.*;
import java.text.*;

public class Gym {
    public static void main(String[] args) throws IOException {
        NumberFormat fmt = NumberFormat.getNumberInstance();
        fmt.setMinimumFractionDigits(3);
        fmt.setMaximumFractionDigits(3);

        Scanner sf = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P26-2file.txt")); //fill in file name in particular project
        int maxIndex = -1;
        String[] text = new String[1000];

        while (sf.hasNext()) {
            maxIndex++;
            text[maxIndex] = sf.nextLine();
        }
        sf.close();

        double[] numList = new double[10];

        for (int x = 0; x <= maxIndex; x++) {
            Scanner scLine = new Scanner(text[x]);
            String line = scLine.nextLine();

            Scanner scDouble = new Scanner(line);
            scDouble.useDelimiter("\\s");
            for (int j = 0; j<10; j++) {
                numList[j] = Double.parseDouble(scDouble.next());
            }

            Arrays.sort(numList);

            double sum = 0;

            for (int i = 1; i < 9; i++) {
                sum += numList[i];
            }

            double average = sum/(numList.length-2);
            System.out.printf("For Competitor #" + x + ", the average is %.4f", average);
            System.out.println();
        }
    }
}
