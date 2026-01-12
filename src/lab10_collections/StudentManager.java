package lab10_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentManager {

    private Map<String, Student<? extends Number>> students;

    public StudentManager() {
        students = new HashMap<>();
    }

    // TODO: Add a student to the map
    public void addStudent(Student<? extends Number> student) {
        students.put(student.getName(), student);
    }

    // TODO: Calculate the average grade for a student
    public double calculateAverage(Student<? extends Number> student) {
        double sum = 0.0;
        List<? extends Number> grades = student.getGrades();

        for (Number grade : grades) {
            sum += grade.doubleValue();
        }
        return grades.isEmpty() ? 0.0 : sum / grades.size();
    }

    // TODO: Return students with an average above the threshold
    public List<Student<? extends Number>> getStudentsAbove(double threshold) {
        List<Student<? extends Number>> result = new ArrayList<>();

        for (Student<? extends Number> student : students.values()) {
            if (calculateAverage(student) > threshold) {
                result.add(student);
            }
        }

        return result;
    }
}