package multithreading;

import java.sql.SQLOutput;

public class WaysThread extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread Running ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My thread Completed");

    }

    public static void main(String[] args) {
        WaysThread waysThread = new WaysThread();
        waysThread.start();
//      This is the first way of running a thread using extending of thread class it is not as nice as implementing Runnable  Interface.


    }
}
