package DataTypes;

/**
 * There are two type of datatypes in java which are primitive and non
 * primitive.
 * 
 * Primite datatypes are inbuilt datatypes provided by the language and are.
 * 
 * byte -> 1 byte
 * short -> 2 byte
 * int -> 4 byte
 * long -> 8 byte (put l in last)
 * 
 * float -> 2 byte (put f in last)
 * double -> 4 byte
 * 
 * char -> 2 byte
 * boolean -> 1 byte
 */
public class PrimitiveDataTypes {
    public static void main(String args[]) {
        byte by = 127;
        short sh = 111;
        int num = 1;
        long l = 123l;

        float f = 12.9f;
        double d = 12.9;

        char c = 'C';
        boolean b = false;

        System.out.println(by + sh + num + l + f + d);
        System.out.println(c);
        System.out.println(b);
    }
}
