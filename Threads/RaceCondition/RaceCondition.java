package Threads.RaceCondition;

/**
 * Now we have a class A which has a mutable data member a and we have a method
 * called increment which
 * change this mutable data member a. Now in the main lets create an object of A
 * call it obj.
 * 
 * Now lets create some threads using runnable function interface since runnable
 * is a functional interface and thus
 * we cant create an object of Runnable but we can use lambda expression to
 * create our own blue print for this runnable
 * interface( which is exactly same as creating a seperate class which
 * implemnets Runnable intefrace.)
 * 
 * Now we need to declare the run method which we are doing using concept of
 * anonymous inner class.
 * 
 * Inside it we are calling this increment method of class A inside a loop.
 * 
 * Similarly we are creating another thread using runnable and lambda and
 * anonymousn inner class calling it
 * t2.
 * 
 * We should start the thread using thread.start to start the therad.
 * But start method is a Thread class method thus lets create two objects of
 * thread class call them
 * Thread thread1 = new Thread(t1);
 * Thread thread2 = new Thread(t2);
 * 
 * Now lets call thread1.start();
 * and thread2.start();
 * 
 * Now we have used thread1.join() and thread2.join();
 * 
 * The significance here we have asked main to start two threads and and asked
 * it to wait till they complete their process
 * execution and thus the if we would not have written thread1.join();
 * thread2.join(); the main would not have waited for these thread to complete
 * its process excecution and would have executed the next line which is
 * System.out.println(obj.a);
 * This happened beacuse when we say thread1.start(); and thread2.start();
 * We asked main to start the thread which it did and thus it moved on .
 * 
 * So we used thread1.join() and thread2.join();
 * 
 * Now once the thread completed its process execution and came back to main now
 * it goes to next line
 * System.out.println(obj.a);
 * 
 * Now if the method of class A which is increment and (changing the mutable
 * data member) would have been something
 * like
 * public void increment() {
 * a++;
 * }
 * 
 * instead of
 * 
 * public synchronized void increment() {
 * a++;
 * }
 * 
 * This would have given rise to race condition and ambigious outputs.
 */

class A {
    int a;

    public synchronized void increment() {
        a++;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        Runnable t1 = () -> {
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        };

        Runnable t2 = () -> {
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(obj.a);
    }

}
