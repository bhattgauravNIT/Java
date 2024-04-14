package Collection.Collections.Map;

import java.util.HashMap;

public class HashMapClass {

    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        mp.put(1, "Gaurav");
        mp.put(2, "Bhatt");
        mp.put(3, "Pandu");
        System.out.println(mp);
        System.out.println(mp.get(1));
        System.out.println(mp.get(4));
        System.out.println(mp.keySet());
        for (int key : mp.keySet()) {
            System.out.println(mp.get(key));
        }
    }

}
