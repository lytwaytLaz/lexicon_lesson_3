package nested;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-03
 * how to access the private members of a class using inner class
 */

class OuterClass_2 {
    //private variable of the outer class
    private int num= 175;

    //inner class
    public class InnerClass_2 {
        public int getNum(){
            System.out.print("This is the getnum method of the inner class: ");
            return num;
        }
    }
}

public class MyClass_2 {
    public static void main(String[] args) {
        // Instantiate an OuterClass_2 object;
        OuterClass_2 outer = new OuterClass_2();

        // Instantiate an InnerClass_2 object
        OuterClass_2.InnerClass_2 inner = outer.new InnerClass_2();
        System.out.println(inner.getNum());
    }

}
