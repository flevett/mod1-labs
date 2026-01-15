package lab16_streams_lambda;

import java.util.List;

public class PersonData {

    public static List<Person> samplePeople() {
        return List.of(
                new Person("Aisha", 19, "London"),
                new Person("Ben", 17, "Manchester"),
                new Person("Chloe", 22, "Bristol"),
                new Person("Dylan", 34, "London"),
                new Person("Ethan", 15, "Birmingham"),
                new Person("Fatima", 28, "Leeds"),
                new Person("George", 42, "Manchester"),
                new Person("Hannah", 31, "Bristol"),
                new Person("Ibrahim", 55, "London"),
                new Person("Jade", 26, "Cardiff"),
                new Person("Kieran", 60, "Glasgow"),
                new Person("Lily", 18, "Birmingham"),
                new Person("Maya", 23, "Leeds"),
                new Person("Noah", 45, "Edinburgh"),
                new Person("Olivia", 16, "Bristol"),
                new Person("Priya", 38, "Cardiff"),
                new Person("Quinn", 52, "Edinburgh"),
                new Person("Ravi", 21, "Glasgow"),
                new Person("Sophie", 67, "London"),
                new Person("Tom", 29, "Manchester")
        );
    }
}
