public class Tester {
    public static void main(String[] args) {
        Automobile myCar = new Automobile(25);

        myCar.fillUp(20);
        myCar.takeTrip(100);
        System.out.println(myCar.reportFuel() + " gallons");
    }
}
