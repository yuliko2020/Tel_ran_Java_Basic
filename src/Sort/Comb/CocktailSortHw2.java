package Sort.Comb;
/**
 * TelRanJavaBasicModulOne
 * 04/06/2020  20:47
 * Помог интернет
 */

public class CocktailSortHw2 {
    public static void main(String[] args) {
        int[] array = {104, 64, 34, 25, 12, 22, 11, 90, 13};
        int left = 0; // левая граница
        int right = array.length - 1; // правая граница

        do {
            //Сдвигаем к концу массива "тяжелые элементы"
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--; // уменьшаем правую границу
            //Сдвигаем к началу массива "легкие элементы"
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++; // увеличиваем левую границу
        } while (left <= right);

        for (int i : array)
            System.out.print(i + " "); // вывод массива на экран
    }


}



