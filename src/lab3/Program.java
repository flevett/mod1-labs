package lab3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int age = getInt("Enter your age: ");
        String name = getString("Enter your name: ");
        System.out.println("Hello " + name + ", you are " + age + " years old.\n");
    }
    public static int getInt(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.print(prompt);
        return s.nextInt();
    }

    public static String getString(String prompt) {
        Scanner s = new Scanner(System.in);
        System.out.print(prompt);
        return s.nextLine();
    }
}