package lab15_payment_strategy;

public class Main {
    public static void main(String[] args) {
        // ===== Payment Strategy =====

        // 1. Strategy interface (1 abstract method)
        interface PaymentStrategy {
            void pay(double amount);
        }

        // 2. Concrete strategies
        class CreditCardPayment implements PaymentStrategy {
            @Override
            public void pay(double amount) {
                System.out.println("Paid $" + amount + " using Credit Card");
            }
        }

        class PayPalPayment implements PaymentStrategy {
            @Override
            public void pay(double amount) {
                System.out.println("Paid $" + amount + " using PayPal");
            }
        }

        // 3. Context (Shopping Cart)
        class ShoppingCart {
            private final PaymentStrategy paymentStrategy;

            public ShoppingCart(PaymentStrategy paymentStrategy) {
                this.paymentStrategy = paymentStrategy;
            }

            public void checkout(double total) {
                paymentStrategy.pay(total);
            }
        }

        // Usage
        PaymentStrategy creditCard = new CreditCardPayment();
        ShoppingCart cart1 = new ShoppingCart(creditCard);
        cart1.checkout(100.0);

        PaymentStrategy paypal = new PayPalPayment();
        ShoppingCart cart2 = new ShoppingCart(paypal);
        cart2.checkout(55.5);
    }
}
