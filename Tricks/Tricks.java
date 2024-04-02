package Tricks;

/**
 * 1.Inserting 0b before a binary converts it directly to integer.
 * 2. c = 'A' , we can get B via c++.
 * 3. Math.random gives double value between 0 & 1 and thus we can use it
 * according to our need.
 */

public class Tricks {
    public static void main(String[] args) {
        int a = 0b101;
        char c = 'A';
        c++;
        System.out.println(a);
        System.out.println(c);
        int random = (int) (Math.random() * 10);
        System.out.println(random);
    }

}
