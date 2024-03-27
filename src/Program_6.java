public class Program_6 {
    public static void main(String[] args) {
        System.out.println("The Numbers divisible by 5 & 6 are:");
        int count = 0;
        for (int num = 100; num <= 1000; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + "  ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                    System.out.println("Author: [Skrit Simkhada]");
                }
            }
        }
    }
}

