package InnerClasses.AbstractAnonymousInnerClass;

/**
 * Now in this case we have a abstract class A and inside it we have a abstract
 * method show
 * now since A is abstract thus we cant create an object of A
 * so one way to using it will be to have a class B which will extend class A
 * and will implemnet
 * this abstract method and then we can either create an refernce of A pointing
 * to an object of B
 * 
 * A obj = new B()
 * 
 * or an reference of B pointing towards object of B.
 * 
 * However if we want this implemnetaion of show method only for a specific
 * object and not for all the objects which
 * will be the case above after creating a class B .
 * 
 * We can use the concept of anonymous inner class and since this class is now
 * for an abstract class thus its called an
 * amonymous abstract inner class.
 * 
 * So we create
 * A obj = new A(){}
 * 
 * not signifying an object of abstract class beacause we cant create object of
 * abstract class however signifying
 * object of an anonymous inner class which will implement the method definition
 * of this show method of abstract class
 * along with if needed a different blue print.
 */

abstract class A {
    public abstract void show();
}

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Inside abstract anonymous Inner class");
            }
        };
        obj.show();
    }

}
