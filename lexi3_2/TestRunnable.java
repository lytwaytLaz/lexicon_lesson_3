package lexi3_2;

/**
 * Created by Elev1 on 2016-06-01.
 */
class AnonTestRunnable {
    private static void TestRunnable() {
        Thread runner = new Thread(new AnonTestRunnable()) {
            @Override
            public void run() {
                System.out.println("anon runner");
            }

}
