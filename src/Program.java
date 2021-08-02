
public class Program {
    public static void main(String[] args) {
        MyRunnable R1 = new MyRunnable("ThreadFromRunnable-1");

        R1.start();



        MyRunnable R2 = new MyRunnable("ThreadFromRunnable-2");

        R2.start();

        MyThread T1 = new MyThread("ThreadFromThread-1");

        T1.start();



        MyThread T2 = new MyThread("ThreadFromThread-2");

        T2.start();
    }
}
