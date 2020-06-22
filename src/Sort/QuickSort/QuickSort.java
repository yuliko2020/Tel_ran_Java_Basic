package Sort.QuickSort;

import java.util.Random;

/**
 * TelRanJavaBasicModulOne
 * 22/06/2020  10:55
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        randomFill(array);
        System.out.println(" Было ");
        myPrintArray(randomFill(array));
        System.out.println(" Стало ");
        quickSort(array);
        myPrintArray(array);
    }

    public static void quickSort(int[] array) {
        int begin =0;
        int end = array.length - 1;// Ошибка
        _quickSort(array, begin, end);
    }

    private static void _quickSort(int[] array, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);
            _quickSort(array, begin, partitionIndex - 1);
            _quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int begin, int end) {

        int i = begin - 1;
        int pivot = array[end];
        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;


        return i + 1;
    }

    private static void myPrintArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + " ]");
    }


    private static int[] randomFill(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
        }

        return array;
    }

}
