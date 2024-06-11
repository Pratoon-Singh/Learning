package multithreading;

class SharedObject {
    boolean flag = false;

    synchronized void waitForFlag() {
        while (!flag) {
            try {
                wait(); // Wait until flag is true
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Do something once flag is true
        System.out.println("Flag is now true");
    }

    synchronized void setFlag() {
        flag = true;
        notify(); // Notify waiting threads
    }
}

class MyThread implements Runnable {
    SharedObject sharedObject;

    public MyThread(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    public void run() {
        sharedObject.waitForFlag();
    }
}

public class MyRunner {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        // Create and start a thread
        Thread thread = new Thread(new MyThread(sharedObject));
        thread.start();

        // Perform some tasks
        try {
            Thread.sleep(2000); // Simulating work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set the flag to true
        sharedObject.setFlag();
    }
}
