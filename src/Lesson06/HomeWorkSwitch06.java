package Lesson06;

/**
 * Tel ran first project
 * 27/04/2020  20:23
 * Напишите программу действий кассира магазина.
 * Если у него пытаются купить алкоголь следующие 5 покупателей: 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
 * If the following 5 customers are trying to buy alcohol from him: 10 years, 17 years, 18 years, 20 years and 30 years.
 * write a text saying who is allowed to buy alcohol or not, depending on their age.
 * В зависимости от месяца отпуска предлагает разные географические варианты.12 городов 5 материков
 * Depending on the month of vacation, it offers different geographical options. 12 cities from the 5 continents
 */


public class HomeWorkSwitch06 {
    public static void main(String[] args) {
        //int userAge = 10;
        //shopCash(userAge);
        int monthTime = 8;
        travelAgency(monthTime);
    }

    public static void travelAgency(int month) {
        String monthString;
        switch (month) {
            case 1:
                monthString = " In January we offer a trip to Salsburg in Austria";
                break;
            case 2:
                monthString = " In February we offer a trip to Rome in Italy  ";
                break;
            case 3:
                monthString = "In March we offer a trip to New York in USA ";
                break;
            case 4:
                monthString = " In April we offer a trip to Montreal in Canada";
                break;
            case 5:
                monthString = " In May we offer a trip to Cairo in Egypt";
                break;
            case 6:
                monthString = "In June we offer a trip to Johansberg in Sout Africa";
                break;
            case 7:
                monthString = " In July we offer a trip to Sydney in Australia ";
                break;
            case 8:
                monthString = "In August we offer a trip to Christchurch in New Zealand";
                break;
            case 9:
                monthString = " In September we offer a trip to Tokyo in Japan ";
                break;
            case 10:
                monthString = " In October we offer a trip to Moscow in Russia ";
                break;
            case 11:
                monthString = " In November offer a trip to Buenos Aires in Argentina ";
                break;
            case 12:
                monthString = " In December we offer a trip to Nazareth in Israel";
                break;
            default:
                monthString = " Invalid  ";
                break;

        }
        System.out.println(" For your chosen month  : " + monthString);
    }

    public static void shopCash(int age) {
        String customerString;
        switch (age) {
            case 10:
                customerString = " I can´t sell you alcohol";
                break;
            case 17:
                customerString = " I can´t sell you alcohol ,but I can sell you cigarretes ";
                break;
            case 18:
                customerString = "I can sell you alcohol";
                break;
            case 20:
                customerString = " I can sell you alcohol ";
                break;
            case 30:
                customerString = " I can sell you alcohol ";
                break;

            default:
                customerString = " Invalid  ";
                break;
        }
        System.out.println(" Customer age : " + customerString);
    }

}
