import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Account test class to test performing multiple transactions on the same object concurrently
public class AccountTest {
    public static void main(String[] args) {
        //create a new account object with a balance of 0
        Account myAccount = new Account(0);

        //create 3 transaction classes to perform transactions on account
        Transaction task1 = new Transaction("task1", myAccount);
        Transaction task2 = new Transaction("task2", myAccount);
        Transaction task3 = new Transaction("task3", myAccount);

        //organize transactions into an array list
        ArrayList<Transaction> transactionArrayList = new ArrayList<>();
        transactionArrayList.add(task1);
        transactionArrayList.add(task2);
        transactionArrayList.add(task3);


        System.out.println("Starting Executor");

        // create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // execute each transaction in the transactionArrayList
        transactionArrayList.forEach(transaction -> {executorService.execute(transaction);});

        // shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}
