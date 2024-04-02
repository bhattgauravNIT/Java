package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        long a = 1;
        long b = 2;
        long c = 3;
        long d = 4;
        System.out.println(a < b && c > d);
        System.out.println(a < b || b < d);
        boolean res = a < b;
        System.out.println(!res);
        System.out.println(Math.max(a, b));
    }

}
