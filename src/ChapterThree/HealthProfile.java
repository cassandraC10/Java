package ChapterThree;

import java.util.Calendar;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private char gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;
    public HealthProfile(String firstName, String lastName, char gender, int day, int month, int year, double height,

                         double weight) {

        super();

        this.firstName = firstName;

        this.lastName = lastName;

        this.gender = gender;

        this.day = day;

        this.month = month;

        this.year = year;

        this.height = height;

        this.weight = weight;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int calculateAge() {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(year, month, day);
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
    }

    public int maximumHeartRate() {
        return 220 - calculateAge();
    }
    public double[] targetHeartRateRange() {
        double[] range = new double[2];
        range[0] = 0.5 * maximumHeartRate();
        range[1] = 0.85 * maximumHeartRate();
        return range;
    }
    public double calculateBMI() {
        return (weight * 703)/(height * height);
    }

    public String getBMIValue() {
        double bmi=calculateBMI();
        if(bmi < 18.5) {
            return "Underweight";
        }
        else if (bmi>18.5 && bmi<24.9) {
            return "Normal";
        }

        else if (bmi>25 && bmi<29.9) {
            return "Normal";
        }

        else if (bmi>=30) {
            return "Obese";
        }

        return "DefaultValue";
    }
    @Override
    public String toString() {
        return "HealthProfile [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", Date Of Birth="

                + day + "-" + month + "-" + year + ", height=" + height + ", weight=" + weight + "]";

    }
}
