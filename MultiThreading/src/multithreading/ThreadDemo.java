package multithreading;

import java.util.ArrayList;

public class ThreadDemo extends  Thread{
    volatile int count;
    public void run() {
        for (int i = 0; i <=10; i++) {
            count+=i;
        }
        System.out.println(count);
    }

}
