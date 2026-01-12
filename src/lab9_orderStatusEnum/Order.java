package lab9_orderStatusEnum;

public class Order {

    private int orderId;
    private OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void cancelOrder() {
        // TODO:
        // If the order can be cancelled, set status to CANCELLED
        if(status.canBeCancelled()) {
            status = OrderStatus.CANCELLED;
        } else {
            System.out.println("Order cannot be cancelled in its current state");
        }
        // Otherwise print an error message
    }

    public void printStatusMessage() {
        // TODO:
        // Use a switch statement on status
        // Print a message for each OrderStatus
        switch (status) {
            case NEW:
            case PROCESSING:
            case SHIPPED:
            case DELIVERED:
            case CANCELLED:
                System.out.println(status.getDescription());
                break;
        }
    }
}
