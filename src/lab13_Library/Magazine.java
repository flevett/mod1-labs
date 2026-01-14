package lab13_Library;
//the package this class is inside, spelling must be exact, and this must change if package name does

public class Magazine extends LibraryItem {
    //public to be accessed outside the class, class called Magazine, a child/subclass of Library item

    private int issueNumber;
    //field called issueNumber with a datatype of integer

    public Magazine(int id, String title, int issueNumber) {
        //public to be accessed outside the class, constructor, taking the parameters id, title, issueNumber
        //prefixed with the according datatype
        super(id, title);
        //a constructor of the parent/super class, instantiating the id and title fields
        this.issueNumber = issueNumber;
        //setting the field made in this class to equal the parameter passed to the constructor
    }

    @Override
    //tell the compiler we are implementing its abstract method
    public String getItemType() {
        //accessible outside the class, method called getItemType that must return a String (must since it's not void)
        return "Magazine";
        //since this class is just for magazines, it can simply return a string "magazine"
    }

    @Override
    //tell the compiler we are implementing its abstract method
    public String getDescription() {
        //accessible outside the class, a method called getDescription that must return a string
        return getItemType() + ": " + getTitle() +
                " (Issue " + issueNumber + ")";
        //concatenating message including the item type, its title and issue number to be returned on method call
    }
}