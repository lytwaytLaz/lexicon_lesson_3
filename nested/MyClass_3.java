package nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-12
 */
public class MyClass_3
{
    // instance method of the outer class
    void myMethod()
    {
        int num = 23;

        //method-local inner class
        class MethodInner_Demo
        {
            public void print()
            {
                System.out.println("This is a method of the inner class " + num);
            }
        }//end of inner class

        //Accessing the inner class
        MethodInner_Demo inner = new MethodInner_Demo();
        inner.print();
    }

    public static void main(String[] args)
    {
        MyClass_3 outer = new MyClass_3();
        outer.myMethod();
    }
}
