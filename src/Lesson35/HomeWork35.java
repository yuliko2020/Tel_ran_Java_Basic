package Lesson35;
import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 11/06/2020  19:19
 */
public class HomeWork35 {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 2};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        int[] d = {0, 1, 2, 4, 1, 5, 6, 7};
        System.out.println(tripleUp(a));//→ true
        System.out.println(tripleUp(b));// → true
        System.out.println(tripleUp(c));//→ false
        System.out.println(tripleUp(d));//→ true

        int[] a1 = {2, 10, 3, 4, 20, 5};// → [2, 10, 10, 10, 20, 20]
        int[] a2 = {10, 1, 20, 2};//→ [10, 10, 20, 20]
        int[] a3 = {10, 1, 9, 20};//→ [10, 10, 10, 20]

        System.out.println(Arrays.toString(tenRun(a1)));
        System.out.println(Arrays.toString(tenRun(a2)));
        System.out.println(Arrays.toString(tenRun(a3)));
    }

    //21---For each multiple of 10 in the given array, change all the values following it
    //to be that multiple of 10, until encountering another multiple of 10.
    // So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
    //ПЕРЕСМОТРЕТЬ
    public static int[] tenRun(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 10 == 0) {
                while (array[i + 1] % 10 != 0) {
                    array[i + 1] = array[i];
                }
            }
        }
        return array;
    }

    //20--Return true if the array contains, somewhere,
    // three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25
    private static boolean tripleUp(int[] array) {
        for (int i = 0; i <= array.length - 3; i++) {
            if (array[i] + 1 == array[i + 1] && array[i + 1] + 1 == array[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
