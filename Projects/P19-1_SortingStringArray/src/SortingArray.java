import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        //System.out.print(Arrays.toString(ss));

        for (String name:ss) {
            System.out.println(name);
        }
   }
}
