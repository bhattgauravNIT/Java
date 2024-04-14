package Collection.Collections.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(10);
        ll.add(99);
        ll.addFirst(12);
        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
