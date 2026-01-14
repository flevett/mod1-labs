package lab13_Library;
//Inside the package lab13_Library, spelling must be exact

public class Book extends LibraryItem{
    //a new class called Books, which extends (uses fields and methods from) the class Library item.
    //public so that it can be accessed outside the class
    private String author;
    //a field called author set to string. Private so that it can only be accessed within the class
    private int pages;
    //a field called pages set to int. Private so that it can only be accessed within the class

    public Book(int id, String title, String author, int pages) {
        //a constructor, taking parameters id, title, author and pages. All with their respective datatype
        super(id, title);
        //Calls the LibraryItem constructor to initialize inherited fields (id and title)
        this.author = author;
        //setting the field to be equal to the input parameter
        this.pages = pages;
        //setting the field to be equal to the input parameter
    }

    @Override
    //telling complier we are overriding a method from the superclass (Library Item)
    public String getItemType() {
        //public so it can be accessed outside the class, of a String type, method called getItemType
        return "Book";
        //since this is a subclass just for books, it returns the string book
    }

    @Override
    //telling complier we are overriding a method from the superclass (Library Item)
    public String getDescription() {
        //public so it can be accessed outside the class, of a String type, method called getDescription
        return getItemType() + ": " + getTitle() + " by " + author + " (" + pages + " pages)";
        //returns a concatenated string when called, formatting the type, title, author and pages into a readable format
    }
}
