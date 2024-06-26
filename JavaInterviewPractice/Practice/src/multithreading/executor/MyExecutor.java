package multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    public  static void main(String[] args) {
        int core = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(core);
        long initial = System.currentTimeMillis();
        System.out.println("initial "+initial);
        for (int i = 0; i < 10000; i++) {
            service.execute(new Demo());

        }
        System.out.println("Final Name : - "+Thread.currentThread().getName());
        service.shutdown();
        System.out.println(System.currentTimeMillis()-initial+"time: ");
    }
}
class Demo implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread Name : - "+Thread.currentThread().getName());
    }
}