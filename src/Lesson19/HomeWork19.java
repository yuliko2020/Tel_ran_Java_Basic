package Lesson19;

/**
 * Tel ran first project
 * 19/05/2020  16:12
 */
public class HomeWork19 {
    public static void main(String[] args) {
        //System.out.println(backAround("aaa"));
        //System.out.println(backAround("Cat"));
        //System.out.println(backAround("Hello"));
        //System.out.println(startHi("Hi"));
        //System.out.println(startHi("Hi there"));
        //System.out.println(startHi("Hello hi"));
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));

    }

    //05
    public static String backAround(String str) {
        int length = str.length();
        char lastLetter = str.charAt(length - 1);
        return lastLetter + str + lastLetter;
    }

    //06
    public static boolean startHi(String str) {
        if (str.startsWith("Hi")) {
            return true;
        } else
            return false;
    }

    //07
    public static boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19) {
            return true;
        } else if (b >= 13 && b <= 19) {
            return true;
        } else if (c >= 13 && c <= 19) {
            return true;
        } else return false;
    }
}
