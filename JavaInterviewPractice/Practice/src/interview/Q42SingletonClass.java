package interview;

public class Q42SingletonClass {
    private Q42SingletonClass(){

    }

    private static volatile Q42SingletonClass instance = null;

    public static Q42SingletonClass getInstance(){
        if(instance==null){
            synchronized (Q42SingletonClass.class){
                if(instance==null){
                    instance = new Q42SingletonClass();
                }
            }
        }
        return instance;
    }
}
/*
Explanation:
Volatile Variable: The volatile keyword ensures that multiple threads handle the instance
variable correctly when it is being initialized to the Singleton instance.

Double-Checked Locking:

The first if (instance == null) check is to avoid the overhead of acquiring the lock if the
instance is already created.

The synchronized block ensures that only one thread can initialize the instance at a time.
The second if (instance == null) check inside the synchronized block ensures that the instance
is created only once. This check is necessary because multiple threads could have passed
the first if check and reached the synchronized block.

Advantages:

Thread Safety: Ensures that the instance is created safely in a multi-threaded environment.

Lazy Initialization: The singleton instance is created only when it is needed for the first time.

Performance: Minimizes synchronization overhead by using the synchronized block only during
the first instance creation.

This approach is effective and commonly used in real-world applications to implement the
Singleton pattern with thread safety and lazy initialization.
 */