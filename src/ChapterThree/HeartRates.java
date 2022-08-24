package ChapterThree;

import java.util.Scanner;
import java.time.*;

public class HeartRates {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public HeartRates(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your YEAR of birth: ");
        int year = input.nextInt();

        System.out.print("Enter your MONTH of birth: ");
        int month = input.nextInt();
        System.out.print("Enter your DAY of birth: ");
        int day = input.nextInt();

        LocalDate birth = LocalDate.of(year, month, day);

        dateOfBirth = birth;
    }
    public int calcAge() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dateOfBirth, today);
        int age = p.getYears();
        return age;
    }

    //method calculates the maximum heart rate
    public int maxHeartRate() {
        int maxHR = 220 - calcAge();
        return maxHR;
    }

    public int tarHeartRate1() {
        double targetHeartRate = maxHeartRate() * 0.5;
        return (int)targetHeartRate;
    }

    public int tarHeartRate2() {
        double targetHeartRate2 = maxHeartRate() * 0.58;
        return (int)targetHeartRate2;
    }
}
