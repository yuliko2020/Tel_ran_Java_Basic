package Lesson03;

public class Homeworc3 {
    public static void main(String[] args) {
        // circlePi();
        //double usd = 25.56;
        // manyTime(usd);
        //areaBelandUcr();
        //areaMoscandBer();
         clientBank();
        
    }

    /*Найти длину окружности.
     */
    public static void circlePi() {
        // find length of circle
        final double PI = 3.14;
        double radius = 15.0;
        double length = PI * 2 * radius;
        System.out.println(" length our circle : " + length);

    }

    /*
    Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
     */
    public static void manyTime(double usd) {
        double result = (usd * 1.1);
        System.out.println(" Euro today:" + result);

    }

    /*
    Найти соотношение площади Беларуси к площади Украины.
     */
    public static void areaBelandUcr() {
        double bel = 207595;
        double ukr = 603628;
        double result = ukr / bel;
        System.out.println("The area of Ukraine is greater than the area of Belarus in:" + result);

    }

    /*Найти, во сколько раз площадь Москвы больше площади Берлина.
     */
    public static void areaMoscandBer() {
        double moc = 2511;
        double ber = 892;
        double result = moc / ber;
        System.out.println(" The area of Moscow  is greater than the area of Berlin in: " + result + " times ");

    }

    /*Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?
    (If a client has deposited 1000 € at the bank at 3.5%, what amount will be expected in seven years?)
     */
    public static void clientBank() {
        double deposit = 1000;
        double percent = 3.5;
        double years = 7;
        double result = deposit * (Math.pow((1 + percent / 100), years));
        System.out.println(" deposit will have after 7 years :" + result);


    }




}




