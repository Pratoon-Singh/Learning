package multithreading;

public class WaysThread4 {

    public static void main(String[] args) {

     Runnable runnable = ()->{
         System.out.println("Running Using Lambada");
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         System.out.println("Finished Using Lambada");

     };
     Thread thread = new Thread(runnable);
     thread.start();
        System.out.println(thread.getName());
    }
}
