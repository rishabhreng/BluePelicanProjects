import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); //use long type for classifier + method for larger integers

        if (num%2 ==1) { //odd
            System.out.println("The integer " + num + " is odd.");
        }
        else //even
            System.out.println("The integer " + num + " is even.");
    }
}
