package Lesson08;

/**
 * Tel ran first project
 * 30/04/2020  12:46
 * Отсюда следует распределение високосных годов:
 * год, номер которого кратен 400, — високосный;
 * остальные годы, номер которых кратен 100, — невисокосные (например, го­ды 1700, 1800, 1900, 2100);
 * остальные годы, номер которых кратен 4, — високосные.
 */

public class HelloLeapYear {
    public static void main(String[] args) {
        System.out.println(checkLeapYearFourHundred(1700));
        System.out.println(checkLeapYearOneHundred(1800));
        System.out.println(checkLeapYearFour(1900));
        System.out.println(LeapYear(2020));
    }

    private static boolean checkLeapYearFourHundred(int year) {

        return year % 400 == 0;
    }

    private static boolean checkLeapYearOneHundred(int year) {
        return !(year % 100 == 0);
    }

    private static boolean checkLeapYearFour(int year) {

        return (year % 4 == 0);
    }

    private static boolean LeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

        } else return false;

        return true;
    }


}

