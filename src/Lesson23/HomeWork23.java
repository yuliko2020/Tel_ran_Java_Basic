package Lesson23;

/**
 * Tel_ran_Java_Basic
 * 26/05/2020  19:33
 */
public class HomeWork23 {
    public static void main(String[] args) {

        int numOne = 1234, reversed = 0;
        while (numOne != 0) {
            int digit = numOne % 10;
            reversed = reversed * 10 + digit;
            numOne /= 10;
        }
        System.out.println("Reversed Number: 1234 " + reversed);

        int numTwo = 768;
        reversed = 0;
        while (numTwo != 0) {
            int digit = numTwo % 10;
            reversed = reversed * 10 + digit;
            numTwo /= 10;
        }
        System.out.println("Reversed Number: 768 " + reversed);
    }

    public static void digitSum() {
        int a = 1234;
        int b = 1;
        for (int i = 0; i < 4; i++) {
            a = (b * (b + 1)) / 2;
            b++;
        }

        System.out.println(a);
    }

}



