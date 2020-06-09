package Lesson31_32;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 09/06/2020  11:47
 */
public class Exercises {
    public static void main(String[] args) {
     /*   int[] a1 = {2, 4, 1, 2}; // 1,2
        int[] a2 = {4, 1, 4, 2};
        int[] a3 = {4, 4, 1, 2, 3};
        System.out.print(Arrays.toString(post4(a1)));
        System.out.print(Arrays.toString(post4(a2)));
        System.out.print(Arrays.toString(post4(a3)));*/

        int[] b1 = {1, 10, 10, 2};
        int[] b2 = {10, 2, 10};
        int[] b3 = {1, 99, 10};
        System.out.print(Arrays.toString(without10(b1)));
        System.out.print(Arrays.toString(without10(b2)));
        System.out.print(Arrays.toString(without10(b3)));
    }

    // 02-11---Вернуть версию данного массива, где все 10 были удалены.
// Остальные элементы должны смещаться влево к началу массива по мере необходимости,
// а пустые пробелы и конец массива должны быть равны 0. Таким образом, {1, 10, 10, 2} дает {1, 2, 0, 0}.
// Вы можете изменить и вернуть данный массив или создать новый массив.
    public static int[] without10(int[] array) {
        int count =0;
        int[] output = new int[array.length];
        for (int i = 0; i <output.length; i++) {
            if (array[i]!=10){
                output [count]= array[i];
                count++;
            }
        }
        return output;
    }


    //02-10---Если задан непустой массив целых чисел, вернуть новый массив,
    // содержащий элементы из исходного массива, которые идут после последних 4 в исходном массиве.
    // Исходный массив будет содержать по крайней мере один 4.
    // Обратите внимание, что в Java допустимо создавать массив длиной 0
    public static int[] post4(int[] array) {
        int[] output;
// найти последнюю 4 и инициализировать output,идущими после 4.
        //Длина заданного массива минус место , на котором стоит последняя 4
        // инициализация output значениями , идущими после 4
        int four = 4;
        int last4 = 0;//место (индекс) , где стоит последнее 4
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == four) {
                last4 = i;
                break;
            }
        }
        output = new int[array.length - 1 - last4];
        System.out.println(output.length);
        for (int i = 0; i < output.length; i++) {
            output[i] = array[array.length - output.length + i];
        }

        return output;
    }


}
