
/***********************************************/
/********** Skrit Simkhada *********************/
/********** CMPS 161 *********************/
/********** Prgram 2 *********************/
    import java.util.Scanner;

public class Program_2 {
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter a temperature in Celsius
            System.out.print("Enter a temperature in Celsius: ");
            double celsius = input.nextDouble();

            // Convert Celsius to Fahrenheit
            double fahrenheit = (9.0 / 5) * celsius + 32;

            // Display the result
            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " in Celsius");
        }
    }
