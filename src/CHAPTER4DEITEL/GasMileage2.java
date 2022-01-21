package CHAPTER4DEITEL;

import java.util.Scanner;

public class GasMileage2 {
    public static void main(String[] args) {

        int mileCount = 0;
        int totalMile = 0;
        int totalGallon = 0;
        int gallonCount = 0;
        double calculate = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("input gallon or enter -2 to exit");
        int gallon = input.nextInt();

        System.out.println("input miles or enter -2 to exist");
        int mile = input.nextInt();



        while (mile != -2){

                totalMile = totalMile + mile;
                totalGallon = totalGallon + gallon;


                calculate = (double) gallon / mile;

                mileCount = mileCount + 1;


                System.out.println("input gallon or enter -2 t0 exit");
                gallon = input.nextInt();

                System.out.println("input mile or enter -2 to exit");
                mile = input.nextInt();


        }

        gallonCount = gallonCount + 1;

        if (mileCount != 0){

                System.out.println(gallon);
                System.out.println(mile);
        System.out.println("the miles per gallon for each trip is " + calculate);

            System.out.println("number of trips is " + mileCount);

            System.out.println("total miles covered is " + totalMile);
            System.out.println("total gallon gotten is " + totalGallon);


            double average = (double) totalGallon/gallonCount;

            System.out.println("average gallon is " + average);



        }

    }

}
