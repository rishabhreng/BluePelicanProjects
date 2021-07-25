import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName=scanner.nextLine();
        System.out.print("What is your last name? ");
        String lastName=scanner.nextLine();
        System.out.println("Your full name is " + firstName + " " + lastName + ".");
    }
}
