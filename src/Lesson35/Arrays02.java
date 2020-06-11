package Lesson35;

/**
 * TelRanJavaBasicModulOne
 * 11/06/2020  11:50
 */
public class Arrays02 {
    public static void main(String[] args) {
        int[] a = {1, 7, 7};//true
        int[] b = {1, 7, 1, 7};//true
        int[] c = {1, 7, 1, 1, 7};//false

        System.out.println(has77(a));
        System.out.println(has77(b));
        System.out.println(has77(c));

        // Exercises-Arrays-02-19
        int[] first = {3, 1, 3, 1, 3}; //true
        int[] second = {3, 1, 3, 3}; //false
        int[] third = {3, 4, 3, 3, 4}; //false
        System.out.println("Решение Exercises-Arrays-02-19");
        System.out.println(haveThree(first));
        System.out.println(haveThree(second));
        System.out.println(haveThree(third));
        System.out.println("Конец решения Exercises-Arrays-02-19");
    }

    // 01-19 Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
    // and no 3's are next to each other
    public static boolean haveThree(int[] array) {
        boolean result = false;
        int digitCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 && i < array.length - 1) {
                if (array[i + 1] != 3) {
                    digitCount++;
                }
            }
        }
        if (array[array.length - 1] == 3 && array[array.length - 2] != 3) {
            digitCount++;
        }
        if (digitCount == 3) result = true;
        return result;
    }

    //01-18--Given an array of ints, return true if the array contains two 7's next to each other,
    // or there are two 7's separated by one element, such as with {7, 1, 7}.
    private static boolean has77(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 7) {
                if (array[i + 1] == 7 || array[i + 2] == 7) {
                    return true;
                }
            }
        }
        return false;
    }


}
