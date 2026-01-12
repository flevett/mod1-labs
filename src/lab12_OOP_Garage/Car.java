package lab12_OOP_Garage;

public class Car extends Vehicle implements Refuelable, Chargeable {

    private boolean isElectric;

    public Car(int id, int wheels, int gears, int doors, boolean isElectric) {
        super(id, wheels, gears, doors);
        this.isElectric = isElectric;
    }

    // Getter & Setter
    public boolean isElectric() { return isElectric; }
    public void setElectric(boolean electric) { isElectric = electric; }

    // Override Vehicle methods
    @Override
    public void topSpeedTest() {
        if (isElectric) System.out.println("Electric car top speed: 90mph");
        else System.out.println("Petrol car top speed: 120mph");
    }

    @Override
    public void passengerLimit() {
        System.out.println("Car passenger limit: 5");
    }

    @Override
    public String toString() {
        return super.toString() + " | Electric: " + isElectric;
    }

    @Override
    public double calcBill() {
        double bill = 100;
        if (isElectric) bill += 50;
        return bill;
    }

    // ✅ Implement Refuelable
    @Override
    public void refuel() {
        if (!isElectric) System.out.println("Refueling petrol car...");
    }

    // ✅ Implement Chargeable
    @Override
    public void charge() {
        if (isElectric) System.out.println("Charging electric car...");
    }
}
