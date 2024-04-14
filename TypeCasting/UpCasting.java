package TypeCasting;

/**
 * We have two classes class A and class B,
 * class A is the parent class and has a method showA , where as B class is the
 * child class and
 * has method showB.
 * 
 * Now in the main we are saying
 * A obj = new B();
 * 
 * That is create a reference of A which points to an object of B in heap.
 * Since obj is reference of A although it points to an object of B still we
 * can't access showB of class B.
 * 
 * Such scenario is called upcasting, its upcasted beacuse this obj is a
 * refernce of A which is the parent class although
 * its pointing to heap address of object of B class where B is the child class.
 * 
 */

class A {
    public void showA() {
        System.out.println("In show A");
    }
}

class B extends A {
    public void showB() {
        System.out.println("In show B");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        A obj = new B();
        obj.showA();
    }

}
