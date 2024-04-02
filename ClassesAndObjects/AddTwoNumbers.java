package ClassesAndObjects;

/**
 * So here we have created a class Calculate which has a method add which will
 * eventually
 * add two numbers. This class is not a public class as if we wish to make it
 * public we needed to create a seperate
 * file for it and then while creating an object of Calculate class we needed to
 * import the package.className of this
 * calculate class in this AddTwoNumbers file and then we could have used it.
 * 
 * So to keep things simple we simply created a class directly in AddTwoNumbers
 * file without public keyword
 * and created a object of it and then
 * invoked the method add.
 * 
 * A class is simply the blue print of what it can do consisting of methods
 * constructors, instance varibales etc and an object is via which
 * we can use the class features or access them.
 * Object creation is taken care by JVM.
 */
class Calculate {
    public long add(long x, long y) {
        return x + y;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        long a = 12;
        long b = 13;
        Calculate calc = new Calculate();
        System.out.println(calc.add(a, b));

    }
}
