package Annotations;

/**
 * Annotations are the supplements to the complier stating the compiler about
 * some special
 * things which we intent to do and thus it just keeps a check whether that
 * thing is being performed correctly or not
 * if not it throws error.
 * 
 * Ex: we have a class A with a show method which we are overriding in a class
 * B.
 * class B being the child class of Class A.
 * 
 * So there is a override annotation over show method of class B stating to the
 * complier that we are
 * trying to override the method show of class A here in class B.
 */

class A {
    public void show() {
        System.out.println("Show of class A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("Show of class B");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
