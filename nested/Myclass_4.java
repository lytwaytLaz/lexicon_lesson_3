package nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-12
 */
abstract class AnonInner
{
    public abstract void myMethod();
}

public class MyClass_4
{
    public static void main(String[] args)
    {
        AnonInner inner = new AnonInner()
        {
            @Override
            public void myMethod()
            {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.myMethod();
    }
}
