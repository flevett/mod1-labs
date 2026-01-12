package lab9_orderStatusEnum;

public class Runner {

    public static void main(String[] args) {

        // TODO:
        // 1. Create an Order with status NEW
        Order order = new Order(1, OrderStatus.NEW);
        // 2. Print the status message
        order.printStatusMessage();
        // 3. Change status to SHIPPED
        order.setStatus(OrderStatus.SHIPPED);
        // 4. Try to cancel the order
        order.cancelOrder();
        // 5. Print the final status and description
        order.printStatusMessage();
    }
}