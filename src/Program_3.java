import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        System.out.println("Author: [Skrit Simkhada]");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ASCII code: ");
        int asciiCode = scanner.nextInt();

        if (asciiCode >= 0 && asciiCode <= 128) {
            char asciiChar = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is " + asciiChar);
        } else {
            System.out.println("Invalid ASCII code. Please enter a number between 0 and 128.");
        }

        scanner.close();
    }
}
