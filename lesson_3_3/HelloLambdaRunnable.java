package lesson_3_3;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-06
 */
public class HelloLambdaRunnable {
    public static void main(String[] args)
    {
        Runnable task = () -> { System.out.println("Hello from a lambda thread!"); };
        new Thread(task).start();
    }
}
