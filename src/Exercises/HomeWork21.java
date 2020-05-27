package Exercises;

/**
 * Tel ran first project
 * 23/05/2020  15:37
 */
public class HomeWork21 {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));// →true
        System.out.println(mixStart("pix snacks"));//→true
        System.out.println(mixStart("piz snacks"));// →false
        System.out.println(cigarParty(30, false));// →false
        System.out.println(cigarParty(50, false));// →true
        System.out.println(cigarParty(70, true));// →true
        System.out.println(lastChars("last", "chars"));// → "ls"
        System.out.println(lastChars("yo", "java") );//→ "ya"
        System.out.println(lastChars("hi", ""));//→ "h@"
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));//→ "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));//→ "HHii--TThheerree"
        System.out.println(closeFar(1, 2, 10));//→ true
        System.out.println(closeFar(1, 2, 3));//→ false
        System.out.println(closeFar(4, 1, 3));// → true
        System.out.println(makeChocolate(4, 1, 9));// →4
        System.out.println(makeChocolate(4, 1, 10));// →-1
        System.out.println(makeChocolate(4, 1, 7));// →2

    }

    //01E_08 exercises: Вернуть true, если данная строка начинается с «mix», за исключением того,
    // что «m» может быть чем угодно, поэтому «pix», «9ix» ..все считаются
    private static boolean mixStart(String str) {
        if (str.substring(1, 3).equals("ix")) {
            return true;
        } else
            return false;

    }

    //02_EL_01_01 : вечеринка белок успешна, когда количество сигар составляет от 40 до 60 включительно.
    //Если это  выходные, в этом случае не существует верхней границы количества сигар.
    //  Вернуть true, если вечеринка с заданными значениями успешна, или false в противном случае.
    private static boolean cigarParty(int cigars, boolean weekend) {
        if ((weekend) && cigars > 60) {
            return true;
        } else if ((!weekend) && cigars >= 40 && cigars < 60) {
            return true;
        } else
            return true;
    }

    //03_ES_01_08:Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
    // so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
    public static String lastChars(String a, String b) {
        if (a.length() == 0) {
            return "@" + a.substring(0, 1);
        } else if (b.length() == 0) {
            return a.substring(0, 1) + "@";
        } else if (b.length() == 0 && a.length() == 0) {
            return "@@";
        } else
            return a.substring(0, 1) + b.substring(b.length() - 1);

    }

    //04ES_02_01:Given a string, return a string where for every char in the original, there are two chars
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    //06_EL_02_07:Given three ints, a b c, return true if one of b or c is "close"
    //(differing from a by at most 1), while the other is "far", differing from both other values by 2 or more.
    //Note: Math.abs(num) computes the absolute value of a number.
    public static boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
            return true;
        } else {
            return false;
        }
    }

    //06_EL_02_08:We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)and big bars
    //(5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars.
    // Return -1 if it can't be done.
    private static int makeChocolate(int small, int big, int goal) {
        int total = 0;
        if (goal < 5) {
            big = -1;
        }
        for (int i = 0; i < big; i++) {
            total += 5;
            if (total == goal) {
                return 0;
            } else if (total + 5 > goal) {
                break;
            }
        }
        for (int i = 1; i <= small; i++) {
            total++;
            if (total == goal) {
                return i;
            }
        }
        return -1;
    }

}
