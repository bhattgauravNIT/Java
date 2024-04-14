package InputOutput;

import java.util.Scanner;

/**
 * Lets understand what is System.out.println
 * 
 * So println is a method which is present in printStream class so in order to
 * access this we need
 * a object of printStream class.
 * 
 * But in System class we have a static object already created of prtintStream
 * which is named as out
 * so since its a static object we can directly access it with System class and
 * thus
 * 
 * Overall
 * 
 * System class is having a static object out of print stream class and thus we
 * can access println method of printstream class.
 * 
 * 
 * Similarly we can use scanner class to get input from user now Scaneer class
 * takes object of inputStream
 * which is already present an static member in System class thus we simply pass
 * System.in
 * Then in case of int values we can convert them and use them.
 * 
 * Its always crucial to close the resource after using it and thus we close scn
 * object.
 */

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Print");

        System.out.println("Enter your input");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(n);

        scn.close();
    }

}
