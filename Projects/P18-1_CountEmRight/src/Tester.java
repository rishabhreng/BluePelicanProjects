import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Type in a sentence and press enter. Type \"exit\" to stop the program. ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                break;
            }

            input = input + " ";
            String []sp = input.split("A|S");
            int occurrences = sp.length - 1;
            System.out.print("There are " + occurrences + " occurrences.\n");
        }
    }
}
