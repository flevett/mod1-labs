package lab6;

public class Program {
    public static void main(String[] args) {
//        //create array of account references
//        Account[] accounts = new Account[3];
//
//        //create account objects and store them
//        accounts[0] = new Account(1, "Alice", 100);
//        accounts[1] = new Account(2, "Bob", 200);
//        accounts[2] = new Account(3, "Charlie", 300);
//
//        //display details
//        for (Account acc:accounts) {
//            System.out.println(acc.getDetails());
//        }

        Account myAccount = new Account(4, "Freddie", 100);
        myAccount.addInterest();
        System.out.println(myAccount.getDetails());

        processAccount(myAccount);
        System.out.println(myAccount.getDetails());
    }

    static void processAccount(Account acc){
        acc.addInterest();
    }
}
