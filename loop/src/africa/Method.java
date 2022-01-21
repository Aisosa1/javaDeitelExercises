package africa;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner inputCollector = new Scanner(System.in);
        int userInput = inputCollector.nextInt();

        int result = calculatefactorsOf(userInput);

        if (result <= 2) System.out.printf("%d is a prime number$n", userInput);
        else System.out.printf("%d is not a prime number", userInput);
    }
    public static int calculatefactorsOf( int userInput){

        int factor = 0;
        for (int number = 1; number <= userInput; number++)
            if (userInput % number == 0)
            {
                factor++;
            }
        return factor;
    }
    
    }

