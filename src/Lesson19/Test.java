package Lesson19;

/**
 * Tel ran first project
 * 19/05/2020  16:17
 */
public class Test {
    public static void main(String[] args) {
        // System.out.println(backAround("Hello"));
        // System.out.println(backAround("Cat"));
        System.out.println(startHi("Hi"));
        //System.out.println(startHi("Hi there"));
        //System.out.println(startHi("Hello hi"));
    }


    public static String backAround(String str) {
        int length = str.length();
        char lastLetter = str.charAt(length - 1);
        return lastLetter + str + lastLetter;

    }


    // Given a string, return true if the string starts with "hi" and false otherwise.
    public static boolean startHi(String str) {

        if (str.length() < 2)
            return false;
        else {
            String firstTwo = str.substring(0, 2);
            if (firstTwo.equals("hi")) {
                return true;
            } else {
                return false;
            }
        }
    }
}