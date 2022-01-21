package CHAPTER4DEITEL;

    import java.util.Scanner;

public class ClassAnalysis {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            int passes = 0;
                int failures = 0;
                int studentCounter = 1;



            while (studentCounter <= 10) {

                System.out.println("Enter result (1 = pass, 2 = fail): ");
               int result = input.nextInt();

               if (result <= 2)

                studentCounter = studentCounter + 1;


                if (result == 1)
                    passes = passes + 1;

                if (result == 2)
                    failures = failures + 1;
            }

            if (passes >= 8)
                System.out.println("tutor has done well");
    }
    }