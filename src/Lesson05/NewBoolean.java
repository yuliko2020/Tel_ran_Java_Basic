package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  17:11
 */
public class NewBoolean {

    public static void main(String[] args) {
        boolean a, b, c;
        a = true;
        b = false;
        c = a & b;
        System.out.println(c); // returns false because only one of the two required values​is true

        int d = 1, f = 2;
        boolean bool = d <= f;

        int i = 10;
        int j = 9;
        System.out.println(i > j); // returns true, because 10 is higher than 9

        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        int x = 10;
        System.out.println(x == 10); // returns true, because the value of x is equal to 10
    }
}
