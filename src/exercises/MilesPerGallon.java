package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Integer milesDriven = input.nextInt();

        System.out.println("How many gallons of gas have you consumed?");
        Integer gallonsUsed = input.nextInt();

        Integer milesPerGallon = milesDriven / gallonsUsed;

        System.out.println("You get " + milesPerGallon + " miles per gallon.");

    }
}
