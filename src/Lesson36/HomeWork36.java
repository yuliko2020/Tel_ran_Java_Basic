package Lesson36;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 14/06/2020  12:31
 */
public class HomeWork36 {

    public static void main(String[] args) {
        int[] a = {10, 13, 9, 7, 22, 46, 5, 9, 3, 78};
        // System.out.println(Arrays.toString(shellSort(a)));
        System.out.println(Arrays.toString(shellSorting(a)));
    }

    //  With Google
    private static int[] shellSorting(int[] array) {
        int temp;
        int h = 0;//величина интервала

        //вычисляем исходное значение интервала
        while (h <= array.length / 3)
            h = 3 * h + 1;

        for (int k = h; k > 0; k = (k - 1) / 3)
            for (int i = k; i < array.length; i++) {
                temp = array[i];
                int j;
                for (j = i; j >= k; j -= k) {
                    if (temp < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = temp;
            }
        return array;
    }



  /*
    public static int[] shellSort(int[] array) {
        int n = array.length;
        //// Начинаем с большого разрыва, затем уменьшаем разрыв -Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size. he first gap elements
            // a[0..gap-1] are already in gapped order keep adding one more element until
            // the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap sorted save a[i] in temp and make
                int temp = array[i];
                // shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                // put temp (the original a[i]) in its correct location
                array[j] = temp;
            }
        }
        return array;
    }*/
}