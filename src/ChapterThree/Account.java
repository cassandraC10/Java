package ChapterThree;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if(balance < 0.0)
            this.balance = balance;
    }

    public void depositAmount(double depositamt){
        if(depositamt > 0.0)
            balance = balance + depositamt;
    }
    public void withdrawn(double amount) {
        if( amount > 0.0 && amount <= balance)
            balance = balance - amount ;
        else System.out.println("Withdrawal amount exceeded account balance");
    }


    public double getBalance() {
        return balance;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
