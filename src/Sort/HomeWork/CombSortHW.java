package Sort.HomeWork;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 03/06/2020  21:40
 */
public class CombSortHW {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        double shrink = 1.2473309;
        int step = array.length;
        boolean unsorted = true;

        while (unsorted || step != 1) {
            int count = 0;
            if (step > 1) {
                step = (int) (step / shrink);
            }
            for (int i = 0; i < array.length - step; i++) {
                if (array[i] > array[i + step]) {
                    int temp = array[i];
                    array[i] = array[i + step];
                    array[i + step] = temp;
                    count++;
                }
            }
            if (count == 0) {
                unsorted = false;
            }
        }
        return array;
    }


   /* public static int[] sortArray(int[] array){
        double shrinkFactor = 1.3;
        if(array.length >0){
            double gap = (array.length-1)/ shrinkFactor;

            while(gap>1){
                int i = 0;
                int j = (int) (i+ Math.floor(gap));
                while(j != array.length){
                    if(array[i]> array[j]){
                        array[i] = array[i] ^ array[j];
                        array[j] = array[j] ^ array[i];
                        array[i] = array[i] ^ array[j];
                    }
                    i++;
                    j++;
                }
                gap =gap/ shrinkFactor;
            }
        }
        return array;
    }*/
}
