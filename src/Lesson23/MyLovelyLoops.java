package Lesson23;


/**
 * Tel_ran_Java_Basic
 * 26/05/2020  10:02
 */
public class MyLovelyLoops {
    public static void main(String[] args) {
        fibonacci(25);
        fibonacci(20);

    }

    public static void fibonacci(int lastLine) {
        // 0,1,1,2,3,5,8,13,21,34
        int n0 = 0;
        int n1 = 1;
        for (int i = 1; i < lastLine; i++) {
            int myFibonacciDigitNow = n0 + n1;
            n0 = n1;
            n1 = myFibonacciDigitNow;
            System.out.println(myFibonacciDigitNow);
        }
    }
}
