/**
 * Class name is same as file name else the .class file which will be formed
 * will not be of class SumofNumbers say
 * ex: file name is abc.java and class name is SumofNumbers so its different and
 * thus a abc.class file will be the byte code
 * file which will get generated and thus when we will fed it to JVM or
 * internally we run java Bytecode file name
 * if will say java abc and thus abc is no class and it will result in class not
 * found exception.
 * 
 * Thus its recommended to create the same file name as that of the class name.
 * 
 * In java since now we have both sum function and main function as a part of a
 * single class only thus we simply call it by name and no need for using this keyword like in ts or js.
 * 
 * We have used long dataType here as int is 4 bytes and thus long is of 8 bytes
 * and will prevent overflow for larger values .
 */
class FunctionCalling {
    public static long sum(long a, long b) {
        return a + b;
    }

    public static void main(String args[]) {
        long a = 5;
        long b = 10;

        System.out.println(sum(a, b));
    }
}