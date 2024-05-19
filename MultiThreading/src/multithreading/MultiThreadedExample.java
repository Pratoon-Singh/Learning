package multithreading;

public class MultiThreadedExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int taskId = i;
            Runnable task = () -> {
                System.out.println("Task " + taskId + " is being executed."+Thread.currentThread().getName());
                // Simulating some task
                try {

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
