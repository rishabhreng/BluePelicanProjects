import java.util.Arrays;

public class AscendDescend {
    public static void main(String[] args) {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        System.out.println("Ascend\t\tDescend\n");
        for (int x = 0; x<ss.length;x++) {
            if (ss[x].equals("Lee")) {
               System.out.println(ss[x] + "\t\t\t" + ss[ss.length-x-1]);
            }
            else
            System.out.println(ss[x] + "\t\t" + ss[ss.length-x-1]);
        }
    }
}
