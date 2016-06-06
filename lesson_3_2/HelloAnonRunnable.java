package lesson_3_2;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-06
 */
public class HelloAnonRunnable {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from an anonymous thread!");
            }
        }).start();

        //more explanatory, same function as above
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from a more explanatory anonymous thread!!!");
            }
        };
        Thread thread1 = new Thread(task1);
        thread1.start();
    }
}
