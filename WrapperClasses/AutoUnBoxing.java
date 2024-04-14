package WrapperClasses;

/**
 * In this case we have an wrapper class Integer.
 * Integer num = 7;
 * 
 * so num is a refernce varibale which is pointing the an object of Integer
 * class in heap.
 * So we wish to unwrap this object into a primitive data type say int.
 * 
 * So we did
 * int num1 = num.intValue();
 * 
 * This unwrapping is being done explicitly by us and is termed as unboxing
 * 
 * However java itself also can take care of this unboxing on its own so if i
 * say
 * int num2 = num;
 * 
 * This is called as autoUnboxing.
 * 
 */

public class AutoUnBoxing {
    public static void main(String[] args) {
        Integer num = 7;
        int num1 = num.intValue();

        int num2 = num;
        System.out.println(num1);
        System.out.println(num2);
    }
}
