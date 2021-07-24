import java.util.Random;

public class GenRandDoubles {
    public static void main(String[] args) {
        double num;
        Random randDouble = new Random();

        for (int x = 0; x < 27; x++) {
            num = 99.78 + (randDouble.nextDouble() * 48.44);
            System.out.println(num);
        }

    }
}
