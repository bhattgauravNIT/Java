package Interface.MarkerInterface;

import java.io.*;

/**
 * Here we have a class A which is implemneting a Serializable now if we look at
 * Serializable interface than
 * it wont have any abstract method decleation and its nothing but a blank
 * inteface.
 * 
 * So a blank inteface is called as an marker interface.
 * 
 * However such interfaces serves a special purpose for complier.
 * In this case Serializable marker inteface helps in Serializable and
 * deSerializable of the objects of the
 * class which implemnets it or in other words it tells the compiler that the
 * object of this class(class which implements it)
 * are up for Serializable and deSerializable.
 * 
 * Coming to the concept of Serializable. Lets suppose we are playing a game and
 * we want to save progree what we have made
 * till now and save and exit so we can Serializable the result values and store
 * them in hard disk and once the user is back and
 * want to resume it from them we can deSerializable it back again.
 * 
 * This is what we are doing below we have created an object obj of class A
 * .Then we Serializabled it
 * to store it in some xyz.txt and later when we needed the state of the object
 * we simply deSerializabled it
 * and used it back.
 * 
 * So there are various other marker interfaces like Serializable, Clonable etc
 */

class A implements Serializable {
    String name;
    int empId;

    public A(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
}

public class MarkerInterface {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A obj = new A("Gaurav", 1);

        /** Serialization of object obj */
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        /** DeSerialization of xyz.txt into object of class A */
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        A b = (A) ois.readObject();

        System.out.println(b.name);

        oos.close();
        ois.close();
    }
}
