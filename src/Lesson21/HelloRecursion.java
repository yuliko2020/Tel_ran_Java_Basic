package Lesson21;

/**
 * Tel ran first project
 * 22/05/2020  10:07
 */
public class HelloRecursion {
    public static void main(String[] args) {
        System.out.println(myLovelyFactorial(7));
        // 7 * 6 * 5 * 4 * 3 * 2
    }
    public static int myLovelyFactorial(int digits) {
        if (digits > 1) {
            return digits * (myLovelyFactorial(digits - 1));
        } else {
            return 1;
        }
    }

}
