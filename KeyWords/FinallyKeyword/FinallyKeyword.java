package KeyWords.FinallyKeyword;

import java.util.Scanner;

/**
 * So a finally keyword means it will aleays execute those lines of code
 * iresepective what happens
 * for example lets say we are having something in try block so there might be a
 * possibility of an exception
 * happening and therefore we use catch block to handle that even after that if
 * we want some thing to
 * always execute irrespective of not we have handled the exception or not then
 * we use finally block.
 * 
 * Its generally used to close the resources which are in open state in the
 * program for ex: sql connection,
 * Scanner etc.
 */

public class FinallyKeyword {
    public static void main(String[] args) {
        Scanner scn = null;
        try {
            scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println(n);
        } finally {
            scn.close();
        }
    }
}
