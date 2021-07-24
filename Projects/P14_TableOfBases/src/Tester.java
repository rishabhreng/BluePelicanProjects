public class Tester {
    public static void main(String[] args) {
        System.out.println("Decimal     Binary          Octal       Hex         Character");
        for (int j = 65; j<=90; j++) { //increase the control statement for more values
            String jbin = Integer.toBinaryString(j);
            String joct = Integer.toOctalString(j);
            String jhex = Integer.toHexString(j);
            char jchar = (char) j;
            System.out.println(j + "          " + jbin + "         " + joct + "         " + jhex + "          " + jchar);
        }
    }
}
