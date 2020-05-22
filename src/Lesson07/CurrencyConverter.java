package Lesson07;

/**
 * Tel ran first project
 * 30/04/2020  11:02
 * Реализовать метод, который принимает название валюты (например, “EUR”,”RUB”,”USD”,”GPB”) и выдает курс к доллару.
 * Естественно, “USD” возвращает 1.0 .
 * <p>
 * Используя метод из предыдущего пункта написать метод, который принимает пару валют (“GPB”,”EUR”) и возвращает курс обмена.
 * <p>
 * Используя метод из предыдущего пункта реализовать метод который получает пару валют и сумму в первой валюте,
 * возвращает сумму во второй валюте.
 */
public class CurrencyConverter {
    public static void main(String[] args) {
        String currencyName = "EUR";
        System.out.println("Если передать кассиру " + currencyName
                + " то курс к доллару - " + currencyNametoExchange(currencyName) + "€");
        String rub = "RUB";
        String dol = "USD";
        String eur = "EUR";
        String greatBritan = "GPB";
        System.out.println("Курс " + rub + " k " + eur + " " + onePaarCurrency(rub, eur));
        System.out.println("Курс " + rub + " k " + greatBritan + " " + onePaarCurrency(rub, greatBritan));
        System.out.println("Курс " + rub + " k " + dol + " " + onePaarCurrency(rub, dol));
        System.out.println("Курс " + eur + " k " + greatBritan + " " + onePaarCurrency(eur, greatBritan));
        System.out.println("-----");
        System.out.println("Если передать две валюты и сумму одной, то получим вот это : "
                + trueExchange("RUB", "EUR", 500.50));
        System.out.println("Если передать две валюты и сумму одной, то получим вот это : "
                + trueExchange(eur, dol, 500.00));
    }

    private static double trueExchange(String firstCurrency, String secondCurrency, double money) {
        return onePaarCurrency(firstCurrency, secondCurrency) * money;
    }

    public static double onePaarCurrency(String firstCurrency, String secondCurrency) {
        return currencyNametoExchange(firstCurrency) / currencyNametoExchange(secondCurrency);
    }

    public static double currencyNametoExchange(String cName) {
        // курс к доллару
        double resultRate = 0.0;
        switch (cName) {
            case "EUR":
                resultRate = 1.1;
                break;
            case "RUB":
                resultRate = 0.015;
                break;
            case "GPB":
                resultRate = 1.25;
                break;
            case "USD":
                resultRate = 1;
                break;
            default:
                resultRate = 0.0;
                break;
        }
        return resultRate;
    }


}
