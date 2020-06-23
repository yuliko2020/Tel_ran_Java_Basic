package Lesson44;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 23/06/2020  10:12
 */
public class ExercisesArray03_04 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, 1, 4};// → [1, 3, 4, 1]
        int[] a2 = {1, 3, 1, 4, 4, 3, 1};//→ [1, 3, 4, 1, 1, 3, 4]
        int[] a3 = {3, 2, 2, 4};//→ [3, 4, 2, 2]
        System.out.println(Arrays.toString(fix34(a1)));
        System.out.println(Arrays.toString(fix34(a2)));
        System.out.println(Arrays.toString(fix34(a3)));

    }

    //Вернуть массив, который содержит в точности те же числа, что и данный массив, но переставлен так,
    // что за каждым 3 сразу следует 4. Не перемещайте 3, но каждое другое число может двигаться.
    // Массив содержит одинаковое количество 3 и 4, каждые 3 имеют после него номер, который не является 3,
    // а 3 появляется в массиве перед любыми 4.
    private static int[] fix34(int[] array) {
        // найти индекс тройки
        //узнать что индекс идёт за тройкой
        // найти индекс четвёрок
        //поменять следующие
int count;
        do {
             count = 0;
            int indexAfterKey = array[0];
            int indexKeySingleFor = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == 3 && array[i + 1] != 4) {
                    indexAfterKey = i + 1;
                }
                if (array[i] == 4 && array[i - 1] != 3) {
                    indexKeySingleFor = i;
                }

            }
            int temp = array[indexAfterKey];
            array[indexAfterKey] = array[indexKeySingleFor];
            array[indexKeySingleFor] = temp;
            count++;

        }while (count == 0);
        return array;
    }

}