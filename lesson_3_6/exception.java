package lesson_3_6;

import java.io.IOException;

/**
 * @author László Hágó
 * @version 1.0
 * @since 2016-06-06
 */
public class exception {
    public static void main(String[] args) throws IOException {
        int ch = 0;
        while (ch != 'Q' && ch != 'q')
        {
            System.out.println("Press Q or q to quit.");
            ch = System.in.read();
        }
    }
}
