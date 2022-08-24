package SecondBank;

import java.util.Scanner;

public class SecondBankMain {
    private static final Scanner keyboardInput = new Scanner(System.in);
    private static SecondBank bank;

    public static void main(String[] args) {
        setUpAccount();
        runSecondBank();
    }
    private static void setUpAccount() {
        System.out.println("SecondBank of Nigeria");
        System.out.println("Enter your full name: ");
        String fullName = keyboardInput.nextLine();

        System.out.println("Create account Pin: ");
        int accountPin = keyboardInput.nextInt();

        bank = new SecondBank(fullName);
    }

    private static void runSecondBank() {
        System.out.println("Welcome to SecondBank.");
        boolean quit = false;
        while(!quit) {
            String prompt = """
                 Enter
                 1. -> Create an account
                 2. -> Deposit
                 3. -> Withdraw
                 4. -> Check Balance
                 5. -> Get Statement
                 6. -> View all transactions
                 7. -> Delete Transaction
                 8. -> Reset pin
                 9. -> exit
                 """;
            System.out.println(prompt);
            int userResponse = keyboardInput.nextInt();
            keyboardInput.nextLine();
            switch (userResponse){
                case 1 -> setUpAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> checkBalance();
                case 5 -> searchTransaction();
                case 6 -> viewAllTransactions();
                case 7 -> deleteTransaction();
//                case 8 -> resetPin();
                case 9  -> {
                    System.out.println("Thank you for using SecondBank ");
                    quit = true;
                } default -> runSecondBank();}
            }
        }
    private static void deposit() {
        System.out.println("Enter an amount to deposit ");
        double amount = keyboardInput.nextDouble();
        deposit();
        System.out.println(amount);
    }

    private static void withdraw() {
        System.out.println("Enter an amount to withdraw: ");
        double amount = keyboardInput.nextDouble();
        withdraw();
        System.out.println(amount);
    }


    private static void checkBalance() {
        System.out.println("Your balance is: " + bank.getBalance());
    }

    private static void searchTransaction() {
        System.out.println("Enter the transaction you want to find: ");
        String trans = keyboardInput.nextLine();

        Transaction foundTransaction = bank.searchTransaction(trans);
        if(foundTransaction == null){
            System.out.println("Transaction not found!");
        } else{System.out.println(foundTransaction);}
    }

    private static void viewAllTransactions() {
        bank.viewAllTransactions();
    }

    private static void deleteTransaction() {
        System.out.println("Enter the transaction you want to delete : ");
        String trans = keyboardInput.nextLine();

        if(bank.deleteTransaction(trans)){
            System.out.println("Transaction successfully deleted");
        }
        else System.out.println("Transaction not found!");
    }

//    private static void resetPin() {
//        System.out.println("Input your current pin: ");
//        int cAcctPin =  keyboardInput.nextInt();
//    }

}

//    Java Date and Time - Hacker Rank Solution
//        https://codesolution.myeduwaves.com › 2021/09 › java..