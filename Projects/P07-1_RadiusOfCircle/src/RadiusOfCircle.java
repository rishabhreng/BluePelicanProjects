import java.util.Scanner;

public class RadiusOfCircle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the area? ");
        double area = scanner.nextDouble();

        double radius = Math.sqrt(area/Math.PI);
        System.out.println("Radius of your circle is " + radius + ".");
    }
}
