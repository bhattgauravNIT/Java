package WrapperClasses;

/**
 * So int num = 7 is a primitive Datatype and we are tying to wrap it around a
 * class object which is a wrapper class.
 * For int the wrapper class is Integer.
 * 
 * We say Integer num1 = new Integer(num);
 * 
 * Clearly num was primitive and we wrapped it aroud a class object/wrapper
 * class Integer so previously
 * 
 * int num = 7 means create me a varibale num of primitive dataType in stack
 * with value 7.
 * Now
 * Integer num1 = new Integer(num);
 * 
 * means create me a refernce varibale num1 which points to an object of Integer
 * in heap with value 7 so num1 is a
 * refernce varibale.
 * 
 * Integer num1 = new Integer(num);
 * Since we are explicitly saying Integer num1 = new Integer(num) thus its
 * boxing.
 * 
 * Howeever
 * 
 * Integer num2 = num;
 * 
 * also works fine as in this case java is taking care of automatically boxing
 * this primitive dataType around
 * a wrapper class and thus its called autoBoxing.
 * 
 */

public class AutoBoxing {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(num);

        Integer num2 = num;
        System.out.println(num1);
        System.out.println(num2);
    }

}
