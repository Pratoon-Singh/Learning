package multithreading;

public class SynchronousClass {

    public  int setandGetSum(int a1,	int a2,	int a3) throws InterruptedException {
        int cell1 =	a1;
        sleepForSomeTime();
        int cell2 =	a2;
        sleepForSomeTime();
        int cell3 =	a3;
        sleepForSomeTime();
        return cell1 +	cell2 +	cell3;
    }

    private void sleepForSomeTime() throws InterruptedException {
        wait(50);
    }
}
