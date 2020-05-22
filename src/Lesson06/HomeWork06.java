package Lesson06;

/**
 * Tel ran first project
 * 28/04/2020  17:27
 */
public class HomeWork06 {

    public static void main(String[] args) {
        // int monthNomber = 20;
        // getStringMonth(monthNomber);
        // double consumption = 1000;
        //electricityCost(consumption);
        getPercent();
    }

    public static void getPercent() {
        double amount = 1250;
        double interest = 5;

        double result = amount * interest/ 100;
        System.out.println(" If you deposit: €" + amount + "  at " + interest + "% you will earn €" + result);

    }

    public static void electricityCost(double consumption) {

        double kilowatt = 0.20; // 0.20 cent per kilowatt
        double baseFee = 30; // Base fee
        double baseInclude = 100; // free kilowatt included in basefee

        double calculation = (consumption - baseInclude) * kilowatt + baseFee;

// calculation is -- consumption minus 100 free kilowatts, then times price,20cent and plus basefee of 30€=€210
        System.out.println("Your electricity consumption is " + consumption + " Watts");
        System.out.println("Your electricity bill is: €" + calculation + " this includes €30 base fee");
    }

    public static void getStringMonth(int month) {
        String monthString;
        switch (month) {
            case 1:
                monthString = " January ";
                break;
            case 2:
                monthString = " February ";
                break;
            case 3:
                monthString = " March ";
                break;
            case 4:
                monthString = " April ";
                break;
            case 5:
                monthString = " May ";
                break;
            case 6:
                monthString = " June ";
                break;
            case 7:
                monthString = "  July  ";
                break;
            case 8:
                monthString = " August ";
                break;
            case 9:
                monthString = "September  ";
                break;
            case 10:
                monthString = "  October ";
                break;
            case 11:
                monthString = "  November ";
                break;
            case 12:
                monthString = "  December";
                break;
            default:
                monthString = " Error  ";
                break;

        }
        System.out.println(" Your month is : " + monthString);
    }
}
