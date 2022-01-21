import java.util.Scanner;

public class NativeDriver {
    public static void main(String[] args) {
        System.out.println("ENTER NAME");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter scv Number");
        int scvNumber = scanner.nextInt();

        Native aNative = new Native(name, scvNumber);
        System.out.println(aNative.getName());
        System.out.println(aNative.getScvId());
    }
}
