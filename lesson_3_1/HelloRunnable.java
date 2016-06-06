package lesson_3_1;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-06
 */
public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();

        //more explanatory, same function as above
        Thread thread1 = new Thread(new HelloRunnable());
        thread1.start();
    }

}
