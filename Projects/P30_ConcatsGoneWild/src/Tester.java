public class Tester {
    public static void main(String[] args) {
        String t1 = cat(68,108);
        System.out.println(t1);
        
        String t2 = cat(35,59);
        System.out.println(t2);
    }

    private static String cat(int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int x = start; x <= end; x++) sb.append( (char) x);
        return sb.toString();
    }
}
