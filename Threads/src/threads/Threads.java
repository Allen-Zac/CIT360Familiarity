package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author Zac Allen
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        execute();
        ThreadsExtended extended = new ThreadsExtended("Extended Thread");
        extended.run();
    }
    
    private static Executor execute() {
        Executor ex = Executors.newCachedThreadPool();
        for (int i = 1; i <= 5; i++) {
            ex.execute(new Count("Thread " + i));        
        }
        return ex;
    }
}
