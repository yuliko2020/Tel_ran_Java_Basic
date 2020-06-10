package Sort.SelectionSort;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 10/06/2020  09:56
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {44, 9, 100, 1, 7, 33, 156, 6};
        System.out.println(Arrays.toString(makeSortSelection(a)));

    }

    public static int[] makeSortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i; //индекс минимального числа
            for (int j = i+1; j <array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }


        return array;
    }
}
