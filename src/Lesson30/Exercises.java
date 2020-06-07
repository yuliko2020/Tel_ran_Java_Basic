package Lesson30;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 05/06/2020  12:08
 */
public class Exercises {
    public static void main(String[] args) {
        int[] a = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(a, 1));//false
        System.out.println(sameEnds(a, 2));// true
        System.out.println(sameEnds(a, 3));// false
    }

    //
    public static boolean sameEndsTwo(int[] array, int n) {
        String numbers = "";
        for (int i = 0; i < array.length; i++) {
            numbers = numbers + array[i];
        }
        if (numbers.substring(0, n).equals(numbers.substring(numbers.length() - n))) {
            return true;
        }
        return false;
    }


    //arrays2-8-- Вернуть true, если группа из N чисел в начале и конце массива совпадает.
    // Например, с {5, 6, 45, 99, 13, 5, 6} концы одинаковы для n = 0 и n = 2,
    // и ложны для n = 1 и n = 3. Вы можете предположить,
    // что n находится в диапазоне 0..nums.length включительно.
    public static boolean sameEnds(int[] array, int n) {
        int count = 0;
        for (int i = 0, j = n; i < n && j > 0; i++, j--) {
            if (array[i] == array[array.length - j]) {
                count++;
            }
            System.out.print(array[i] + " ");
            System.out.println(array[array.length - j] + " ");
        }
        //System.out.println(count);
        if (count == n) {
            return true;
        }
//        String numbers = Arrays.toString(array);
//        if (numbers.substring(0, n).equals(numbers.substring(numbers.length() - n))) {
//            return true;
//        }
//        System.out.print(numbers.substring(0, n) + ", ");
//        System.out.print(numbers.substring(numbers.length() - n) + ", ");
//        System.out.print(numbers+" ");
        return false;
    }


}
