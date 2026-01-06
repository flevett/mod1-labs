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
        theLunchQueue();
        //Calling the lunch queue method defined below

        int pounds = getInt("What is the total weight in pounds?");
        //Calls the getInt method (defined below) asking for the weight in pounds
        convertInputToStonesPounds(pounds);
        //Calls the convert to stones / pounds method defined below, passing the pounds variable we just collected from the user

        int kg = getInt("What is your weight in kilograms?");
        convertKgsToStonesPounds(kg);
    }


    public static void theLunchQueue() {
        String mainCourse = getString("What main dish would you like? (Fish, Burgers or Veg)");
        // asks user (using the getString method) what main course they want, storing it in a variable
        int potatoAmount = getInt("How many roast potatoes do you want?");
        //asks the user (using the getInt method) how many potato's they want, storing it in a variable
        int brusselAmount = getInt("How many brussel sprouts do you want?");
        //asks the user (using the getInt method) how many brussel sprouts they want, storing it in a variable.
        System.out.println("Hello, your lunch is " + mainCourse + " with " + potatoAmount + " roast potatoes and " + brusselAmount + " brussel sprouts");
        //prints out a concatenated string using the three variables gathered above (we still need to call this method)
        }


    public static void convertInputToStonesPounds(int pounds) {
        //creating a new method, which takes a variable pounds that must be an integer
        int stones = pounds / 14;
        //creates a variable called stones, initializing it to have a value of pounds divided by 14
        int remainingPounds = pounds % 14;
        // another variable is created, an initialized to a value of the remainder of pounds

        System.out.println(
                pounds + " pounds is " + stones + " stone(s) and " + remainingPounds + " pound(s)."
        );
        //then prints a concatenated string to the console, using the variables we just made
    }

    public static void convertKgsToStonesPounds(int kg) {
        double totalPounds = kg * 2.20462;
        int stones = (int) (totalPounds / 14);
        double pounds = Math.round(totalPounds % 14);

        System.out.print("Your weight in stone and pounds is " + stones + "stone and " + pounds + "pounds");
    }

    private static Scanner s = new Scanner(System.in);
    // creates a scanner object named s for reading keyboard input (system.in)
    //private means only code inside the class can see it
    //static means there is only one scanner shared across all methods of this class

    public static int getInt(String prompt) {
        System.out.print(prompt);
        //displays the prompt message that we passed to it
        int value = s.nextInt();
        //reads the next integer the user types, stopping when said integer ends
        s.nextLine();
        //consumes the left over new line so the input buffer works properly
        return value;
        //sends the integer back to the calling method
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        //displays the prompt message that we passed to it
        return s.nextLine();
        // reads a string from the user and returns it
    }
}