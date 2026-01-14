package lab13_Library;
//package name, must be exact spelling

public abstract class LibraryItem {
    // public to be accessed outside class, abstract so that it cannot be instantiated directly
    private int id;
    //integer id field
    private String title;
    //string title field
    private boolean isBorrowed;
    //boolean isBorrowed field

    public LibraryItem(int id, String title) {
        //public to be accessed outside class, constructor (must be spelt the same as the class), taking parameters
        //of id and title
        this.id = id;
        this.title = title;
        this.isBorrowed = false;
        //setting the fields made in this class to equal the parameters given
    }

    public int getId() {
        return id;
    }
    //getter for the id field

    public String getTitle() {
        return title;
    }
    //getter for the title field

    public boolean isBorrowed() {
        return isBorrowed;
    }
    //getter for the isBorrowed field

    public void borrowItem() {
        //accessible outside the class, does not need to return anything, method called borrowItem
        if(!isBorrowed) {
            //if is borrowed is not true
            isBorrowed = true;
            //set it to be true
        }
    }

    public void returnItem() {
        //accessible outside the class, does not need to return anything, method called returnItem
        isBorrowed = false;
        //set isBorrowed to false
    }

    abstract public String getItemType();
    //abstract method to implemented in sub-/s

    abstract public String getDescription();
    //abstract method to implemented in subclasses
}
