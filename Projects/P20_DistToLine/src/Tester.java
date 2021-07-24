import java.util.Scanner;

public class Tester {
    public static void main(String args[]) {
        Scanner coords = new Scanner(System.in);
        System.out.print("Enter the A value for the line: ");
        DistToLine.A = coords.nextDouble();
        System.out.print("Enter the B value for the line: ");
        DistToLine.B = coords.nextDouble();
        System.out.print("Enter the C value for the line: ");
        DistToLine.C = coords.nextDouble();

        System.out.print("Enter the x value for the line: ");
        double x = coords.nextDouble();
        System.out.print("Enter the y value for the line: ");
        double y = coords.nextDouble();

        System.out.println("Distance from the point to the next line is: " + DistToLine.getDist(x,y));
    }
}
