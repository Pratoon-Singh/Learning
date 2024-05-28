package multithreading.virtual;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {
    public static void main(String[] args) {
        Runnable run = () -> {
            long startTime = System.currentTimeMillis();
            long sum = 1;
            for (long i = 1; i < 1000000L; i++) {
//                System.out.println(i + " Virtual Thread");
                 sum=sum+i;

            }
            long endTime = System.currentTimeMillis();
            System.out.println("Total time taken : " + (endTime - startTime) + " milliseconds "+ sum);

        };

//        Thread startThread = Thread.ofVirtual().start(run);

        Thread startThread = new Thread(run);
        startThread.start();

//        Thread unstartedThread = Thread.ofVirtual().unstarted(run);

        try {
            startThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
