package Lesson30;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 07/06/2020  14:25
 */
public class HomeWork30 {
    public static void main(String[] args) {
        // charSort();
        myPrint(snowFlake());
    }

    public static void charSort() {
        String str = "mylovelylesson";
        char[] phrase = str.toCharArray();
        for (int i = 0; i < phrase.length; i++) {
            for (int j = i + 1; j < phrase.length; j++) {
                if (phrase[i] > phrase[j]) {
                    char temp = phrase[i];
                    phrase[i] = phrase[j];
                    phrase[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(phrase));
    }

    //initialize the String array with a snowflake.НЕ ПОЛУЧИЛОСЬ
    public static String[][] snowFlake() {
        int line = 10;
        String[][] output = new String[line][line];
        String space = " ";
        String star = "*";

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if (i == (line / 2) + 1 || j == (line / 2) + 1)
                    output[i][j] = star;
            }

        }

        return output;
    }

    public static void myPrint(String[][] arrayToPrint) {
        for (String[] arrayLittleElemnt : arrayToPrint) {
            for (String elementik : arrayLittleElemnt) {
                System.out.print(" " + elementik);
            }
            System.out.println("");
        }
    }
}