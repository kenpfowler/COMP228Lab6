//created transaction class that implements the runnable interface
public class Transaction implements Runnable {

    //fields to store a name and refer to an account
    private Account myAccount;
    private String name;

    //constructor to pass a name and account to the Transaction class
    public Transaction(String name, Account myAccount)
    {
        this.myAccount = myAccount;
        this.name = name;
    }

    //override the run method to create a runnable
    @Override
    public void run() {
        try {
            myAccount.Deposit(1000);
            myAccount.Withdraw(500);
            String output = String.format("Transaction named: %s is complete. Your balance is: %f", this.name, this.myAccount.getBalance());
            System.out.println(output);
        }
        catch (Exception exception)
        {
        exception.printStackTrace();
        }
    }
}
