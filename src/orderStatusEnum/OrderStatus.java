package orderStatusEnum;

public enum OrderStatus {

    NEW("Order has been created.", true),
    PROCESSING("Order is Processing", true),
    SHIPPED("Order has been shipped.", false),
    DELIVERED("Order has been delivered.", false),
    CANCELLED("Order has been cancelled.", false);

    // TODO: add fields
    private final String description;
    private final boolean canBeCancelled;

    // TODO: add constructor
    OrderStatus(String description, boolean canBeCancelled){
        this.description = description;
        this.canBeCancelled = canBeCancelled;
    }

    // TODO: add getter for description
    public String getDescription() {
        return description;
    }


    // TODO: add method canBeCancelled()
    public boolean canBeCancelled() {
        return canBeCancelled;
    }
}
