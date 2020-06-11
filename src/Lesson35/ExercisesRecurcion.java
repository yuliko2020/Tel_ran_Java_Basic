package Lesson35;

/**
 * TelRanJavaBasicModulOne
 * 11/06/2020  11:01
 */
public class ExercisesRecurcion {
    public static void main(String[] args) {
        String a = "abc ";
        String b = "abcxxabc ";
        String c = "abaxxaba ";
        System.out.println(countAbc(a));
        System.out.println(countAbc(b));
        System.out.println(countAbc(c));

        //helloSubstring();
        //basic - recursion -09

        String k = "ahixhi"; //1
        String l = "ahibhi"; //2
        String m = "xhixhi"; //0
        String o = "xabdxk"; //0
        String p = "xxxxxxahihi"; //2

        System.out.println("Решение recursion -1-09");
        System.out.println(countHi2(k));
        System.out.println(countHi2(l));
        System.out.println(countHi2(m));
        System.out.println(countHi2(o));
        System.out.println(countHi2(p));
        System.out.println("Конец решения recursion -1-09");


    }

    //recursion -09 Given a string, compute recursively the number of times lowercase "hi"
// appears in the string,
// however do not count "hi" that have an 'x' immedately before them.
    private static int countHi2(String input) {
        String hi = "hi";
        char x = 'x';
        if (input.length() < 2) return 0;
        if (input.length() == 2) return (input.equals(hi)) ? 1 : 0;
        if (input.charAt(0) == x) {
            if (input.substring(1, 3).equals(hi)) return countHi2(input.substring(3));
            return countHi2(input.substring(1));
        }

        if (input.substring(0, 2).equals(hi)) return 1 + countHi2(input.substring(2));

        if (input.substring(1, 3).equals(hi)) return 1 + countHi2(input.substring(3));

        return countHi2(input.substring(2));
    }

    // Rec -01-08---Count recursively the total number of "abc" and "aba" substrings
    // that appear in the given string.Пересмотреть
    public static int countAbc(String input) {
        String abc = " abc";
        String aba = " aba";
        String checkString;
        if (input.length() < 3) return 0;
        checkString = input.substring(0, 3);
        if (checkString.equals(aba) || checkString.equals(abc)) {
            return 1 + countAbc(input.substring(3));
        }

        return countAbc(input.substring(1));
    }

    public static void helloSubstring() {
        String test = "Добро пожаловать";
        String test1 = test.substring(0, 5);
        String test2 = test.substring(5);
        System.out.println(test1);
        System.out.println(test2);
    }


}
