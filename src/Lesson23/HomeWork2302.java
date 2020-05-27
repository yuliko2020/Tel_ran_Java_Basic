package Lesson23;

/**
 * Tel_ran_Java_Basic
 * 26/05/2020  22:03
 */
public class HomeWork2302 {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
        System.out.println(reverse(768));
        System.out.println(digitSum(1234));
        System.out.println(digitSum(768));
    }

    public static int reverse(int number) {
        int reverse = 0;
        int remainder;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        } while (number > 0);

        return reverse;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}


