package Lesson20;

import java.util.Scanner;

/**
 * Tel ran first project
 * 21/05/2020  10:33
 */
public class HomeWork20 {
    public static void main(String[] args) {
        //System.out.println(helloName(" Bob"));
        //System.out.println(helloName(" Alice"));
        //System.out.println(helloName(" X"));
        //System.out.println(firstHalf("WooHoo"));// → "Woo"
        //System.out.println(firstHalf("HelloThere"));// → "Hello"
        //System.out.println(firstHalf("abcdef"));//→ "abc"
        //System.out.println(nonStart("Hello", "There")); //→ "ellohere"
        //System.out.println(nonStart("java", "code"));//→ "avaode"
        //System.out.println(nonStart("shotl", "java"));//→ "hotlava"
        //System.out.println(theEnd("Hello", true));// → "H"
        //System.out.println(theEnd("Hello", false));//→ "o"
        //System.out.println(theEnd("oh", true));//→ "o"
        //System.out.println(endsLy("oddly"));//→ true
        //System.out.println(endsLy("y"));//→ false
        //System.out.println(endsLy("oddy"));//→ false
        //System.out.println(middleThree("Candy"));//→ "and"
        //System.out.println(middleThree("and"));//→ "and"
        //System.out.println(middleThree("solving"));//→ "lvi"
        //System.out.println(luckySum(1, 2, 3));//→ 6
        //System.out.println(luckySum(1, 2, 13));//→ 3
        //System.out.println(luckySum(1, 13, 3));//→ 1

    }

    //01Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!"
    public static String helloName(String name) {
        String greeting = "Hello";
        return greeting + name;
    }

    //03Given a string of even length, return the first half. So the string "WooHoo" yields "Woo"
    public static String firstHalf(String word) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        // return part of full string starting from index 0 to mid index
        return str.substring(0, str.length() / 2);
    }

    //04Given 2 strings, return their concatenation, except omit the first char of each.
    // The strings will be at least length 1
    public static String nonStart(String a, String b) {
        String str = "";// new String object
        str += a.substring(1);// concatenation with String a, without first character
        str += b.substring(1); // concatenation with String b, without first character
        return str;
    }

    //05Given a string, return a string length 1 from its front, unless front is false,
    // in which case return a string length 1 from its back. The string will be non-empty.
    public static String theEnd(String str, boolean frontLetter) {
        if (frontLetter) return str.substring(0, 1);
        return str.substring(str.length() - 1);

    }

    //06Given a string, return true if it ends in "ly"
    public static boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        } else return false;

    }

    //07Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
    // The string length will be at least 3.
    public static String middleThree(String str) {
        int leng = str.length() / 2;
        return str.substring(leng - 1, leng + 2);
    }

    //Given 3 int values, a b c, return their sum. However,
    // if one of the values is 13 then it does not count towards the sum and values to its right do not count.
    // So for example, if b is 13, then both b and c do not count.
    public static int luckySum(int a, int b, int c) {
        if (a == 13)
            return 0;
        else if (b == 13)
            return a;
        else if (c == 13)
            return a + b;
        else
            return a + b + c;
    }
}