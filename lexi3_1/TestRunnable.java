package lexi3_1;

/**
 * Created by Elev1 on 2016-06-01.
 */
public class TestRunnable implements Runnable {
    @Override // bör vara med
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        Thread runner = new Thread(new TestRunnable());
        runner.start();

//        (new Thread(new TestRunnable())).start();
    }

}
