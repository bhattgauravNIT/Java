package LambdaExp;

/**
 * Lambda expression can be only used with functional interfaces.
 * Since a functional interface will only have one public abstract method
 * decleration.
 * 
 * Thus one way of using this was to have a class which implemnts this interface
 * and thus provide a method definition
 * to this abstract method of X functional interface.
 * 
 * However another way is to use anonymous inner class which provides definition
 * to this abstract method of interface
 * for every object being created.
 * 
 * Now firstly when we have done
 * X obj = new X(){} i,e created an refernce obj of type X which will follow an
 * imprint that we will defined inside
 * our anonymnous inner class.
 * 
 * However since in functional interface we are pretty sure that there is only
 * one abstract method which is needed to be
 * defined thus we can us a new syntax termed as lambda expression.
 * 
 * This is demonstrated in X obj1 .
 */

@FunctionalInterface
interface X {
    public abstract int add(int i, int j);
}

public class LambdaExp {
    public static void main(String[] args) {
        X obj = new X() {
            public int add(int i, int j) {
                System.out.println("Show implemented via anonymous inner class");
                return i + j;
            }
        };
        System.out.println(obj.add(5, 6));

        X obj1 = (int i, int j) -> {
            System.out.println("Show implemented via anonymous inner class but with lambda expression");
            return i + j;
        };
        System.out.println(obj1.add(10, 20));
    }

}
