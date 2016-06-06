package lesson_3_9;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-06
 */
public class InputAnonRunnable {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java InputAnonRunnable <String>");
            System.exit(1);
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(args[0]);
            }
        }).start();
    }
}
