public class Tester {
    public static void main(String[] args) {
        Circle cir1 = new Circle(35.5);
        Circle cir2 = new Circle(20.6);
        Circle cir3 = new Circle(12.7);
        System.out.println(cir1.diameter());
        System.out.println(cir2.area());
        System.out.println(cir3.circumference());
    }
}
