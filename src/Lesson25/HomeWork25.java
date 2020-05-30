package Lesson25;

/**
 * TelRanJavaBasicModulOne
 * 28/05/2020  21:21
 */
public class HomeWork25 {
    public static void main(String[] args) {

        int[] a = {1, 3, 4, 5};//→ true
        int[] b = {2, 1, 3, 4, 5};//→ true
        int[] c = {1, 1, 1};//→ false
        System.out.println(unlucky1(a));
        System.out.println(unlucky1(b));
        System.out.println(unlucky1(c));

    }

    //9.We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    // Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
    public static boolean unlucky1(int[] array) {
        if (array.length > 1) {
            if (array[0] == 1 && array[1] == 3) return true;
            if (array[1] == 1 && array[2] == 3) return true;
            if (array[array.length - 2] == 1 && array[array.length - 1] == 3) return true;

        }
        return false;
    }


}
