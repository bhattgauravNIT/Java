package Loops;

/**
 * In js 25/10 was exact decimal value which is 2.5 however since here n is long
 * and we doing n/10 thus it will
 * not take into consideration the decimal values and thus 25/10 will be 2.
 */
public class WhileLoop {
    public static int digitsInNumber(long n) {
        if (n == 0)
            return 1;

        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        long n = 123456789;
        System.out.println(digitsInNumber(n));
    }

}
