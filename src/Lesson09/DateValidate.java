package Lesson09;
import Lesson08.HelloLeapYear;
/**
 * Tel ran first project
 * 04/05/2020  11:11
 *
 * Метод вывода даты на экран монитора принимает 3 целочисленных значения(день, месяц, год)
 * и разделитель (например "-"). Проверить значения данных на адекватность, и если надо дописать нули.
 * - 5.6.2020 должно быть выведено на экран как "05-06-2020" - 50.40.2020 не должно быть выведено вообще
 * Напишите метод проверки передаваемой даты . Сделай что бы было тыдж.
 *
 */
public class DateValidate {
    public static void main(String[] args) {
        //dateCheckTest();
        // teoreticDayTest();
        // checkDayTest();
        //checkDayTest();
        correctWritingDateTest();
    }

    public static String correctWritingDate(int day, int month, int year, String placeholder) {
        String result = "";
        String dayTemp = "";
        String monthTemp = "";
        String yearTemp = "";
        if (dateCeck(day, month, year)) {
            if (day < 10) {
                dayTemp = "0" + Integer.toString(day);
            } else {
                dayTemp = Integer.toString(day);
            }
            if (month < 10) {
                monthTemp = "0" + Integer.toString(month);
            } else {
                monthTemp = Integer.toString(month);
            }
            if (year < 10) {
                yearTemp = "0" + Integer.toString(year);
            } else {
                yearTemp = Integer.toString(year);
            }
            result = dayTemp + placeholder + monthTemp + placeholder + yearTemp;
        } else {
            result = Integer.toString(day) + placeholder
                    + Integer.toString(month) + placeholder
                    + Integer.toString(year) + "не является корректной датой";
        }
        return result;
    }


    public static void correctWritingDateTest() {
        System.out.println("Esli mu peredayom 15.2.2020.i *, to ojidaem 15*02*2020: "
                + correctWritingDate(15, 2, 2020, "*"));
        System.out.println("Esli mu peredayom 15.2.2020.i *, to ojidaem 15*02*2020: "
                + correctWritingDate(15, 12, 2020, "---"));

    }

    public static boolean dateCeck(int day, int month, int year) {
        boolean result = false;
        result = checkDay(day, month, year) & checkMonth(month) & checkYear(year);
        return result;
    }

    public static void dateCheckTest() {
        System.out.println("Peredau 25.7.1996:" + dateCeck(25, 7, 1995) + " ожидаю тру");
        System.out.println("Peredau 35.7.1996:" + dateCeck(25, 7, 1995) + " ожидаю фолс");
        System.out.println("Peredau 25.7.-7:" + dateCeck(25, 7, 1995) + " ожидаю фолс");
        System.out.println("Peredau 25.15.2020:" + dateCeck(25, 7, 1995) + " ожидаю фолс");
        System.out.println("Peredau 29.2.2020:" + dateCeck(25, 7, 1995) + " ожидаю тру , високосный");
        System.out.println("Peredau 29.2.2019:" + dateCeck(25, 7, 1995) + " ожидаю фолс , невисокосный");

    }

    private static boolean checkDay(int day, int month, int year) {
        boolean result = false;
        if (checkYear(year) & checkMonth(month) & day > 0 & day <= teoreticDay(month, year)) {
            result = true;
        }
        return result;
    }


    public static void checkDayTest() {
        System.out.println("Проверка адекватности дня . Передаю дату 10.12.2020, Ожидаю true :" + dateCeck(10, 12, 20));
        System.out.println("Проверка адекватности дня . Передаю дату 10.12.2020, Ожидаю true :" + dateCeck(10, 12, 2020));
        System.out.println("Передаю дату 29..12.2020, ожидаю true :" + dateCeck(29, 12, 2020));
        System.out.println(" Передаю дату  29.02.2019, ожидаю true :" + dateCeck(29, 02, 2019));

    }

    private static boolean checkMonth(int month) {
        boolean result;
        result = month >= 1 & month <= 12;
        return result;
    }

    private static boolean checkYear(int year) {
        boolean result;
        result = year > 0 & year < 2021;
        return result;
    }

    public static int teoreticDay(int mont, int year) {
        int tempDay = 0;
        switch (mont) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tempDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tempDay = 30;
                break;
            case 2:
                tempDay = 28;
                break;
            default:
                tempDay = 0;
                break;
        }
        // LeapYear.checkLeapYearDos(year);
        if (LeapYear.checkLeapYearDos(year) & mont == 2) {

            tempDay = tempDay + 1;
        }

        return tempDay;

    }

    public static void teoreticDayTest() {

        System.out.println(" Peredayu 02.2020 , pjidavu 29 -" + teoreticDay(2, 2020));
        System.out.println(" Peredayu 02.2020 , pjidavu 28 -" + teoreticDay(2, 2019));
        System.out.println(" Peredayu 07.2020 , pjidavu 31 -" + teoreticDay(7, 2020));
        System.out.println(" Peredayu 09.2020 , pjidavu 30 -" + teoreticDay(9, 2020));
        System.out.println(" Peredayu 10.2030 , pjidavu 0 -" + teoreticDay(15, 2030));
    }


}
