package Array.TwoDimensional;

/**
 * Its also a kind of a multidimesional array only however all
 * the columns of every row or
 * the size of every row will not be same and will be kind of unknown.
 * Such kind of array are known as jagged array.
 */
public class JaggedArray {
    public static void main(String[] args) {
        /**
         * Jagged array
         * So the number of rows that will be there in this array is known to us i,e 3
         * however what will be the
         * size of each row is not known to us and we need to handle that what size we
         * need to give to each row's array.
         * So we say arr[0] = new int[3]; meaning the size of the first array or the
         * first row in this multi dimensional
         * arrray will be 3 and similarly we can give for others.
         */
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /** Enhanced for loop */
        for (int n[] : arr) {
            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
