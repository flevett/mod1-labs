package lab12_OOP_Garage;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Vehicle car = new Car(1, 4, 6, 4, true);
        Vehicle bike = new Motorbike(2, 2, 5, 0, false);
        Vehicle truck = new Truck(3, 6, 8, 2, 12.5);

        garage.addVehicle(car);
        garage.addVehicle(bike);
        garage.addVehicle(truck);

//        // Try to find a vehicle by ID
//        try {
//            Vehicle foundVehicle = garage.findVehicleById(5); // ID not in garage
//            System.out.println("Found: " + foundVehicle);
//        } catch (VehicleNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

//        // Print total bill for all vehicles
//        double totalBill = garage.calculateTotalBill();
//        System.out.println("Total bill for all vehicles in garage: $" + totalBill);
//
//        //print individual bills per vehicle
//        for (Vehicle v : garage.getVehicles()) {
//            System.out.println(v + " | Bill: $" + v.calcBill());
//        }

//        try {
//            double bill = garage.calculateBillById(1); // ID that exists
//            System.out.println("Bill for vehicle ID 1: $" + bill);
//        } catch (VehicleNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            Vehicle removed = garage.removeVehicleById(2);
//            System.out.println("Removed vehicle: " + removed);
//        } catch (VehicleNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            double carBill = garage.calculateBillBasedOnType(Car.class);
//            System.out.println("Total bill for all cars: $" + carBill);
//        } catch (VehicleNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

        // ==============================
        // Interface-based demonstration
        // ==============================
        System.out.println("\n=== Refuel all vehicles ===");
        for (Vehicle v : garage.getVehicles()) {
            if (v instanceof Refuelable r) {
                r.refuel(); // call refuel on all refuelable vehicles
            }
        }

        System.out.println("\n=== Charge all vehicles ===");
        for (Vehicle v : garage.getVehicles()) {
            if (v instanceof Chargeable c) {
                c.charge(); // call charge on all chargeable vehicles
            }
        }

    }
}
