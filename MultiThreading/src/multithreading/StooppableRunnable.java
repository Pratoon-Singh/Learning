package multithreading;

public class StooppableRunnable implements Runnable {
    private boolean stopRequested = false;

    public synchronized void requestStop() {
        this.stopRequested = true;
    }

    public synchronized boolean isStoppedRequested() {
        return stopRequested;
    }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("StoppableRunnable running");
        while (!stopRequested) {
            sleep(1000);
            System.out.println("...");
        }
        System.out.println("StoppableRunnable stopped");
    }


    public static void main(String[] args) {
        StooppableRunnable runnable = new StooppableRunnable();
        Thread thread = new Thread(runnable, "My Thread");
        thread.start();

        try {
            System.out.println(
                    Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("requesting Stop");
        runnable.requestStop();
        System.out.println("stop requested");
    }
}
