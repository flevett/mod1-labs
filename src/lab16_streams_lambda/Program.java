package lab16_streams_lambda;
//defining the package for this class, allows other classes inside of it to easily find each other

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
//importing methods from java

public class Program {
    //a class accessible from outside its package

    public static void main(String[] args) {
        //accessible anywhere, belonging to this class (static), doesn't need to return anything (void)
        //the main method, taking a parameter of args that must be an array of String's

        List<Person> people = PersonData.samplePeople();
        //setting the arraylist created in PersonData.java called samplePeople to be equal to a new variable people, also an array list
        //that must only contain Person 's

        // 1️⃣ Return a List<Person> of adults (age >= 18)
        List<Person> adults = people.stream()
                // stream() creates a Stream<Person> from the people list.
                // This does NOT copy the list or change it.
                // It allows functional-style processing of each Person one at a time.
                .filter(p -> p.getAge() >= 18)
                // filter() is an intermediate operation.
                // For each Person in the stream, it keeps the Person ONLY IF
                // the condition (age >= 18) is true.
                .toList();
                // toList() is a terminal operation.
                // It triggers the stream to execute and collects the filtered
                // results into a NEW List<Person> called adults.

        // 2️⃣ Return a List<String> of names of people in London, sorted A–Z
        List<String> londonNames = people.stream()
                .filter(p -> p.getCity().equalsIgnoreCase("London"))
                .map(Person::getName)
                .sorted()
                .toList();

        // 3️⃣ Return a long count of children (age < 18)
        long childCount = people.stream()
                .filter(p -> p.getAge() < 18)
                .count();

        // 4️⃣ Return a List<String> of distinct city names, sorted A–Z
        List<String> cities = people.stream()
                .map(Person::getCity)
                .distinct()
                .sorted()
                .toList();

        // 5️⃣ Return an Optional<Person> for the first person with age > 50
        Optional<Person> firstOver50 = people.stream()
                .filter(p -> p.getAge() > 50)
                .findFirst();

        // 6️⃣ Return a Map<String, Long>: city → number of people
        Map<String, Long> peoplePerCity = people.stream()
                .collect(Collectors.groupingBy(
                        Person::getCity,
                        Collectors.counting()
                ));

        // ---- Output (for testing / demonstration) ----
        System.out.println("Adults: " + adults.size());
        System.out.println("London names: " + londonNames);
        System.out.println("Number of children: " + childCount);
        System.out.println("Cities: " + cities);
        System.out.println("First person over 50: " +
                firstOver50.map(Person::getName).orElse("None"));
        System.out.println("People per city: " + peoplePerCity);
    }
}
