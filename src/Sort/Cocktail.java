package Sort;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 05/06/2020  09:35
 */
public class Cocktail {
    public static void main(String[] args) {
        int[] myLittleArray = {100, 24, 56, 24, 87, 45, 15, 98, 1};
        System.out.println(Arrays.toString(CocktailSort(myLittleArray)));
    }
// ПРОВЕРИТЬ ДОМА
    private static int[] CocktailSort(int[] array) {
        int start = 0;
        int count=0;
        int end = array.length - 1;
        while (start <= end) {
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] = array[i] ^ array[i + 1];
                    array[i + 1] = array[i + 1] ^ array[i];
                    array[i] = array[i] ^ array[i + 1];
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i]  < array[i - 1]){
                    array[i] = array[i] ^ array[i - 1];
                    array[i - 1] = array[i - 1] ^ array[i];
                    array[i] = array[i] ^ array[i - 1];
                }
            }
            start++;
            count++;
            System.out.println(count);
        }


        return array;
    }
}
