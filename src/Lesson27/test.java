package Lesson27;

/**
 * TelRanJavaBasicModulOne
 * 02/06/2020  20:56
 */
public class test {
    public static void main(String[] args) {
        boardTable();
    }

    public static void boardTable() {
        int[][] multiplyTable = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTable[i][j] = (i + 1) * (j + 1);
                // используем символ табуляции
                System.out.print(multiplyTable[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
