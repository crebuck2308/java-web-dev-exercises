package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive today: ");
        Double numMiles = input.nextDouble();

        System.out.println("How many gallons of gas did you consume: ");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg.");
    }
}
