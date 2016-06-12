package lesson_3_2;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-12
 */
public class Main
{
    public static void main(String[] args)
    {
        Runnable runner2 = new Runnable()
        {
            @Override
            public void run()
            {
                {
                    System.out.println("Hello from new thread");
                }
            }
        };

        Thread thread2 = new Thread(runner2);
        thread2.start();
        System.out.print(thread2.getName() + ": ");
    }


}
