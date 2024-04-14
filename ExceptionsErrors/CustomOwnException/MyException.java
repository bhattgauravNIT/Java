package ExceptionsErrors.CustomOwnException;

class GauravException extends Exception {
    public GauravException(String error) {
        super(error);
    }

}

public class MyException {
    public static void main(String[] args) {
        try {
            throw new GauravException("This is my own made exception");
        } catch (GauravException e) {
            System.out.println(e);
        }
    }

}
