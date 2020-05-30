package Lesson26;

/**
 * TelRanJavaBasicModulOne
 * 29/05/2020  09:52
 */
public class ExerciseUnlucky {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 4, 5}; // true
        int[] a2 = {2, 1, 3, 4, 5}; // true
        int[] a3 = {2, 7, 3, 1, 3}; // true
        int[] a4 = {2, 7, 1, 3, 7}; // false
        int[] a5 = {1, 1, 1}; // false

        System.out.println(unlucky1(a1));
        System.out.println(unlucky1(a2));
        System.out.println(unlucky1(a3));
        System.out.println(unlucky1(a4));
        System.out.println(unlucky1(a5));


    }

    //9.We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
// Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    private static boolean unlucky1(int[] myArray) {
        boolean result = false;

        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] == 1 && myArray[i + 1] == 3) {
                if (i <= 1 || i >= myArray.length - 2) {
                    result = true;
                }
            }
        }
        return result;
    }

}