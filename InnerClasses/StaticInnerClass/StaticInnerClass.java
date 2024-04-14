package InnerClasses.StaticInnerClass;

/**
 * A concrete class cant be a static class just like A class, so
 * A class can't be a static class how ever it can contain static instance
 * varibale, static methods and
 * even static inner classes.
 * 
 * Now in this example class B is inner class of A and its static as well, Thus
 * in order to
 * create a object of this static inner class we dont need an object of A as
 * static belongs to class thus class
 * B now directly belongs to class A and is common for all objects of A.
 * 
 * Thus we can simply say A.B obj1 = new A.B();
 */

class A {
    String name;

    public void show() {
        System.out.println("In concrete class");
    }

    static class B {
        public void show1() {
            System.out.println("Inside static inner class");
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = new A.B();
        obj1.show1();

    }

}
