import java.util.Random;

public class Program_4

    {
        public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(12) + 1;

        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        System.out.println("The Random Number Generated is: " + randomNumber);
        System.out.println("Month: " + months[randomNumber - 1]);
        System.out.println("Author: [Skrit Simkhada]");
    }
}

