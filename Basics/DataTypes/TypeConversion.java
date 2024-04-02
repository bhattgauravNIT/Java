package DataTypes;

public class TypeConversion {
    public static void main(String[] args) {
        /**
         * Here we have a int num1 int if of 4 bytes and we have a long b and long is of
         * 8bytes
         * so simply we are saying long b = num1 which means insert a type int into long
         * which is possible
         * as long is 8 bytes and int is 4 bytes so simply we can put a 4bytes into a 8
         * bytes and this refers to
         * conversion in java and is handled implicility by java.
         */
        int num1 = 986;
        long b = num1;
        System.out.println(b);

        /**
         * Here we have a long num2 which is of 8 bytes and a int n which if of 4 bytes
         * and when we are saying
         * int n = num2, we are trying to put a 8byte into a 4 byte which will lead to
         * loss of bytes and eventually
         * loss of data but still if we insist that yes we can bear this loss and ask
         * java that you convert it than its
         * casting and for that we need to say int n = (int) num2;
         */
        long num2 = 986;
        int n = (int) num2;
        System.out.println(n);

        /**
         * Casting happens between various primitive and non primitve datatypes in java
         * but not in each of them
         * example we cant cast a boolean with a char.
         */

        /**
         * Now we have a int num3 and another int num4, we are saying put num3*num4
         * which is a int*int into a long
         * whereas ideally an int*int is also a int , so these kind of sceanrio is
         * simple implicit conversion by java
         * as shown in the first example and is specifically known as type promotion.
         */
        int num3 = 123;
        int num4 = 9876;
        long res = num3 * num4;
        System.out.println(res);

        // Gives ascii code of char 'C';
        char c = 'a';
        System.out.println((int) c);
    }

}
