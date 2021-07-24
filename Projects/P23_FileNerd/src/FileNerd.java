// uses a file described below

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileNerd {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\Users\\imren\\Desktop\\Games + Programming\\Java\\TextDocs for Projects\\P23file.txt")); //file

        int index = -1;
        String[] list = new String[1000];
        while (scanner.hasNext()) {
            index++;
            list[index] = scanner.nextLine();
        }

        for(int x = 0; x <= index; x++) {
            if (list[x].startsWith("The")) {
                System.out.println(list[x]);
            }
        }

        scanner.close();
    }
}
