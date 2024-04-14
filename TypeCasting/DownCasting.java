package TypeCasting;

/**
 * Intially A class is the parent class having a method showA and we have a
 * child class of A which is B class
 * and its having a method showB.
 * 
 * Now in the main we did
 * A obj = new B();
 * 
 * means create a refernce varibale named obj of type class A which is pointing
 * to an object to class B in heap.
 * A obj = new B();
 * 
 * Now i again created a new refernce varibale named obj1 of type class B
 * however its pointing to the refrence obj
 * which is of type A so clearly we need to typecast here
 * B obj1 = (B) obj;
 * 
 * Now since A was the parent class and B is the child class and when i m saying
 * create a refernce varibale
 * of type B which should point to refernce varibale obj of type A and doing
 * typecasting,
 * 
 * obj which is refernce of A and A being parent class is being downcasted to an
 * refernce of B which is child class
 * such type casting is called downcasting.
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

public class DownCasting {
    public static void main(String[] args) {
        A obj = new B();
        B obj1 = (B) obj;
        obj1.showA();
        obj1.showB();
    }

}
