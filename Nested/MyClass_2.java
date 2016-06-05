package Nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-03
 */

class Outer_Demo {
    //private variable of the outer class
    private int num= 175;
    //inner class
    public class Inner_Demo{
        public int getNum(){
            System.out.print("This is the getnum method of the inner class: ");
            return num;
        }
    }
}

public class MyClass_2 {
    public static void main(String[] args) {
        // Instantiate an Outer_Demo object;
        Outer_Demo outer = new Outer_Demo();
        // Instantiate an Inne_Demo object
        Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }

}
