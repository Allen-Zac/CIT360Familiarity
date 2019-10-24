package threads;

import java.util.Random;

/**
 *
 * @author Zac Allen
 */
public class ThreadsExtended extends Threads{
    String name;
    int number;
    Random rand = new Random();
    
    public ThreadsExtended(String x) {
        name = x;
        number = rand.nextInt(10);
    }
    
    public void run() {
        System.out.printf("%s is counting to %d\n", name, number);
        //Thread.sleep(number);
        for (int i = 0; i < number; i++) {
            System.out.printf("%s says: %d\n", name, i + 1);
        }
        System.out.printf("%s has finished counting!\n", name);
    }
}
