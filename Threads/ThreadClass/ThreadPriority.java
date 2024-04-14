package Threads.ThreadClass;

/**
 * Here we are trying to suggest/request the scheduler to give this thread a max
 * priority
 * priority generally has range from 1 to 10 where 1 is min Priority, 5 is avg
 * priority and
 * 10 is max priority.
 * 
 * However descpite of our siggestion it totally depends upon the scheduler
 * whether
 * it wants to give that thread the priority or not and thus giving 10 or max
 * priority does not mean that
 * the priority will be given to that thread.
 * 
 * Moreover we can request/suggest the scheduler to make our thread sleep or put
 * it in a waiting stage for
 * some time in between the process
 * but again it depends on OS scheduler how he wish to perceive accordingly.
 */
class A extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.setPriority(10);
        obj.start();
        obj1.start();
    }

}
