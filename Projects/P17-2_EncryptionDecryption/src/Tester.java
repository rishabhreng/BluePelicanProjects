import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.print("Enter a sentence to be encrypted: ");
        String sntnc = kbReader.nextLine();
        System.out.println("Original sentence = " + sntnc);

        Crypto myCryptObj = new Crypto();
        String encryptdSntnc = myCryptObj.encrypt(sntnc);
        System.out.println("Encrypted sentence = " + encryptdSntnc);

        //String decryptedSntnc = myCryptObj.decrypt(encryptdSntnc);
        //System.out.println("Decrypted sentence = " + decryptedSntnc);
    }
}
