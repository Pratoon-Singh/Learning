package multithreading;

    class Calculator	extends Thread	{
        long sumUptoMillion;
        long sumUptoTenMillion;

        public void run()	{
            synchronized (this)	{
                calculateSumUptoMillion();
                notify();
            }
            calculateSumUptoTenMillion();
        }

        private void calculateSumUptoMillion()	{
            for (int i	=	0;	i	<	1000000;	i++)	{
                sumUptoMillion +=	i;
            }
            System.out.println("Million	done");
        }

        private void calculateSumUptoTenMillion()	{
            for (int i	=	0;	i	<	10000000;	i++)	{
                sumUptoTenMillion +=	i;
            }
            System.out.println("Ten	Million	done");
        }
    }


public class ThreadWaitAndNotify	{
    public static void main(String[] args)	throws InterruptedException	{
        Calculator thread	=	new Calculator();
        synchronized(thread){
            thread.start();
            thread.wait();
        }
        System.out.println(thread.sumUptoMillion);
    }
}
