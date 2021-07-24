public class Tester {
    public static void main(String args[]) {
        char ch[] = new char[26];

        for (int count = 65; count <=90; count++) {
            ch[count-65] = (char) count;
        }

        System.out.print(ch[0]);
        for (int x = 1; x<26; x++) {
            System.out.print(", " + ch[x]);
        }
    }
}

