import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputNumData {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P24-1file.txt")); //file used
        int index = -1;

        String[] text = new String[1000];

        while(scanner.hasNext()) {
            index++;
            text[index] = scanner.nextLine();
            //System.out.println(text[index[]);
        }
        scanner.close();

        String answer;
        int sum;

        for (int x = 0; x <=index;x++) {
            Scanner sc = new Scanner(text[x]);
            sum = 0;
            answer = "";

            while (sc.hasNext()) {
                int i = sc.nextInt();
                answer = answer + " + " + i;
                sum = sum + i;
            }
            answer = answer + " = " + sum;
            System.out.println(answer.substring(2));
        }
    }
}
