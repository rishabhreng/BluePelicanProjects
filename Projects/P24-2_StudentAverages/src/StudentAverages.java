import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StudentAverages {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P24-2file.txt"));

        String[] text = new String[1000];
        int index = -1;

        while (scanner.hasNext()) {
            index++;
            text[index] = scanner.nextLine();
           // System.out.println(text[index]); test
        }

        for (int x = 0; x <=index; x++) {
            Scanner splitter = new Scanner(text[x]);
            scanner.useDelimiter("[A-Za-z]\\s");
            String[] split = new String[100];
            split[0] = splitter.next();
            split[1] = splitter.nextLine();
            // System.out.println(split[0]);
            // System.out.println(split[1]);

            Scanner parseDouble = new Scanner(split[1]);
            double sum = 0;
            double numOfNums =0;
            while(parseDouble.hasNext()) {
                double i = parseDouble.nextDouble();
                sum += i;
                numOfNums++;
            }
            int average = (int) Math.round(sum/numOfNums);

            System.out.println(split[0] + ", average = " + average);
       }
        
    }
}
