package CHAPTER4DEITEL;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        int mileCount = 0;
        int totalMile = 0;
        int totalGallon = 0;
        int gallonCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("input miles or enter -2 to exist");
        int mile = input.nextInt();


        while (mile != -2){

            totalMile = totalMile + mile;

        System.out.println(mile);
            mileCount = mileCount + 1;

            System.out.println("input mile or enter -2 to exist");
            mile = input.nextInt();
        }

        System.out.println("input gallon or enter -3 to exit");
        int gallon = input.nextInt();

        while (gallon != -3){

            totalGallon = totalGallon + gallon;

        System.out.println(gallon);
            gallonCount = gallonCount + 1;

            System.out.println("input gallon or enter -3 to exit");
            gallon = input.nextInt();
        }
        if (mileCount > 0 && gallonCount > 0){

            System.out.println("total miles covered is " + totalMile);
            System.out.println("total gallon gotten is " + totalGallon);

            int calculate = gallon/mile;

            System.out.println(calculate);

        }

    }
}
