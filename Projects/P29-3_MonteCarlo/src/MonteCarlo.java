import java.util.Random;

public class MonteCarlo {
    public double h,k,r;
    private Random rndm = new Random();

    public MonteCarlo(double h, double k, double r) {
        this.h = h;
        this.k = k;
        this.r = r;
    }

    public double nextRainDrop_x() {
        return (h-r) + (2*r) * rndm.nextDouble();
    }

    public double nextRainDrop_y() {
        return (k-r) + (2*r) * rndm.nextDouble();
    }

    public boolean insideCircle(double x, double y) {
        return Math.pow(x-h, 2) + Math.pow(y-k, 2) <= r*r;
    }

}
