package lesson_3_9;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-13
 */
public class Main
{
    public static void main(String... args)
    {
        if (args.length != 1)
        {
            System.err.println("usage: java Main <String [String]...>");
            System.exit(1);
        }

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println(args[0]);
            }
        }).start();

        //same but more explanatory, also you can get thread name
        Runnable runner9 = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println(args[0]);
            }
        };

        Thread thread1 = new Thread(runner9);
        thread1.start();
        System.out.print(thread1.getName() + ": ");
    }


}
