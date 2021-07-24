// P24-2 but writes output to a txt file
// go to the file name in line 12 to find the output
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentAverages {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P24-2file.txt"));
        FileWriter fw = new FileWriter("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P25file.txt");
        PrintWriter output = new PrintWriter(fw);


        String[] text = new String[1000];
        int index = -1;

        while (scanner.hasNext()) {
            index++;
            text[index] = scanner.nextLine();
            // System.out.println(text[index]); test
        }

        for (int x = 0; x <=index; x++) {
            Scanner splitter = new Scanner(text[x]);
            splitter.useDelimiter("\\s");
            String name = splitter.next();
            String numList = splitter.nextLine();
            // System.out.println(split[0]);
            // System.out.println(split[1]);

            Scanner parsingDouble = new Scanner(numList); // average of the nums
            double sum = 0;
            double numOfNums =0;
            while(parsingDouble.hasNext()) {
                double i = parsingDouble.nextDouble();
                sum += i;
                numOfNums++;
            }
            int average = (int) Math.round(sum/numOfNums);

            //System.out.println(name + ", average = " + average);
            output.println(name + ", average = " + average);


        }

        output.close();
        fw.close();
    }
}
