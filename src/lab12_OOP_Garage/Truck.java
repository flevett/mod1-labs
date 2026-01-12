package lab12_OOP_Garage;

public class Truck extends Vehicle {

    private double maxLoad;

    public Truck(int id, int wheels, int gears, int doors, double maxLoad) {
        super(id, wheels, gears, doors);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public void topSpeedTest() {
        System.out.println("Truck top speed: 70mph");
    }

    @Override
    public void passengerLimit() {
        System.out.println("Truck passenger limit: 3");
    }

    @Override
    public String toString() {
        return super.toString() + " | Max load: " + maxLoad + " tons";
    }

    @Override
    public double calcBill() {
        double bill = 150; // base cost for truck
        bill += maxLoad * 10; // cost depends on max load
        return bill;
    }

}
