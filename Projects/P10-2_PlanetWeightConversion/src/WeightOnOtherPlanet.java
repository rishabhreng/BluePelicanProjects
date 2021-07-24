import java.util.Scanner;

public class WeightOnOtherPlanet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight on Earth: ");
        double weight = scanner.nextDouble();

        /*
        System.out.println("\n1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
         */
        System.out.println("\n1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Earth"); // no one should logically select this option
        System.out.println("4. Mars");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturn");
        System.out.println("7. Uranus");
        System.out.println("8. Neptune");
        System.out.println("9. Pluto");


        System.out.println("\nWhich planet do you want to use to convert your weight? " +
                "\nAnswer with the corresponding digit: ");
        int planetChoice = scanner.nextInt();
        double weightAdjusted = weight / 9.81;  // adjusted for gravity

        switch (planetChoice) {

            case 1:
                System.out.println("Your weight on Mercury would be " + (weightAdjusted * 3.70) + ".");
                break;
            case 2:
                System.out.println("Your weight on Venus would be " + (weightAdjusted * 8.87) + ".");
                break;
            case 3:
                System.out.println(" Were you paying attention? You weren't supposed to choose this." +
                                   "\nAnyways, Your weight on Earth would be " + (planetChoice) + ".");
                break;
            case 4:
                System.out.println("Your weight on Mars would be " + (weightAdjusted * 3.711) + ".");
                break;
            case 5:
                System.out.println("Your weight on Jupiter would be " + (weightAdjusted * 24.79) + ".");
                break;
            case 6:
                System.out.println("Your weight on Saturn would be " + (weightAdjusted * 10.44) + ".");
                break;
            case 7:
                System.out.println("Your weight on Uranus would be " + (weightAdjusted * 8.69) + ".");
                break;
            case 8:
                System.out.println("Your weight on Neptune would be " + (weightAdjusted * 11.15) + ".");
                break;
            case 9:
                System.out.println("Your weight on Pluto would be " + (weightAdjusted * 0.62) + ".");
                break;
            default:
                System.out.println("You need to type an integer from the choices given above.");
        }




        }


    }
