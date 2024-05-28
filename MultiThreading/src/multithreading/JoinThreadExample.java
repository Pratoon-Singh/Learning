package multithreading;

import java.sql.SQLOutput;

public class JoinThreadExample {
    public static void main(String[] args) {

        Runnable runnable = ()->{
            System.out.println("Thread Running");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Stopped");
        } ;

        Thread thread = new Thread(runnable, "Thread-1");
        thread.setDaemon(true);
        thread.start();
        System.out.println(Thread.currentThread().getName());
        try{
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        /*
        The join methods stop the other thread running till the thread which is calling join is completed
         */

    }
}
