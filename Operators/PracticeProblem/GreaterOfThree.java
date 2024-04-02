package Operators.PracticeProblem;

public class GreaterOfThree {
    public static long greatest(long a, long b, long c) {
        if (a >= b && b >= c) {
            return a;
        } else if (b >= c && c >= a) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        long a = 8;
        long b = 7;
        long c = 6;
        System.out.println(greatest(a, b, c));
    }

}
