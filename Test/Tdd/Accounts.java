package Tdd;

public class Accounts {
    private String name;
    private double balance;
    public Accounts(String name, double balance) {
        this.name = name;
        if(balance < 0.0)
            this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount > 0.0)
            balance = balance + amount;
    }

    public double getBalance() { return balance; }

    public void withdraw(int amount) {
        if( amount > 0.0 && amount <= balance)
            balance = balance - amount ;
    }
//    public Object getBalance() {
//    }
}
