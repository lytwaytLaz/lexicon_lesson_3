package Nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-03
 */
public class OuterClass {
    // Instance method of the outer class
    int num = 23;

    // method-local inner class
    class InnerClass {
        public void print() {
            System.out.println("Da method inna class: " + num  );
        }
    } // end of inner class

    //
}
