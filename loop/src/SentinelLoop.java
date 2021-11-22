import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {
        int number = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);

        do {
            total = total + number;
            System.out.println("enter number");
            number = input.nextInt();
        }

        while (number < 50);
        }
}
