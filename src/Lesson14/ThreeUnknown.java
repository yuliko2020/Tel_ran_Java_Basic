package Lesson14;

/**
 * Tel ran first project
 * 12/05/2020  16:57
 */
// Трое неизвестных : нужно написать алгоритм вывода на экран
// всех возможных комбинаций 3-х натуральных чиселдо 36 с определенными условиями:
//необходимо использовать вложенные циклы   :  x <= y <= z ; xyz = 36 --- например:
// 1 . x=1, y=1, z=36      2. x=1; y=3; z=12

public class ThreeUnknown {
    public static void main(String[] args) {
        int rowIndex = 1;
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowIndex + ") " + "x = " + x + ", y = " + y + ", z = " + z);
                        rowIndex++;
                    }
                }
            }
        }

    }


}

