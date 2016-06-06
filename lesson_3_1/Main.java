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
        Thread runner = new Thread(new HelloRunnable2());
        runner.start();

//        // or short version
//        (new Thread(new HelloRunnable2())).start();


    }

}
