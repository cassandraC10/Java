package ChapterFour;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public double getMonthlySalary() { return monthlySalary; }

    public double getYearlySalary() { return monthlySalary * 12; }

    public void increment() { monthlySalary = monthlySalary + (0.1 * monthlySalary); }

}
