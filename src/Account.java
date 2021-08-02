public class Account {
    private double balance = 0;

    public Account(double balance)
    {
        this.balance = balance;
    }

    public synchronized void Deposit(double amount)
    {
        this.balance += amount;
    }

    public synchronized void Withdraw(double amount)
    {
        this.balance -= amount;
    }
}
