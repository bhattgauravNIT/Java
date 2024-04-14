package Interface.FunctionalInterface;

/**
 * A functional inteface is a special kind of interface and the only main
 * difference is that a functional
 * interface allows only one public abstract method decleration
 * 
 * unlike a interface which can have any number of public abstract method
 * decleartions
 * 
 * A functional interface however can have any number of static final varibales just like normal interface.
 */

@FunctionalInterface
interface X {
    static final String name = "Gaurav";

    public abstract void show();
}

class A implements X {
    @Override
    public void show() {
        System.out.println("Show implementation of interface method.");
    }
}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        X obj = new A();
        obj.show();
    }

}
