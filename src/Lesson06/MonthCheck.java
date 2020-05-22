package Lesson06;

/**
 * Tel ran first project
 * 29/04/2020  10:14
 */
public class MonthCheck {

    public static void main(String[] args) {
        int month = -7;
        System.out.println(getStringMonth(month));

    }

    private static String getStringMonth(int month) {
        String monthName = "";
        if (checkMonth(month)) {
           monthName= getMeMonthName(month);
        } else {
            monthName = "такого месяца не существует";
        }
        return monthName;
    }

    private static boolean checkMonth(int month) {
        boolean result = false;
        if (month >= 1 & month <= 12) {
            result = true;
        }
        return result;
    }

    public static String getMeMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Апрель";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                break;
            default:
                monthName = "Как бы еррор";
                break;
        }
        return monthName;
    }


    }

