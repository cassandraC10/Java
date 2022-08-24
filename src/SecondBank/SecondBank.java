package SecondBank;

import java.util.ArrayList;

public class SecondBank {
    private String fullName;
    private int accountPin;
    private int accountNumber;
    private ArrayList<Accounts> acctNo;
    private double balance;
    private ArrayList<Transaction> transactions;

    private String statement; //only get, no set

    public SecondBank(String fullName) {

    }

    private static <AccountNumber> ArrayList<AccountNumber> RandomArray(int n){
        ArrayList<AccountNumber> arrayRandom = new ArrayList<AccountNumber>(n);
        return arrayRandom;
    }

    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getFullName() { return fullName; }

//public SecondBank(String name, int accountNumber, int accountPin) {
//    this.fullName = name;
//    this.accountPin = accountPin;
//    this.accountNumber = accountNumber;
//    acctNo = new ArrayList<>();
//}

    public Accounts createAccount(String fullName, double balance){
        return new Accounts(fullName, balance); // add acct number generation
    }

    //    public void depositMoney(Accounts amt){
    public void depositToAccount(double amount){
        if(amount > 0.0)
            balance = balance + amount;
    }

public void withdraw(double amount) {
    if( amount > 0.0 && amount <= balance)
        balance = balance - amount ;
    else System.out.println("Withdrawal amount exceeded account balance");
         }

    public double getBalance() {
        return balance;
    }

    public int getListOfTransactions() { return transactions.size(); }

    public Transaction searchTransaction(String trans) {
        for (Transaction transaction:transactions) {
            if (trans.equalsIgnoreCase(transaction.getTrans())){
                return transaction;}
        } return null;
    }

    public void viewAllTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getTrans());
            System.out.println("====================");
        }
    }

    public boolean deleteTransaction(String trans) {
        for (Transaction transaction : transactions) {
            if (trans.equals(transaction.getTrans())) {
                transactions.remove(transaction);
                return true; }
        } return  false;
    }

    public int getAccountPin() { return accountPin; }

    public void setAccountPin(int accountPin) { this.accountPin = accountPin; }
}
