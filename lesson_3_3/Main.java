package lesson_3_3;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-13
 */
public class Main
{
    public static void main(String[] args)
    {
        Runnable runner3 = () -> {
            System.out.println("Hello from new lambda expression");
        };

        Thread thread3 = new Thread(runner3);
        thread3.start();
        System.out.print(thread3.getName() + ": ");

        //short version for starting thread, cannot get name like this
        new Thread(runner3).start();

    }
}
