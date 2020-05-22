package Lesson17;

import java.util.Scanner;

/**
 * Tel ran first project
 * 17/05/2020  10:43
 * <p>
 * Доделать программу конвертации чисел из двоичной системы в десятичную используя свои знания,
 * а не методы Java
 * Прочитать о двоичной системе подробнее, о 16-ой, и 8-ой. И о конвертации из двоичной в десятичную.
 * Дополнительно почитать о троичной и о троичной системе в компьютерных системах.
 * Если Всё получилось и есть силы попробовать решить задачу универсальной конвертации.
 * Напишите программу перевода чисел из любой(X) системы в любую(Y) систему.
 * Сделайте ограничение для систем выше 32.
 */
public class Homework17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int binaryNumber = 0;
        int counter = 0;
        int number = 0;


        System.out.print("Input binary number: ");
        binaryNumber = input.nextInt();

        //it's going to stop when the binaryNumber/10 is less than 0
        //example:
        //binaryNumber = 11/10. The result value is 1 when you do the next
        //operation 1/10 . The result value is 0

        while (binaryNumber != 0) {
            //Obtaining the remainder of the division and multiplying it
            //with the number raised to two
            //adding it up with the previous result

            number += ((binaryNumber % 10)) * Math.pow(2, counter);

            binaryNumber /= 10;  //removing one digit from the binary number

            //Increasing counter 2^0, 2^1, 2^2, 2^3.....
            counter++;

        }
        System.out.println("Decimal number : " + number);


    }

}
