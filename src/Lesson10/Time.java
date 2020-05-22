package Lesson10;

/**
 * Tel ran first project
 * 05/05/2020  10:41
 * Напишите метод который принимает дни ,а отдаёт секунды
 */
public class Time {
    public static void main(String[] args) {
        int day = 1;
        System.out.println(dayToSecond(day));

    }


    public static int dayToSecond(int day) {
        int seconds = 0;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondInMinute = 60;
        seconds = day * hoursInDay * minutesInHour * secondInMinute;
        return seconds;
    }

}
