package lab12_OOP_Garage;

public abstract class Vehicle {

    private int id;
    private int numberOfWheels;
    private int numberOfGears;
    private int numberOfDoors;

    public Vehicle(int id, int numberOfWheels, int numberOfGears, int numberOfDoors) {
        this.id = id;
        this.numberOfWheels = numberOfWheels;
        this.numberOfGears = numberOfGears;
        this.numberOfDoors = numberOfDoors;
    }

    // Getters & Setters
    public int getId() { return id; }
    public int getNumberOfWheels() { return numberOfWheels; }
    public int getNumberOfGears() { return numberOfGears; }
    public int getNumberOfDoors() { return numberOfDoors; }

    public void setNumberOfWheels(int wheels) { this.numberOfWheels = wheels; }
    public void setNumberOfGears(int gears) { this.numberOfGears = gears; }
    public void setNumberOfDoors(int doors) { this.numberOfDoors = doors; }

    // Generic methods
    public void topSpeedTest() {
        System.out.println("Generic vehicle top speed test");
    }

    public void passengerLimit() {
        System.out.println("Generic vehicle passenger limit");
    }

    // Abstract method to calculate bill (must be implemented by all child classes)
    public abstract double calcBill();

    @Override
    public String toString() {
        return "ID: " + id + " | Wheels: " + numberOfWheels + " | Gears: " + numberOfGears + " | Doors: " + numberOfDoors;
    }
}
