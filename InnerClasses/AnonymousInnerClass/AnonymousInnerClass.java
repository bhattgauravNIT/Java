package InnerClasses.AnonymousInnerClass;

/**
 * Lets suppose I have a class A which have a method show
 * 
 * Now clearly A is a concrete class as we can create objects of it.
 * 
 * In the main lets create a object of A how now what we want is that we wish to
 * have a different implmentation or class
 * blueprint only for an object obj .
 * 
 * If in case we wanted to have a different implementation of say show method
 * for many objects we could have
 * created another class B and extended A class and then overrided this method
 * show but then this new implementation
 * would have been applicable for all the objects of B however i dont want that
 * i just want a new blue print or say
 * a different method defintion for only one specif object of A and thus we use
 * anonymous inner class in this case.
 * 
 * So in the main after i created an object of A i defined a new class without
 * any name simply using curly braces ex:
 * 
 * A obj = new A {
 * };
 * 
 * Thus there is no class name and there its anonymous now inside this class i
 * wrote my new blue print of class A say in this
 * method i just created a new implementation of show method .
 * 
 * Now since this class is innser to AnonymousInnerClass where the main method
 * is thus its also called as inner class and
 * therefore it falls under the category of anonymous inner class.
 */

class A {
    public void show() {
        System.out.println("In concrete class's show method");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In anonymous Inner class's show method.");
            }
        };

        obj.show();
    }
}
