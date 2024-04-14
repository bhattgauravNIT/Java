package Collection.Collections.ListInterface;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        System.out.println(ls.size());

        for (int val : ls) {
            System.out.println(val);
        }
        System.out.println(ls);
        System.out.println(ls.get(0));
    }

}
