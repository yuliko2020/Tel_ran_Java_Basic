package Lesson24;

/**
 * Tel_ran_Java_Basic
 * 27/05/2020  11:29
 */
public class ArrayExampleTryAndCry {
    public static void main(String[] args) {
        arrayTrayAndCry((int)(Math.random()*100));
    }

    private static void arrayTrayAndCry(int countDigits) {
        int[] myArray = new int[countDigits];
        for (int element : myArray) {
            element = (int) (Math.random() * 100);
            System.out.print(element + " ,");
        }

    }


}
