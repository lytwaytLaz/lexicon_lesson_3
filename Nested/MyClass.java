package Nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-03
 */

class OuterClass {
    int num; // no function in this example

    // inner class
    private class InnerClass {
        public void print(){
            System.out.println("Dis is da inna class");
        }
    }
    void display_Inner() {
        InnerClass inner = new InnerClass();
        inner.print();
    }

}


public class MyClass {
    public static void main(String[] args) {
        // Instantiate an OuterClass object
        OuterClass outer = new OuterClass();
        // calling method in InnerClass
        outer.display_Inner();
    }
}
