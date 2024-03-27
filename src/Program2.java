import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        // Displaying the full name
        System.out.println("/****************************************************/");
        System.out.println("/**************** Skrit Simkhada ******************/");
        System.out.println("/**************** CMPS 161 ******************/");
        System.out.println("/**************** Program 2 ******************/");
        System.out.println("/****************************************************/");
        System.out.println("/* This program reads a Celsius degree in double from the console, then converts it to Fahrenheit");
        System.out.println("and displays the result.");
        System.out.println("*/");

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a temperature in Celsius
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // Display the result
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
