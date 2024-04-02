package Operators;

/**
 * We have addition, subtraction, multiplication, division, modulo , bitwise
 * opeartions etc.
 * The major difference between post increment and pre incremenet is that in
 * post incremnet we
 * first assign and then increase whereas in preIncrement we first increase and
 * then assign.
 */

public class AirthmeticOperators {
    public static void main(String[] args) {
        long num1 = 1;
        long num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(num1 | num2);
        System.out.println(num1++);
        System.out.println(num1);
        System.out.println(++num2);
        System.out.println(num2);

    }
}
