package Lesson06;
/**
 * Tel ran first project
 * 29/04/2020  10:04
 *
 */
public class Percent {
    public static void main(String[] args) {
        double amount = 1000;
        double interest = 10;
        getPercent(amount, interest);
        System.out.println(getPercent(amount, interest));

    }

    public static double getPercent(double amount, double interest) {

        return amount * interest / 100;
    }




}
