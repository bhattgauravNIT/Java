package ExceptionsErrors.HandlingExceptions;

/**
 * So in this case we wrote some critical code , code which can give some run
 * time exceptions.
 * Sy we are dividing by 0 in the below case so it needs to be handled.
 * 
 * Moreover we are also trying to access an array Index which is not present in
 * an array , it leads to
 * index out of bound exception so we need to handle this as well.
 * 
 * So we hit line j/i surely its an execption so it gets catched in the catch
 * block of Airthmetic exception
 * now the porcess does not again start from next line that is arr[5], it starts
 * after the catch block, which is sout statement at the last.
 * 
 * So for a same try block we can have multiple catch block however once a
 * critical code sends execption and once code is
 * has reached the catch block that catch block will get executed and it will
 * not fall to other catch block
 * for the same try block.
 * 
 * However since now we have handled the exception thus code dont stop exceution
 * and moves to last line
 * of printing handled and working fine.
 * 
 * Now since all exceptions extends Exception class ex: Aithmetic exception
 * extends Exception class,
 * Array out of bound exception extends exception class.
 * So exception class is the parent and thus if we are unware that which child
 * class exception its currently is
 * thus we can go for a generic exception of Exception class which is byDefault
 * figure out that
 * this exception is falling under which exception category.
 */

public class HandlingExceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        int arr[] = new int[5];

        try {
            System.err.println(j / i);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Handled and working still");
    }

}
