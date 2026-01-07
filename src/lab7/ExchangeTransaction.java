package lab7;

public class ExchangeTransaction {

    //fields
    private Customer customer;
    private Currency currency;
    private double gbpAmount;

    //constructors
    public ExchangeTransaction (Customer customer, Currency currency, double gbpAmount) {
        this.customer = customer;
        this.currency = currency;
        this.gbpAmount = gbpAmount;
    }

    //behaviours
    public double calculateServiceFee() {
        return gbpAmount < 100 ? gbpAmount * 0.05 : gbpAmount * 0.025;
    }

    public double calculateTax (double amountAfterFee) {
        return customer.isVip() ? amountAfterFee * 0.05 : amountAfterFee * 0.10;
    }

    public void processTransaction() {
        double serviceFee = calculateServiceFee();
        double afterFee = gbpAmount - serviceFee;
        double tax = calculateTax(afterFee);
        double afterTax = afterFee - tax;
        double finalAmount = currency.convertToGBP(afterTax);
        int rounded = (int) finalAmount;

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Original Amount (GBP): £" + gbpAmount);
        System.out.println("After Service Fee: £" + String.format("%.2f", afterFee));
        System.out.println("After Tax: £" + String.format("%.2f", afterTax));
        System.out.println("Currency Exchanged To: " + currency.getName());
        System.out.println("Final Amount: " + rounded + " " + currency.getName());
    }


}
