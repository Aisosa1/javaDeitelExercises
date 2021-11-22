import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String prompt = """
            for igbo press 1
            for English press 2
            for Edo press 3
            for Yoruba press 4
            for Hausa press 5
            """;
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        switch (userChoice) {

            case 1:
                System.out.println("i speak igbo");
                break;
            case 2:
                System.out.println("i speak Edo");
                break;
            case 3:
                System.out.println("i speak Yoruba");
                break;
            case 4:
                System.out.println("i speak Hausa");
                break;
            case 5:
                System.out.println("i speak English");
                break;
            default:
                System.out.println("you entered a wrong key");
        }




}
}