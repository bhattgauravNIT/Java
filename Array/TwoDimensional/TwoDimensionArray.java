package Array.TwoDimensional;

/**
 * Its a kind of multidimensional array but still however we know the size of
 * rows as well as the columns
 * and its 2-D in nature just like a n*m matrix.
 */

public class TwoDimensionArray {
    public static void main(String[] args) {

        /** When the elemnets are already know to us. */
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * Two Dimensional array when the elements are not know to us but the size
         * of dimensions are known to us.
         */
        int arr2[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        /**
         * Enhanced for loop
         * The multidimensional array is a container that contains 3 arrays considered
         * as rows and
         * every row is of size 4 meaning columns so we can say its a 3*4 array.
         * arr2
         * | |0_0_0_0|
         * | |0_0_0_0|
         * | |0_0_0_0|
         * |____________________________________
         * 
         * So int n[]: arr2 gives every individual row and int i: n gives every value of
         * that row.
         */
        for (int n[] : arr2) {
            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
