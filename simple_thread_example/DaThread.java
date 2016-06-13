package simple_thread_example;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-13
 */
public class DaThread
{
    public static void main(String[] args)
    {
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                String name = Thread.currentThread().getName();
                System.out.println("I'm runnin' in the thread " + name);
            }
        };

        Thread t = new Thread(runnable);
        t.start();

//        t.run(); //NO No NO - does NOT start the thread but runs in the main method.

        //lambda compressed version
        new Thread(() ->
        {
            System.out.println(("I'm runnin' in the thread " + Thread.currentThread().getName()));
        }).start();


    }
}
