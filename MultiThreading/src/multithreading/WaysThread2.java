package multithreading;

public class WaysThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("My Runnable Interface Running ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My Runnable Interface Completed");

    }

    public static void main(String[] args) {
        WaysThread2 waysThread = new WaysThread2();
        waysThread.run();
//      This is the first way of running a thread using Runnable Interface.
        

    }
}
