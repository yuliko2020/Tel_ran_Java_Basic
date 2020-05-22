package Lesson06;

/**
 * Tel ran first project
 * 29/04/2020  10:59
 * Стоимость электроэнергии рассчитывается исходя из стоимости одного киловатт-часа в 20 центов. Базовая плата - 30€.
 * В базовую плату входят 100 киловатт-часов. Напишите метод расчёта стоимости пользования электроэнергией
 */

public class BewagKilowatt {
    public static void main(String[] args) {
        double userElectrisityConsumption = 300.5;
        char dollarSymbol = '$';
        char euroSymbol = 8364;
        System.out.println("Цена за электричество: " + dollarSymbol + getMeMoneyForElectrisity(userElectrisityConsumption) + euroSymbol);
        System.out.println("Цена за электричество: " + dollarSymbol + getMeMoneyForElectrisity(95) + euroSymbol);
    }

    private static double getMeMoneyForElectrisity(double userKW) {
        double moneyResult = 0.0;
        double kwPrice = 0.2;
        double basicPlate = 30.00;
        int basicKW = 100;
        /* если клиент нажёг электричества больше, чем на 100кв,
         *  то мы его считаем по формуле basicPlate + kwPrice * (userKW - basicKW).
         *  Если же клиент нажёг электричества меньше, чем на 100кв, то
         *  мы берём с него только базовую плату.
         */
        if (userKW <= basicKW) {
            moneyResult = basicPlate;
        } else {
            moneyResult = basicPlate + kwPrice * (userKW - basicKW);
        }
        return moneyResult;
    }
}