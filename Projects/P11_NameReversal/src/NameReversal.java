import java.util.Scanner;

public class NameReversal {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        String name = nameScanner.nextLine().toLowerCase();

        for (int numChar = name.length() - 1; numChar >= 0; numChar--) {
            System.out.print(name.substring(numChar,numChar+1));
        }
    }
}
