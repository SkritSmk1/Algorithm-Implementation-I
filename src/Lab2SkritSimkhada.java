import java.util.Scanner;
public class Lab2SkritSimkhada {
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            System.out.println("This program will calculate the perimeter and area of a square");
            System.out.print("Enter the length of a side of your square:");
            double length = input.nextDouble();

            //Compute perimeter
            double perimeter = 4 * length;

            //Compute area using two different method
            double area = length * length;
            double areaPow = Math.pow(length , 2);
            System.out.println("We can calculate the perimeter of the square with the formula: perimeter = 4 * (length of a side).");
            System.out.println("The perimeter of the square =" + perimeter);
            System.out.println("We can calculate the area of the square with the formula: area = (length of a side)^2.");
            System.out.println("The area of the square =" + areaPow);
        }
    }
