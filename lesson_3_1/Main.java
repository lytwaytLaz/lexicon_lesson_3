package lesson_3_1;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-01
 */


class HelloRunnable2 implements Runnable {
    //@Override bör alltid vara med
    @Override
    public void run(){
        System.out.println("Hello from a thread!");
    }
}

public class Main {
    public static void main(String[] args) {
        HelloRunnable2 runner = new HelloRunnable2();
        Thread threader1 = new Thread(runner);
        threader1.start();
        System.out.print(threader1.getName() + ": ");


//        //shorter version
//        Thread threader2 = new Thread(new HelloRunnable2());
//        threader2.start();
//        System.out.print(threader2.getName() + ": ");
//
//        // or even shorter version, cannot get name this way
//        (new Thread(new HelloRunnable2())).start();


    }

}
