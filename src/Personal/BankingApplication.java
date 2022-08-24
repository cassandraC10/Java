package Personal;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Peter Obi", "123456");
        obj.showMenu();
    }
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String accountNumber;

    BankAccount(String cname , String acctNo) {
        customerName = cname;
        accountNumber = acctNo;
    }


    void deposit(int amount) {
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if(amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0) {
            System.out.println("Withdraw: " +Math.abs(previousTransaction));
        }

        else {
            System.out.println("No Transaction Occurred");
        }
    }

    void showMenu() {

        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to SecondBank of Nigeria ");
        System.out.println("Hello " +customerName);
        System.out.println("Your Account Number is " + accountNumber);
//        System.out.println("\n");
        System.out.println();
        System.out.println("A -> Check Balance");
        System.out.println("B -> Deposit");
        System.out.println("C -> Withdraw");
        System.out.println("D -> Previous Transaction");
        System.out.println("E -> Exit The System");

        do {
            System.out.println("*************************************");
            System.out.println("Press An Option");
            System.out.println("*************************************");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A' -> {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                }
                case 'B' -> {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter an amount to deposit ");
                    System.out.println("-------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                }
                case 'C' -> {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw ");
                    System.out.println("-------------------------------------------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                }
                case 'D' -> {
                    System.out.println("-------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                }
                case 'E' ->
                        System.out.println("========================================================================");
                default -> System.out.println("Invalid Option!! Please Enter Correct Option...");
            }
        }
        while(option != 'E');
        System.out.println("Thank You for Using our Services.....!!");
    }
}
