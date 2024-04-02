package Array.OneDimensional;

/**
 * Its simply a one dimensional static sized array whose size os already known
 * to us.
 */
public class Array {
    public static void main(String[] args) {
        /** When the elements are already known to us. */
        int arr[] = { 1, 2, 3, 4 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /**
         * When the elments are not known to us but we know the size of the array
         * by default all the
         * elements in this 4 sized array will be setted to 0.
         */
        int arr1[] = new int[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
