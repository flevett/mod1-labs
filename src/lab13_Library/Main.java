package lab13_Library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Add items
        library.addItem(new Book(1, "1984", "George Orwell", 328));
        library.addItem(new Book(2, "Java Basics", "James Gosling", 500));
        library.addItem(new Magazine(3, "Time", 202));
        library.addItem(new Magazine(4, "National Geographic", 150));

        // List items
        System.out.println("Library Items:");
        library.listItems();

        // Borrow and return
        library.borrowItemById(1);
        library.borrowItemById(3);
        library.returnItemById(1);

        // Final state
        System.out.println("\nAfter Transactions:");
        library.listItems();
    }
}
