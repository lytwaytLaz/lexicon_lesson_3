package nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-03
 * inner class private, accessed through a method
 */

class OuterClass {
    // no function in this example
    int num;

    // inner class
    private class InnerClass {
        public void print(){
            System.out.println("Dis is da inna class");
        }
    }
    // OuterClass method
    void display_Inner() {
        InnerClass inner = new InnerClass();
        inner.print();
    }

}

public class MyClass {
    public static void main(String[] args) {
        // Instantiate an OuterClass_3 object
        OuterClass outer = new OuterClass();

        // calling method in InnerClass
        outer.display_Inner();
    }
}
