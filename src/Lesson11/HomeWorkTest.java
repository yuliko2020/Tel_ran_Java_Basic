package Lesson11;

/**
 * Tel ran first project
 * 06/05/2020  20:05
 * Даны целые числа A и B, где B > 0. Вывести B раз число A.
 * Вывести в порядке возрастания все числа между А и B, где а = 5, а B = 17.
 */
public class HomeWorkTest {
    public static void main(String[] args) {
        //int a = 5;
        //int b = 8;
       testMe(5, 8);
        int a = 5;
        int b = 17;
        //groingNumbers(5, 17);
    }

    public static void testMe(int a, int b) {

        for (int i = 0; i < b; i++) {
            System.out.println("Вывести на экран B - " + a);
        }
    }

    public static void groingNumbers(int a, int b) {

        for (int i = 5; i <= b; i++) {
            System.out.println("Вывести числа в порядке возрастания"  + i);
        }
    }

}
