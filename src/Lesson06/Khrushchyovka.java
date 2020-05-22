package Lesson06;

/**
 * Tel ran first project
 * 03/05/2020  12:11
 * В старых советских хрущёвках города № решили поменять деревянные окна и двери на пластиковые.
 *   Выяснилось, что все двери в хрущёвках одинакового размера 2м*90см, а окна разные,
 *  но в каждой квартире могут быть только одинаковые окна.
 *   <p>
 *   Стоимость переделки окон рассчитывается из стоимости стекла - 100€ за квадратный метр
 *   и стоимости косяка - погонный метр 100€.
 *  <p>
 *   Стоимость дверей рассчитывается исходя из стоимости косяка (как и у окна)
 *   и стоимости самой двери 120€ за квадратный метр.
 *   <p>
 *   Напишите программу, которая поможет стройтресту №12 правильно выставлять счета.
 */
public class Khrushchyovka {
    public static void main(String[] args) {
        double doorHight = 2.0;
        double doorWidht = 0.9;
        int doorQauntity = 1;
        double frameMeterPrice = 100;
        double windowPriceForMeter = 100;
        double doorPriceForMeter = 120;
        double windowHight = 1.0;
        double windowWidht = 2.0;

        System.out.println("Цена за двери " + doorQauntity * oneDoorCost(doorHight, doorWidht, frameMeterPrice, doorPriceForMeter));
        System.out.println("Цена за окно " + oneWindowCost(windowHight, windowWidht, frameMeterPrice, windowPriceForMeter));
    }


    public static double oneDoorCost(double doorHight, double doorWidht, double frameMeterPrice, double doorPriceForMeter) {
        double priceForDoorSquare = doorHight * doorWidht * doorPriceForMeter;
        double priceForDoorFrame = 2 * (doorHight + doorWidht) * frameMeterPrice;
        return priceForDoorSquare + priceForDoorFrame;
    }

    public static double oneWindowCost(double windowHight, double windowWidht, double frameMeterPrice, double windowPriceForMeter) {
        double priceForwindowSquare = windowHight * windowWidht * windowPriceForMeter;
        double priceForwindowFrame = 2 * (windowHight + windowWidht) * frameMeterPrice;
        return priceForwindowSquare + priceForwindowFrame;
    }

}
