package Lesson25;

/**
 * TelRanJavaBasicModulOne
 * 28/05/2020  10:40
 */
public class GutentagArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 13;
        int[] array2 = new int[]{1, 2, 3};
        int[] array3 = myIntArrayPrint(array1);
        int[] array4;
        myIntPrint(array1);
        myIntPrint(array2);
        myIntPrint(new int[3]);
        myIntPrint(new int[]{1, 2, 3,});
        int a = 5;
        int b = 7;
        int c = sum(a, b);
    }

    public static void myIntPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ,");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int[] myIntArrayPrint(int[] array) {
        for (int value : array) {
            System.out.println(value + " ");
        }
        return array;
    }

}
