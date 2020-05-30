package Lesson26;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 29/05/2020  12:01
 */

public class ExercisesArray1 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {8, 6, 7, 5, 3, 0, 9};
        int[] a3 = {1, 2, 3};
        System.out.println(Arrays.toString(midThree(a1)));
        System.out.println(Arrays.toString(midThree(a2)));
        System.out.println(Arrays.toString(midThree(a3)));

      /*  int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3, 1};
        int[] a3 = {1, 2, 1};
        System.out.println(sameFirstLast(a1));
        System.out.println(sameFirstLast(a2));
        System.out.println(sameFirstLast(a3));*/

        int[] m1 = {1, 2, 3};
        int[] m2 = {11, 5, 9};
        int[] m3 = {2, 11, 3};
        int[] m4 = {2, 11, 2};
        System.out.println(Arrays.toString(maxEnd3(m1))); // [3, 3, 3]
        System.out.println(Arrays.toString(maxEnd3(m2))); //[11, 11, 11]
        System.out.println(Arrays.toString(maxEnd3(m3))); // [3, 3, 3]
        System.out.println(Arrays.toString(maxEnd3(m4))); // [2, 11, 2]

      /*  int[] a1 = {4, 5, 6};
        int[] a2 = {1, 2};
        int[] a3 = {3};
        System.out.println(Arrays.toString(makeLast(a1)));// [0, 0, 0, 0, 0, 6]
        System.out.println(Arrays.toString(makeLast(a2)));//  [0, 0, 0, 2]
        System.out.println(Arrays.toString(makeLast(a3)));// [0, 3]*/
        int[] myTest1 = {1, 2, 3};
        int[] myTest2 = {1, 3};
        int[] yourTest1 = {7, 2, 3};
        int[] yourTest2 = {1};
        int[] anotherTest1 = {1, 2};
        int[] anotherTest2 = {};

        System.out.println(start1(myTest1, myTest2));
        System.out.println(start1(yourTest1, yourTest2));
        System.out.println(start1(anotherTest1, anotherTest2));


    }

    // 08 Given an array of ints of odd length, return a new array length 3 containing
// the elements from the middle of the array.
// The array length will be at least 3.
    public static int[] midThree(int[] array) {
        int[] output = new int[3];
        output[0] = array[array.length / 2 - 1];
        output[1] = array[array.length / 2];
        output[2] = array[array.length / 2 + 1];
        return output;
    }

    // 10 Given an array of ints, return true if the array is length 1 or more,
    // and the first element and the last element are equal.
    public static boolean sameFirstLast(int[] array) {

        return array.length > 1 && array[0] == array[array.length - 1];
    }

    // 12
    public static int[] maxEnd3(int[] array) {
        if (array[0] > array[array.length - 1]) {
            Arrays.fill(array, array[0]);
        } else if (array[array.length - 1] > array[0]) {
            Arrays.fill(array, array[array.length - 1]);
        }
        return array;
    }


    // 14Given an int array, return a new array with double the length where its last element is
    // the same as the original array, and all the other elements are 0. The original array will be length 1 or more.
    // Note: by default, a new int array contains all 0's.
    public static double[] makeLast(int[] array) {
        double[] output = new double[array.length * 2];
        output[output.length - 1] = array[array.length - 1];
        return output;
    }


    //15Start with 2 int arrays, a and b, of any length.
    // Return how many of the arrays have 1 as their first element.
    public static int start1(int[] a1, int[] a2) {
        int count = 0;
        for (int element : a1) {
            if (element == 1) count++;
        }
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] == 1) count++;
        }
        return count;
    }

}
