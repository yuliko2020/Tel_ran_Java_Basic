package Lesson17;
import java.util.Scanner;
/**
 * Tel ran first project
 * 15/05/2020  11:23
 */
public class BinarToDecimal {
    public static void convertDigits() {

        Scanner input = new Scanner(System.in);
        int decimal, remainder;

        String output = "";

        System.out.println("Введи десятичное число, например 13!");
        decimal = input.nextInt();

        while (decimal > 0) {
            remainder = (decimal % 2);
            output = Integer.toString(remainder) + output; // Переводит(вписывает) число в строку.
            decimal = decimal / 2;
        }
        System.out.println(output);
    }
}
