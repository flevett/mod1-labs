package lab12_OOP_Garage;

// Extend Exception to create a checked exception
public class VehicleNotFoundException extends Exception {

    // Constructor that accepts a message
    public VehicleNotFoundException(String message) {
        super(message);
    }
    //this is storing the message from our garage class, ready to be caught by the runner

    public VehicleNotFoundException() {
        super("Vehicle not found in the garage");
    }
    //not used currently, but would be helpful for throwing a default message should an id not be input
}
