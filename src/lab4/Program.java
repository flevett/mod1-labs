package lab4;

public class Program {

    public static String getGrade(int mark) {
        if (mark >= 90) {
            return "A+";
        } else if (mark >= 80) {
            return "A";
        } else if (mark >= 70) {
            return "B";
        } else if (mark >= 60) {
            return "C";
        } else if (mark >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};

        int sum = 0;

        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / numbers.length;

        int indexOfZero = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                indexOfZero = i;
                break;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
        System.out.println("Index of Zero: " + indexOfZero);

        String[] students = {"Bobby", "Bob", "Robert", "Billy", "Bill"};
        int[] marks = {85, 92, 67, 73, 48};

        System.out.println("\nStudent Grades:");
        for (int i = 0; i < students.length; i++) {
            String grade = getGrade(marks[i]);
            System.out.println(students[i] + ": " + marks[i] + " -> " + grade);
        }
    }
}