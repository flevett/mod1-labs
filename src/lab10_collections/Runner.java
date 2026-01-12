package lab10_collections;

import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {

        Student<Integer> alice = new Student<>("Alice");
        alice.addGrade(80);
        alice.addGrade(90);
        alice.addGrade(85);

        Student<Integer> bob = new Student<>("Bob");
        bob.addGrade(60);
        bob.addGrade(70);
        bob.addGrade(65);

        Student<Integer> jim = new Student<>("Jim");
        jim.addGrade(30);
        jim.addGrade(60);
        jim.addGrade(30);

        Student<Integer> kim = new Student<>("Kim");
        kim.addGrade(95);
        kim.addGrade(100);
        kim.addGrade(90);

        StudentManager manager = new StudentManager();
        manager.addStudent(alice);
        manager.addStudent(bob);
        manager.addStudent(jim);
        manager.addStudent(kim);

        System.out.println("Alice average: " + manager.calculateAverage(alice));
        System.out.println("Bob average: " + manager.calculateAverage(bob));
        System.out.println("Jim average: " + manager.calculateAverage(jim));
        System.out.println("Kim average: " + manager.calculateAverage(kim));

        System.out.println("Students above 75:");
        for (Student<? extends Number> s : manager.getStudentsAbove(75)) {
            System.out.println(s.getName());
        }
    }
}