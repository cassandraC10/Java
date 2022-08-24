package ChapterFour;

public class EmployeeApp {
    public static void main (String[] args){

        Employee adisa = new Employee("Adisa", "Beauty", 1000.00);
        Employee cassandra = new Employee("Cassandra","Oliver", 500.00);


        adisa.setFirstName("Adisa");
        adisa.setLastName("Beauty");
        adisa.setMonthlySalary(1000.00);
        adisa.getFirstName();
        adisa.getLastName();
        adisa.getMonthlySalary();
        adisa.getYearlySalary();

        cassandra.setFirstName("Cassandra");
        cassandra.setLastName("Oliver");
        cassandra.setMonthlySalary(500.00);
        cassandra.getFirstName();
        cassandra.getLastName();
        cassandra.getMonthlySalary();
        cassandra.getYearlySalary();


        System.out.printf("My  employee1 first name is %s%n", adisa.getFirstName());
        System.out.printf("My employee1 last name is %s%n", adisa.getLastName());
        System.out.printf("Her monthly salary is $%.2f", adisa.getMonthlySalary());
        System.out.println();
        System.out.printf("Her yearly salary is $%.2f", adisa.getYearlySalary());
        System.out.println();
        adisa.increment();
        System.out.println("Her monthly salary with 10% is " + adisa.getMonthlySalary());
        System.out.println("Her yearly salary is now " + adisa.getYearlySalary());
        System.out.println();


        System.out.printf("My employee2 first name is %s%n", cassandra.getFirstName());
        System.out.printf("My employee2 last name is %s%n", cassandra.getLastName());
        System.out.printf("Her monthly salary is $%.2f", cassandra.getMonthlySalary());
        System.out.println();
        System.out.printf("Her yearly salary is $%.2f", cassandra.getYearlySalary());
        cassandra.increment();
        System.out.println();
        System.out.println("Her monthly salary with 10 % is"+ cassandra.getMonthlySalary());
        System.out.println("Her yearly salary is now " + cassandra.getYearlySalary());
    }
}
