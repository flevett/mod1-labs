//package lab11_exceptions;
//
//public class Program {
//
//    static void main(String[] args) {
//        Account[] accounts = new Account[2];
//
//        accounts[0] = new Account(1, 100, "Jim");
//        accounts[1] = new Account(2, 50, "Kim");
//
//        try {
//            accounts[0].withdraw(110);
//            System.out.println(accounts[0].getDetails());
//        } catch (IllegalArgumentException) {
//            System.out.println("Withdraw failed. Can not withdraw a larger sum than balance");
//        } finally {
//            accounts[0].close();
//        }
//
//    }
//}
