package Tdd;

public class Bank {
    private String name;
//    private String accountType;
    private int accountNumber;
//    private ArrayList<AccountNumber> accountNumbers;
private double balance;


//    public Accounts(String name, int accountNo){
//        this.name = name;
//        accountNumber = accountNo;
//    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setBalance(double balance) { this.balance = balance; }

    public double getBalance() { return balance; }

    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber;}
    public int getAccountNumber() {return accountNumber;}


}
