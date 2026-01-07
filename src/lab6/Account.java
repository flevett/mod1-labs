package lab6;

public class Account {
    private int id;
    private String owner;
    private double balance;

    // Constructor
    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("You cannot deposit a negative value");
            return;
        }
        balance += amount;
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("You cannot withdraw a negative value");
            return;
        }

        if (balance < amount) {
            System.out.println("You cannot withdraw money you don't have...");
            return;
        }

        balance -= amount;
    }

    // Add interest (2.5%)
    public void addInterest() {
        balance += balance * 0.025;
    }

    // Get account details
    public String getDetails() {
        return "Account ID: " + id +
                ", Owner: " + owner +
                ", Balance: £" + balance;
    }
}
