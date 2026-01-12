//package lab11_exceptions;
//
//public class Account {
//
//    int id;
//    double balance;
//    String owner;
//
//    public Account(int id, double balance, String owner) {
//        this.id = id;
//        this. balance = balance;
//        this.owner = owner;
//    }
//
//    void withdraw(double amount){
//        if(balance < amount){
//            throw IllegalArgumentException;
//        } else {
//            balance -= amount;
//        }
//    }
//
//    void deposit(double amount) {
//        balance += amount;
//    }
//
//    void close() {
//        System.out.println("Account " + id + " is now closed.");
//    }
//
//    public String getDetails() {
//        return "Account ID: " + id +
//                " Account Balance: " + balance +
//                " Account Owner: " + owner;
//    }
//}
