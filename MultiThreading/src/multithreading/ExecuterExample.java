package multithreading;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ExecuterExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("Helo");
                }
            }
        });


        Future future = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("From executorService1");
            }
        });
        future.get();


        Future futureFromCallable = executorService.submit(new Callable() {
            public String call() throws Exception {
                return  "Submittedd Successfully" ;
            }
        });
        System.out.println("futureFromCallable.get() = "
                + futureFromCallable.get());
        executorService.shutdown();
    }
}
