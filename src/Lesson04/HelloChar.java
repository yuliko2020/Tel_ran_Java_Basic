package Lesson04;

/**
 * Tel ran first project
 * 25/04/2020  20:17
 */
public class HelloChar {
    public static void main(String[] args) {
        getMeRandomDigit();
        getChar();
    }

    public static void getMeRandomDigit() {
        final int MIN = 30;
        final int MAX = 100;

        int randomDigits = (int) (Math.random() * (MAX - MIN)) + MIN;
        char randomChar = (char) randomDigits;
        System.out.println(randomChar);
    }

    public static void getChar() {

        char digit = 100;
        char symbolTwo = 'A';
        char tabulator = '\t';
        char symbol = '\u039A';
        char littleU = '\350';
        char euro = '\u20AC';
        char ampersand = '\u0026';

//charmap
        System.out.println(digit);
        System.out.println(symbol);
        System.out.println(symbolTwo);
        System.out.println(tabulator);
        System.out.println(littleU);
        System.out.println(euro);
        System.out.println(ampersand);
    }
}
