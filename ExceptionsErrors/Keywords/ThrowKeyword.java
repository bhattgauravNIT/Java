package ExceptionsErrors.Keywords;

/**
 * Throw keyword is used to call the catch block on our own, lets suppose we
 * ourselves intend to
 * throw a error and call the catch block then we use throw keyword.
 * 
 * We can throw a exception of deafult types like that of Exception class or may
 * be an airthmetic class
 * or even we can create our own exception class as depicted in
 * CustomOwnException folder.
 */

public class ThrowKeyword {
    public static void main(String[] args) {
        try {
            throw new Exception("This is own thrown exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
