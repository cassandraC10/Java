package Assignment;

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {

        Scanner collect = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterAmount = collect.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = collect.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = collect.nextDouble();

        double energyNeeded = waterAmount * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %.1f", energyNeeded);

    }
}
