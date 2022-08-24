package ChapterThree;

import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter following details of the Patient");

        System.out.println("First Name: ");
        String firstName= input.nextLine();

        System.out.println("Last Name: ");
        String lastName= input.nextLine();

        System.out.println("Gender (M / F) ?");
        char gender= input.next().charAt(0);

        System.out.println("Date of Birth");
        System.out.println("Day");
        int day= input.nextInt();

        System.out.println("Month");
        int month= input.nextInt();

        System.out.println("Year");
        int year= input.nextInt();

        System.out.println("Height (in inches)");
        double height = input.nextDouble();

        System.out.println("weight (in pounds)");
        double weight = input.nextDouble();


        HealthProfile obj=new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);
        int age=obj.calculateAge();

        System.out.println("Patient age is   "+age + " Years");
        int maxHeartRate=obj.maximumHeartRate();

        System.out.println("Patient Maximum Heart Rate is   "+maxHeartRate + " beats per minute");
        double[] targetHeartRateRange =obj.targetHeartRateRange();

        System.out.println("Target Heart Range is   "+targetHeartRateRange [0] + " - " +targetHeartRateRange [1]);

        double bmi=obj.calculateBMI();
        System.out.println("Patient BMI is   "+bmi);
        System.out.println("Patient BMI Value is   "+obj.getBMIValue());

    }
}
