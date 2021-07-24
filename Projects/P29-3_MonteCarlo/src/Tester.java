public class Tester {
    public static void main(String[] args) {
        MonteCarlo mcObj = new MonteCarlo(5,3,2);
        double cirCount = 0, sqrCount = 0;

        for (long j = 0; j < 1_000_000_000L; j++) {
            double x = mcObj.nextRainDrop_x();
            double y = mcObj.nextRainDrop_y();
            if (mcObj.insideCircle(x,y)) {
                cirCount++;
            }
            sqrCount++;
        }
        double pi = cirCount * Math.pow(2* mcObj.r, 2) / (sqrCount * Math.pow(mcObj.r,2));
        System.out.println(pi);
    }
}
