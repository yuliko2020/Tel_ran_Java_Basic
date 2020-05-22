package Lesson10;
/**
 * Tel ran first project
 * 05/05/2020  11:13
 * Посчитайте разницу между двумя днями года и выдайте число дней, которое осталось до следующего дня рождения:
 * *      - сегодня и днём рождения пушкина
 * *      - сегодня и новый год
 * *      - пасха и новый год
 * reshenie 2:
 *
 */
public class PushkinBirthday {
    public static void main(String[] args) {
        findPushkinBirthdayTest();

    }

    public static int findPushkinBirthday(int today, int futureDay) {
        // a 02,01 i b 01,01
        int result = 0;
        int allDaysInYear = 365;
        if (today > futureDay) {
            result = allDaysInYear - today + futureDay;
        } else if (today < futureDay) {// a 01,01 i b 02,01
            result =  futureDay-today ;
        }
        return result;
    }

    public static void findPushkinBirthdayTest(){
        System.out.println(" ojidsem 365 den:" +findPushkinBirthday(2, 1));
        System.out.println(" ojidaem 1 den:"+findPushkinBirthday(1, 2));
    }
}
