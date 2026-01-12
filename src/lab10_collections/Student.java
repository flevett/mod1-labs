package lab10_collections;

import java.util.ArrayList;
import java.util.List;

class Student<T extends Number> {

    private String name;
    private List<T> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // TODO: Add a method to add a grade
    public void addGrade(T grade) {
        grades.add(grade);
    }

    // TODO: Add a method to return the list of grades
    public List<T> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}