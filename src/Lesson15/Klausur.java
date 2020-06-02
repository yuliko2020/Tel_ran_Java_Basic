package Lesson15;

/**
 * Tel ran first project
 * 13/05/2020  10:07
 */
public class Klausur {

    static void testUno(){
        // write your code here
        int x = 2;
        int y = 3;
        int z = 4;

        if (x == 2 && y <= 3) System.out.println("правда");
        else System.out.println("кривда");
        // public
        // private
        // default
        // protected
    }


    public static void weGoOnVacation(int money){
        // псевдометод, который нам поможет уехать в отпуск
        bookFlights();
        bookHotel();
        packUp();
        callTaxi();
        excellentMood();

    }

    private static void callTaxi() {

    }

    private static void packUp() {
    }

    private static void bookHotel() {
    }

    private static void bookFlights() {
    }

    private static void excellentMood() {
        //каждый из этих методов описывает как добиться поставленной цели. а может вызывать и другие дополнительные методы.
        // например для хорошего настроения нужно отключиться от работы и улететь туда где тепло
        System.out.println("Читаем хорошую книгу и забываем все заботы");
    }
}


