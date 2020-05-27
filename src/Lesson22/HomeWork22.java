package Lesson22;

/**
 * Tel_ran_Java_Basic
 * 25/05/2020  19:07
 */
public class HomeWork22 {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("А роза упала на лапу Азора"));//-> true
        System.out.println(checkPalindrome("поп")); //-> true
        System.out.println(checkPalindrome("школа"));// -> false

    }

    private static boolean checkPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
