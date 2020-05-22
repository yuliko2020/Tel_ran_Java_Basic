package Lesson09;

/**
 * Tel ran first project
 * 04/05/2020  09:41
 */
public class LeapYear {
    public static void main(String[] args) {
        checkLeapYearUnoTest();
        checkLeapYearDosTest();

    }

    public static boolean checkLeapYearDos(int year) {
        int y400 = 400;
        int y100 = 100;
        int y4 = 4;
        boolean leapYearCheck;
        // больше 0 и делится на 400 исключая деления на 100 и деление на 4
        leapYearCheck = year > 0 & (year % y400 == 0) ^ !(year % y100 == 0) & (year % y4 == 0);

        return leapYearCheck;

    }

    public static void checkLeapYearDosTest() {
        int year2000 = 2000;
        int year1900 = 1900;
        int year4 = 4;


        if (checkLeapYearDos(year2000)) {
            System.out.println("Первый тест с тестовым годом " + year2000 + " прошёл успешно");
        } else {
            System.out.println("Внимание" + " Pervii test s testovim godom " + year2000 + " provalen");
        }
        if (!checkLeapYearDos(year1900)) {
            System.out.println("Мы ожидаем fols и только  тогда этот тест  тоже успешный "
                    + "второй тест с тестовым годом " + year1900
                    + " прошёл успешно ");
        } else {
            System.out.println("Внимание" + " первый тест с тестовым годом " + year1900 + " провален");
        }
        if (!checkLeapYearDos(year4)) {
            System.out.println("Третий тест с тестовым годом " + year4 + " прошёл успешно ");
        } else {
            System.out.println((char) 27 + "[31m" + "Внимание" + " Первый тест с тестовым годом " + year4 + " провален!");
        }
        System.out.println();

    }


    public static boolean checkLeapYearUno(int year) {
        boolean resultChek = false;
        if (year % 400 == 0) {
            resultChek = true;
        } else if (year % 100 == 0) {
            resultChek = false;
        } else if (year % 4 == 0) ;
        {
            resultChek = true;
        }
        return resultChek;
    }

    public static void checkLeapYearUnoTest() {
        int year2000 = 2000;
        int year1900 = 1900;
        int year4 = 4;


        if (checkLeapYearUno(year2000)) {
            System.out.println("Первый тест с тестовым годом " + year2000 + " прошёл успешно ");
        } else {
            System.out.println("Внимание" + " Первый тест с тестовым годом" + year2000 + " провален");
        }
        if (checkLeapYearUno(year1900)) {
            System.out.println("Мы ожидаем  fols и только тогда этот тест тоже успешный"
                    + "Второй тест с тестовым годом " + year1900 + " прошёл успешно");
        } else {
            System.out.println("Внимание " + " Первы тест с тестовым годом  " + year1900 + " провален!");
        }
        if (checkLeapYearUno(year4)) {
            System.out.println("Третий тест с тестовым годом  " + year4 + " прошёл успешно");
        } else {
            System.out.println("Внимание" + " Первый тест с тестовым годом  " + year4 + " провален");
        }
        System.out.println();

    }

}

