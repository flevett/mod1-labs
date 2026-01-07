package lab7;

public class Customer {

    //fields
    private String name;
    private int age;
    private boolean isVip;

    // Constructor
    public Customer(int age, String name, boolean isVip) {
        this.name = name;
        this.age = age;
        this.isVip = isVip;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isVip() {
        return isVip;
    }
}
