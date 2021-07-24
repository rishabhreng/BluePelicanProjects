import java.util.Random;

public class GenRandInts {
    public static void main(String[] args) {
        Random randint = new Random();
        int num;
        for (int x = 0; x < 1000; x++) {
            num = 71 + randint.nextInt(29);
            System.out.println(num);
        }
    }
}
