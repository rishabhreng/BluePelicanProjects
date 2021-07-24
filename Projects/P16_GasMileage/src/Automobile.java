public class Automobile {


    public Automobile(double mileage)    {
        mpg=mileage;
        gallons = 0;
        totalMiles=mpg*gallons;
    }

    public void fillUp(double gasAdded)    {
        gallons+=gasAdded;
        totalMiles=mpg*gallons;
    }

    public void takeTrip(double milesDriven)    {
        totalMiles-=milesDriven;
    }

    public double reportFuel() {
        return totalMiles/mpg;
    }

    private double mpg;
    double gallons;
    private double totalMiles;
}
