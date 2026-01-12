package lab12_OOP_Garage;
// declaring the package the file is inside of

import java.util.ArrayList;
//importing methods that exist in java

public class Garage {
//new class called garage, public so it can be accessed elsewhere

    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    //an array of vehicles, made using the imported java methods

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    // a method for adding a new vehicle to the empty array

    public ArrayList<Vehicle> findVehiclesByType(Class<?> type) {
        //ArrayList is the return type of the method, findVehicleBtType is the name, Class<?>
        //is the runtime class object passed to the method. So if you passed car.class, then the Car.java
        //class would be the parameter

        ArrayList<Vehicle> result = new ArrayList<>();
        //makes a new list as to not mess up the original, this wil be returned at the end of the method

        for (Vehicle v : vehicles) {
            //for object references as a vehicle in the vehicles list
            if (type.isInstance(v)) {
                //is v (current iterated item in list) an instance of the class stored in the type parameter passed to method
                result.add(v);
                //then add the current iterated item to our new array we made
            }
        }

        return result;
        //return the new array we made, now containing all objects that are instances of the specified class in the parameter when the
        //method was called
    }

    public Vehicle findVehicleById(int id) throws VehicleNotFoundException {
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                return v;
            }
        }
        // If we reach here, no vehicle was found, so throw our custom exception
        throw new VehicleNotFoundException("Vehicle with ID " + id + " not found");
    }

    //locates the vehicle in the array by its id, returning to caller

    public double calculateTotalBill() {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calcBill(); // Polymorphism ensures the correct subclass method is called
        }
        return total;
    }

    public double calculateBillById(int id) throws VehicleNotFoundException {
        double bill = 0;
        for (Vehicle v : vehicles) {
            if (v.getId() == id) {
                bill = v.calcBill();
                return bill;
            }
        }
        throw new VehicleNotFoundException("Cannot calculate bill with the given ID: " + id);
    }

    public Vehicle removeVehicleById(int id) throws VehicleNotFoundException {
        for (Vehicle v : vehicles) {
            if(v.getId() == id) {
                vehicles.remove(v);
            }
            return v;
        }
        throw new VehicleNotFoundException("Cannot find a vehicle with the given ID: " + id);
    }

    public double calculateBillBasedOnType(Class<?> type) throws VehicleNotFoundException {
        double totalBill = 0;
        boolean found = false; // Track if we find any

        for (Vehicle v : vehicles) {
            if (type.isInstance(v)) {
                totalBill += v.calcBill();
                found = true;
            }
        }

        if (!found) {
            throw new VehicleNotFoundException(
                    "Cannot find any vehicles of the given type: " + type.getSimpleName()
            );
        }

        return totalBill;
    }


}
