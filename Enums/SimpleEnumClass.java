package Enums;

/**
 * Enum is a class which consist of named varibales and actually these varibales
 * are objects itself.
 * So in our example we have taken a Status enum class which is having by
 * default three objects that is
 * DONE, ERROR,IN_PROGRESS.
 * 
 * Now in main we say Status s = Status.ERROR; meaning create a reference of
 * Status enum class which will point to the
 * object lets say Status.ERROR.
 * 
 * Signifying enum class contains named objects.
 * 
 * Now we can simply use a switch case with these named objects or even a for
 * loop according to our needs.
 * 
 * A enum class by default extends enum class and therefore provides us with
 * methods like
 * EnumClassName.values() which returns all named object of that class in form
 * of an array.
 */

enum Status {
    DONE,
    ERROR,
    IN_PROGRESS,
}

public class SimpleEnumClass {
    public static void main(String[] args) {
        Status s = Status.ERROR;
        System.out.println(s);
        switch (s) {
            case IN_PROGRESS:
                System.out.println("In progress");
                break;
            case DONE:
                System.out.println("DONE");
                break;
            case ERROR:
                System.out.println("Opps something went wrong");
                break;
            default:
                break;
        }

        Status[] ss = Status.values();
        for (Status status : ss) {
            System.out.println(status);
        }

    }

}
