package lab13_Library;
//the package the class is located in, spelling must be exact

import java.util.ArrayList;
//importing methods from java

public class Library {
    //creating the class, public to be accessed outside of this file

    private ArrayList<LibraryItem> items;
    //an array list, made using the import, private so that it cannot be accessed from outside this class,
    //called items, im not sure why LibraryItem is inside the diamond, is it because the items in this arraylist
    //must be a library item object?

    public Library() {
        items = new ArrayList<>();
    }
    //a constructor, setting library to be an empty array list

    public void addItem(LibraryItem item) {
        items.add(item);
    }
    //a method that is accessible outside the class, that does not require a return, called addItem
    // taking an item parameter that must be of the LibraryItem object? then inside the method. We add the parameter
    //to our empty arraylist we made earlier

    public void listItems() {
        //a method called listItems, accessible outside its class, not expecting a return
        for (LibraryItem item : items) {
            //for each item of the Library item object inside the items array list
            System.out.println(
                    //print to the console
                    item.getDescription() +
                            " | Borrowed: " + item.isBorrowed()
                    //concatenated for readability, a call of the getDescription (from subclass)
                    // method on the current item in the array
                    //list, followed by the call isBorrowed (from libraryitem) on the same item being iterated through
            );
        }
    }

    public void borrowItemById(int id) {
        // method called borrowItemById, taking a parameter called id that must be an integer
        //accessible outside its class, not expecting a return
        for (LibraryItem item : items) {
            //for each item that is a LibraryItem in the items array list
            if (item.getId() == id) {
                //if, the id of the current item being iterated through is set to id
                if (!item.isBorrowed()) {
                    //and if the item being iterated through, when the isBorrowed method is called on it is NOT true
                    item.borrowItem();
                    //then call the borrow item method on this item
                    System.out.println("Borrowed: " + item.getTitle());
                    //print to console a concatenated string, with the current id's title
                } else {
                    //otherwise
                    System.out.println("Item already borrowed.");
                    //print to the console a string
                }
                return;
                //return form initial if statement in the event of condition not being met
            }
        }
        System.out.println("Item with ID " + id + " not found.");
        //if there is no LibraryItem with the id input then print string
    }

    public void returnItemById(int id) {
        //accessible outside of class, not expecting return, method called returnItemById.
        //takes one integer parameter called id
        for (LibraryItem item : items) {
            //for each item in the items arraylist that is a libraryitem object
            if (item.getId() == id) {
                //if the id of the current item being iterated through is set to id
                if (item.isBorrowed()) {
                    //if the item when the isBorrowed method is called on it returns true
                    item.returnItem();
                    //then call the return item method on the current item being iterated through
                    System.out.println("Returned: " + item.getTitle());
                    //and print out a concatenated string to the console, including the current items title
                } else {
                    System.out.println("Item was not borrowed.");
                    //otherwise, if the item.isBorrowed is false, then return this error message string in the console
                }
                return;
                //leave the eariler (item.getId() == id) statement should it be false
            }
        }
        System.out.println("Item with ID " + id + " not found.");
        //print error message to console should an id not be found
    }
}
