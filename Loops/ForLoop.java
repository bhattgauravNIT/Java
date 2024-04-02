package Loops;

public class ForLoop {
    public static int getSumOfAsciiValuesOfChars(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            sum += ascii;
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "a";
        System.out.println(getSumOfAsciiValuesOfChars(str));
    }
}
