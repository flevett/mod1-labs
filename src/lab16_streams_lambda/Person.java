package lab16_streams_lambda;
//defines the package of this class, allows classes in the same package to find each other easily

public class Person {
    //a class accessible outside of its own class and other packages (public), called Person
    private String name;
    private int age;
    private String city;
    //the class's fields, setting variables to appropriate datatypes

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    //the Person class constructor, assigning parameters passed into it, to equal the fields above

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    //getters for the Person class, to be used for finding out the specific values for a persons name, age or city
}
