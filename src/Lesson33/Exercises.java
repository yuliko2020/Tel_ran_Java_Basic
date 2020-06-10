package Lesson33;

/**
 * TelRanJavaBasicModulOne
 * 10/06/2020  10:45
 */
//Проверить последнее решение
public class Exercises {
    public static void main(String[] args) {
       /* int[] a = {1, 2, 2,};//5
        int[] b = {1, 2, 2, 6, 99, 99, 7, 25};//5
        int[] c = {1, 1, 6, 7, 2,};//4
        System.out.println(sum67(a));
        System.out.println(sum67(b));
        System.out.println(sum67(c));

        int[] k = {2, 3, 2, 2, 4, 2};//→ true
        int[] l = {2, 3, 2, 2, 4, 22};// → false
        int[] m = {1, 2, 3, 4};//→ false
        System.out.println(sum28(k));
        System.out.println(sum28(l));
        System.out.println(sum28(m));

        int[] k1 = {1, 4, 1, 4};//true
        int[] k2 = {2, 3, 2, 2, 4, 2, 2};//false
        int[] k3 = {1, 1};//true
        System.out.println(only14(k1));
        System.out.println(only14(k2));
        System.out.println(only14(k3));*/

        int[] l0 = {1, 2, 2, 1, 3,};
        int[] l1 = {1, 2, 1, 3,};
        int[] l2 = {1, 2, 1, 3};//
        int[] l3 = {1, 2, 1, 3, 4,};//false

        int valueOne = 1;
        int valueToo = 1;
        int valueThree = 1;
        System.out.println(isEverywhere(l1, valueOne));
        System.out.println(isEverywhere(l2, valueToo));
        System.out.println(isEverywhere(l3, valueThree));
    }

    //02_17--We'll say that a value is "everywhere" in an array if for every pair of adjacent
// elements in the array, at least one of the pair is that value.
// Return true if the given value is everywhere in the array.
    public static boolean isEverywhere(int[] array, int value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != value && array[i + 1] != value) return false;
        }

        return true;
    }

    //02_16--- Given an array of ints, return true if every element is a 1 or a 4.
    public static boolean only14(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) return false;
        }
        return true;
    }

    //02_15 ---Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public static boolean sum28(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                sum += array[i];
            }
        }
        if (sum == 8) return true;

        return false;
    }

    //02_14 ---Return the sum of the numbers in the array, except ignore sections of numbers starting
    // with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
    // Return 0 for no numbers.
    public static int sum67(int[] array) {
        int sum = 0;
        boolean sixMode = false;//режим работы
        for (int i = 0; i < array.length; i++) {
            if (sixMode) {
                if (array[i] == 7) {
                    sixMode = false;
                }
            } else if (array[i] == 6) {
                sixMode = true;
            } else {
                sum += array[i];
            }
        }
        return sum;
    }
}
