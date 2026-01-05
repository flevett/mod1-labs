package lab3;
//this says that the Program class is a part of the lab 3 package

import java.util.Scanner;
//imports a java library allowing us to use the scanner class (for reading user input)

public class Program {
//every java program needs at least one class with a main method, this class is called Program

    public static void main(String[] args) {
//"public static void main(String[] args)" is the entry point, when the program runs, starts here
        int age = getInt("Enter your age: ");
//Calls the getInt method (defined below) asking for the users age, stored in a variable called age
        String name = getString("Enter your name: ");
//Calls the getString method (defined below) asking for the users name, which is then stored in a variable called name
        System.out.println("Hello " + name + ", you are " + age + " years old.\n");
//prints a greeting to the terminal, concatenating the values collected
    }

    private static Scanner s = new Scanner(System.in);
// creates a scanner object named s for reading keyboard input (system.in)
//private means only code inside the class cna see it
//static means there is only one scanner shared across all methods of this class

    public static int getInt(String prompt) {
        System.out.print(prompt);
//displays the prompt message (which we set in the main method)
        return s.nextInt();
// reads an integer from the user and returns it
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
//displays the prompt message (which we set in the main method)
        return s.nextLine();
// reads a string from the user and returns it
    }
}