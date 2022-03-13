package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input;
        double miles;
        double gallons;
        double milesPerGallon;

        input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        miles = input.nextDouble();
        System.out.println("How many gallons were consumed: ");
        gallons = input.nextDouble();
        input.close();

        milesPerGallon = miles / gallons;

        System.out.println("Miles per gallon is " + milesPerGallon + ".");

    }
}
