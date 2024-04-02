package Loops;

/**
 * if we want the condition to execute atleast once irrespective the condition
 * is met or not at the
 * very beginning of the loop then we use do while loop.
 */
public class DoWhile {
    public static void executeOnceAtleast(int x) {
        do {
            System.out.println("Yes printed atleast once");
            x++;
        } while (x <= 4);
    }

    public static void main(String[] args) {
        int x = 5;
        executeOnceAtleast(x);
    }

}
