
import multithreading.SynchronousClass;
import multithreading.ThreadDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread is running");
            }
        });
        // This will create a new thread and execute the run method in that new thread
        thread.start();
        // This will execute the run method in the main thread
        thread.run();


        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        Thread thread1 = new ThreadDemo(){
            @Override
            public void run() {
                SynchronousClass synchronousClass= new SynchronousClass();
                try {
                    System.out.println(
                    synchronousClass.setandGetSum(1,2,3));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread2 = new ThreadDemo(){
            @Override
            public void run() {
                SynchronousClass synchronousClass= new SynchronousClass();
                try {
                    System.out.println(
                            synchronousClass.setandGetSum(4,5,6));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread3 = new ThreadDemo(){
            @Override
            public void run() {
                SynchronousClass synchronousClass= new SynchronousClass();
                try {
                    System.out.println(
                            synchronousClass.setandGetSum(7,8,9));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        thread3.start();
        thread1.start();
        thread3.join(); // waits for thread 3 to complete
        thread2.start();



//        SynchronousClass synchronousClass= new SynchronousClass();
//
//        System.out.println( synchronousClass.setandGetSum(2,4,6));
    }

}