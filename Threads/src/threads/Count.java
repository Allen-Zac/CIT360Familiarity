package threads;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Zac Allen
 */
public class Count implements Runnable {
    String name;
    int number;
    //private AtomicInteger number = new AtomicInteger();
    //Random rand = new Random();
    int rand = ThreadLocalRandom.current().nextInt(10);
    
    public Count(String x) {
        name = x;
        number = rand;
    }
    
    @Override
    public void run() {
        System.out.printf("%s is counting to %d\n", name, number);
        //Thread.sleep(number);
        for (int i = 0; i < number; i++) {
            System.out.printf("%s says: %d\n", name, i + 1);
        }
        System.out.printf("%s has finished counting!\n", name);
    }
}
