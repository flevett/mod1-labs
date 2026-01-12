package lab12_OOP_Garage;

public class Motorbike extends Vehicle {

    private boolean hasSidecar;

    public Motorbike(int id, int wheels, int gears, int doors, boolean hasSidecar) {
        super(id, wheels, gears, doors);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void topSpeedTest() {
        System.out.println("Motorbike top speed: 140mph");
    }

    @Override
    public void passengerLimit() {
        System.out.println(hasSidecar ? "2 passengers" : "1 passenger");
    }

    @Override
    public String toString() {
        return super.toString() + " | Sidecar: " + hasSidecar;
    }

    @Override
    public double calcBill() {
        double bill = 50; // base cost
        if (hasSidecar) bill += 20; // extra if it has a sidecar
        return bill;
    }

}
