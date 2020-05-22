package Lesson03;

public class MyRandom {
    public static void main(String[] args) {
//automobil(310,26);
        int year = 1955;
        byte h = 1;
        double t = 36.6;
        //additionThreeDigits(year, h, t);
        youtube();


    }

    public static void additionThreeDigits(int a, byte b, double d) {
        double result = a + b + d;

        System.out.println("Результат сложения самых важных цифр в мире: " + result);
    }

    public static void automobil(double kilometr, int liter) {
        double bak = 00.000;
        double bak1 = 00.001;
        double result;

        result = (kilometr * bak) / liter;
        System.out.println(result);
    }


    public static void getMeMYRandomDigit() {
        final int MIN = 100;
        final int MAX = 200;

        int randomDigits = (int) (Math.random() * (MAX - MIN)) + MIN;
        int randomDigit = (int) Math.random() * 100;
        System.out.println("Наше рандомное число: " + randomDigits);

        // ТИП
        // ИМЯ randomDigits
        // размер 8, 16, 32, 64
        // значение
    }

	/*
	Изготавливая по 42 детали в час, рабочий трудился 8 часов.
	Сколько времени ему понадобилось бы на эту же работу, если бы он делал в час по 48 деталей?
	 */

    public static void worker() {
        int hour = 8;
        int stuck = 42;
        int y = 48;

        int result;
        result = hour * stuck / y;

        System.out.println(result);
    }

	/*
	Автомобиль проехал 310 км, истратив 25 л бензина.
	Какое расстояние может проехать автомобиль на полном баке, вмещающем 40л?
	 */

    /*
    Через первую трубу бассейн можно наполнить за 20 ч, а через вторую — за 30 ч.
     За сколько часов наполнится бассейн через обе эти трубы?
     */
    public static void youtube() {
        int hoursOne = 20;
        int hoursTwo = 30;
        double result;

        result = (hoursOne + hoursTwo) / 2;

        // очевидно другой ответ
        System.out.println("трубы в бассейне: " + result);
    }

}
