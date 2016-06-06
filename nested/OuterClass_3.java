package nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-06
 * method-local inner class and how to access it
 */
public class OuterClass_3 {
    // instance method of the outer class
    void myMethod_3() {
        int num = 23;

        // method-local inner class
        class MethodInner_3 {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        }// and of inner class

        // Accessing the inner class
        MethodInner_3 inner = new MethodInner_3();
        inner.print();
    }

    public static void main(String[] args) {
        OuterClass_3 outer = new OuterClass_3();
        outer.myMethod_3();
    }

}

