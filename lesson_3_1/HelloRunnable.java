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
        Thread thread3 = new Thread(new HelloRunnable());
        Thread thread1 = new Thread(new HelloRunnable());
        Thread thread2 = new Thread(new HelloRunnable());
        thread2.start();
        thread1.start();
//        thread3.start();


        // Threads get names automatically when started
        // in the order they are initiated
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
        System.out.println(thread3.getName());
    }

}
