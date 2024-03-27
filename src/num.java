import java.util.Scanner;

public class num {

    public static void main (String args[]){
        Scanner input = new Scanner (System.in);

        int num1 = 2;

        if(num1 % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
