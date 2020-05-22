package Lesson18;

/**
 * Tel ran first project
 * 18/05/2020  11:13
 */
public class MyRound {

    public static double roundDigit(double digitNumber, int index) {
        int multiplucator = 10;
        int result = 1;
        for (int i = 1; i <= index; i++) {
            result = result * multiplucator;
            // i *= multiplucator;
        }
        System.out.println("Multiplicator " + multiplucator);

        int temp = (int) (digitNumber * result);
        System.out.println(temp);
        double tempTwo = temp;

        return tempTwo / result;

    }

    public static void roundDigitOneLine(double dNumber, int index) {

        int multiplicutor = 10;
        int temp = (int) (dNumber * Math.pow(multiplicutor, index));


    }
}
