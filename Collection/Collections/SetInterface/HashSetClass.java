package Collection.Collections.SetInterface;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(1);
        s.add(10);
        s.add(10);

        for (int val : s) {
            System.out.println(val);
        }
    }

}
