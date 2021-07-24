import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Make your arithmetic selection from the choices below: \n");

        System.out.println("    Addition");
        System.out.println("    Subtraction");
        System.out.println("    Multiplication");
        System.out.println("    Division\n");

        System.out.print("    Your choice? ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        System.out.print("\nEnter first operand.");
        double op1 = scanner.nextDouble();
        System.out.print("\nEnter second operand.");
        double op2 = scanner.nextDouble();

        System.out.println(" ");

        switch (choice) { //the actual calculation

            case "Addition":
            case "addition":
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
                break;
            case "Subtraction":
            case "subtraction":
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
                break;
            case "Multiplication":
            case "multiplication":
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
                break;
            case "Division":
            case "division":
                System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
                break;
            default:
                System.out.println("Hey dummy, enter only Addition, Multiplication, Subtraction, or Division!");
        }
    }
}
