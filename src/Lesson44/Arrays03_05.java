package Lesson44;

/**
 * TelRanJavaBasicModulOne
 * 23/06/2020  11:01
 */
public class Arrays03_05 {
    public static void main(String[] args) {
        int[] outer1 = {1, 2, 4, 6};
        int[] a2 = {1, 2, 4, 6};
        int[] a3 = {1, 2, 4, 4, 6};

        int[] inner1 = {2, 4};
        int[] b2 = {2, 3, 4};
        int[] b3 = {2, 4};

        System.out.println(linearInOne(outer1, inner1)); // true
        System.out.println(linearInOne(a2, b2));//false
        System.out.println(linearInOne(a3, b3));//true

    }

    //Учитывая два массива целых, отсортированных в порядке возрастания,
    // внешний и внутренний, возвращают true, если все числа во внутреннем элементе появляются во внешнем.
    // Наилучшее решение - выполнить только один «линейный» проход обоих массивов,
    // используя тот факт, что оба массива уже отсортированы.
    public static boolean linearInOne(int[] outer, int[] inner) {
        int i = 0;
        int j = 0;

        while (i < inner.length && j < outer.length) {
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }

        }
        return true;
    }


    private static boolean linearIn(int[] outer, int[] inner) {
        boolean notFound;
        for (int i = 0; i < inner.length; i++) {
            notFound = true;
            for (int j = 0; j < outer.length; j++) {
                if (outer[j] == inner[i]) {
                    notFound = false;

                }
                if (notFound) return false;
            }

        }

        return true;
    }


}
