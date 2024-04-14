package ExceptionsErrors.Keywords;

/**
 * Lets suppose there is a possibility of an unchecked exception to be thrown
 * for example
 * below we have a class A which has a method divide and takes two argumnets now
 * one way is to handle this
 * unchecked exception of aithmetic as we can divide with 0 by a try catch block
 * here itself in divided method.
 * 
 * Now lets say this method will be called by somewhere else so let that person
 * who call it has the responsibilty
 * of handling this exception by way he wants to handle it we just tell him that
 * yes we can have a exception.
 * so in the method itself we say throws ArithmeticException.
 * 
 * Now we are calling it from the main and thus we simply put this method call
 * inside a try catch block
 * and handle the exception in case it occurs effectively.
 */

class A {
    public int divide(int n1, int n2) throws ArithmeticException {
        return n1 / n2;
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {
        try {
            A obj = new A();
            obj.divide(0, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Process not stopped exceution");
    }

}
