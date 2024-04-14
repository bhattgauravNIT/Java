package Threads.ThreadClass;

/**
 * We have a class A with a method and a class B with a method now if we create
 * object of A and B
 * simply and call these two methods according to process execution lets say the
 * program was something like
 * 
 * class A {
 * public void show() {
 * for (int i = 0; i < 200; i++) {
 * System.out.println("Hi");
 * }
 * }
 * }
 * 
 * class B {
 * public void show() {
 * for (int i = 0; i < 200; i++) {
 * System.out.println("Hello");
 * }
 * }
 * }
 * 
 * public class BasicThread {
 * public static void main(String[] args) {
 * A obj = new A();
 * B obj1 = new B();
 * obj.show();
 * obj1.show();
 * }
 * 
 * }
 *
 * 
 * So first the process exceution would have created an object of A and then
 * created an object of B
 * then it would have called show method on object A and waited for it to
 * complete then after that it would have called
 * show method of B .
 * 
 * But however if we want both the methods of A and B to be processed
 * simultanously we would be using
 * concepts of thread so we will make class A extends Thread class making class
 * A as a thread now and similarly
 * with class B. After that we will start the thread so after creating an object
 * of A we will say
 * A obj = new A();
 * obj.start() and similarily to object of class B however in order for a thread
 * class to run
 * it needs a run method so we will create run methods in class A and class B
 * and then both will run
 * parallely.
 */

class A extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Hello");
        }
    }
}

public class BasicThread {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        obj1.start();
    }

}
