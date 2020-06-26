package lesson46;

import java.text.DateFormat; //import java.text.* --все пакеты просто со звёздочкой ,чтобы не было занято много места
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;


/**
 * TelRanJavaBasicModulOne
 * 25/06/2020  09:59
 */
public class HelloDate {
    public static void main(String[] args) throws Exception {
        //haliHalloDate();
        //findBirthDay();
        helloLocaleDate();

    }

    private static void helloLocaleDate() {
        LocalDate localDate = LocalDate.now();
        LocalDate plusDays = localDate.plusMonths(5).minusDays(5);
        System.out.println("plus minus Days " + plusDays);

        LocalDateTime myParseDate
                = LocalDateTime.parse("2018-02-20 10:15:30"
                , DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(myParseDate);

        final DateTimeFormatter formater = DateTimeFormatter.ofPattern("EEEE", new Locale("ru"));
        final String day = myParseDate.format(formater);

        System.out.println("day  " + day);

        final DateTimeFormatter formaterMonth
                = DateTimeFormatter.ofPattern("MMMM", new Locale("ru"));
        final String month = myParseDate.format(formaterMonth);
        System.out.println("Trying number 5 - " + month);

        LocalDateTime now = LocalDateTime.now();
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZoneId moscow = ZoneId.of("Europe/Moscow");
        ZonedDateTime inBerlin = ZonedDateTime.of(now, berlin);
        ZonedDateTime inMoscow = ZonedDateTime.of(now, moscow);
        System.out.println("time in Berlin " + inBerlin);
        System.out.println("time in Moscow " + inMoscow);

        LocalDateTime plusDays2 = now.plusDays(10);
        LocalDateTime plusDays3 = now.minusWeeks(10);
        LocalDateTime plusDays4 = now.minusHours(1);

        long between = ChronoUnit.DAYS.between(now, plusDays2);
        System.out.println("Between " + between);


        ArrayList<LocalDate> dates = new ArrayList<>();
        Collections.addAll(dates,
                LocalDate.now(),
                LocalDate.now().plusDays(10),
                LocalDate.now().plusDays(20),
                LocalDate.now().plusWeeks(6));

        System.out.println("dates " + dates);


        ArrayList<String> stringDates = new ArrayList<>();
        Collections.addAll(stringDates, "03 June 2015", " 08 Jule 2016", "12 Des 2013 ");
        System.out.println("stringDates " + stringDates);


        String test = "03 June 2015";
        System.out.println(createLocalDateFromString(test));

        System.out.println(createStringFromLocaleDate(plusDays));

    }

    public static LocalDate createLocalDateFromString(String s) {

        return LocalDate.parse(s, DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    public static String createStringFromLocaleDate(LocalDate d) {

        return d.format(DateTimeFormatter.ofPattern("EEEE,dd MMMM yyyy", new Locale("en")));
    }

    private static void findBirthDay() {

        LocalDate today = LocalDate.now();// today date
        System.out.println("today " + today);
        LocalDate birthDay = LocalDate.of(1980, Month.AUGUST, 10);// day vareniy
        System.out.println("birthDay " + birthDay);
        Period period = Period.between(birthDay, today);
        System.out.println("period = birthDay, today " + period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.getDays());
        System.out.println(period.getUnits());
        System.out.println(period.getChronology());

    }


    private static void haliHalloDate() throws ParseException {
        Date today = new Date();
        System.out.println("Today- " + today);
        Date dateStart = new Date(0);
        System.out.println("dateStart - " + dateStart);
        Date anotherDay = new Date(1_451_665_447_567L);
        System.out.println("just another day  " + anotherDay);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(anotherDay);
        // # August 17,292278994 7:12:55 AM UTS
        //System.out.println("just calendar anotherDay "+calendar); // ujas-ujas


        System.out.println("calendar.getTime ()- " + calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        System.out.println("calendar.getTime ()- " + calendar.getTime());
        calendar.add(Calendar.MINUTE, 5);
        System.out.println("calendar.getTime ()+ minute " + calendar.getTime());

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("dateFormat.format(calendar.getTime) " + dateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("simpleDateFormat.format(calendar.getTime())) " + simpleDateFormat.format(calendar.getTime()));
        SimpleDateFormat simpleDateFormatBerlin = new SimpleDateFormat("dd-MM-yy");
        System.out.println("simpleDateFormatBerlin.format(calendar.getTime " + simpleDateFormatBerlin.format(calendar.getTime()));

        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        System.out.println("simple DateFormat Today " + simpleDateFormatBerlin.format(calendarToday.getTime()));


        Date oldDate = simpleDateFormat.parse("20/07/1993");
        System.out.println("oldDate " + oldDate);
        
    }
}
