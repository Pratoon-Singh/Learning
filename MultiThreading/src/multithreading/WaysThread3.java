package multithreading;

public class WaysThread3 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable(){

            @Override
            public void run() {
                System.out.println("My Runnable Interface Anonymous Class Running ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("My Runnable Interface Anonymous Class  Completed");
            }
        };

        Thread t = new Thread(runnable);
        t.start();
    }
}
