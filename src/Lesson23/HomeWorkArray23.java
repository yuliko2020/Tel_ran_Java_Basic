package Lesson23;

/**
 * Tel_ran_Java_Basic
 * 27/05/2020  09:38
 */
public class HomeWorkArray23 {
    public static void main(String[] args) {
        myFirstArrayExercise(5);
    }

    public static void myFirstArrayExercise(int elementCounts) {
        int[] digits = new int[elementCounts];

        for (int element : digits) {
            element = (int) (Math.random() * ((100 - 1) + 1));
            System.out.println("--------");
        }
        for (int i = 0; i < elementCounts; i++) {
            digits[i] = (int) (Math.random() * ((100 - 1) + 1));
            System.out.println("-------");
        }
        int min = digits[0];
        int max = digits[0];
        int middle = 0;

        for (int i = 0; i < elementCounts; i++) {
            if (digits[i] < min) {
                min = digits[i];

            }
            System.out.println(min);
        }
    }
}
