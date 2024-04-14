package Threads.Runnable;

/**
 * The problem with directly extending thread class from a class was that in
 * java multiple inheritance is not allowed
 * and thus if class A has extended thread class to make it a thread it now
 * can't extend some other class and thus
 * we need another way of making it as a thread. The solution lies in runnable
 * functional interface
 * A thread class also implemnets runnable interface and this run method is
 * declared in runnable interface only
 * and thus once we implemnet it we need to defined run method and thats what is
 * being done below.
 * 
 * Now we have two classes which implements runnable functional interface and
 * has thus defined run method.
 * 
 * Now in main we create two objects of A and B and since we need the start in
 * order to start we need to call
 * the start method of thread and thus we need objects of threads thus we made
 * 
 * Thread t1 = new Thread(obj);
 * Thread t2 = new Thread(obj1);
 * 
 * Now in order to make that linkage that which object shall belong to which
 * thread , the thread constructor takes in
 * objects as params.
 */

class A implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnables {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();
    }

}
