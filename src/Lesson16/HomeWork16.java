package Lesson16;

import java.util.Scanner;

/**
 * Tel ran first project
 * 14/05/2020  15:40
 * <p>
 * <p>
 * Компьютер загадывает число от 1 до n.
 * У пользователя k попыток отгадать.
 * После каждой неудачной попытки компьютер сообщает меньше или больше загаданное число.
 * В конце игры текст с результатом (или “Вы угадали”, или “Попытки закончились”).
 */
public class HomeWork16 {
    public static void tryToGetNumber() {
        int lottoTry = 3;
        int winNumber = 10;
        int playerNum;

        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Please enter a number from  0 to 10 ");
        playerNum = myScanner.nextInt();


        if (playerNum < winNumber) {
            System.out.println(" Ups your number too low " + " you have another chance " + lottoTry);
        } else if (playerNum > winNumber) {
            System.out.println(" Ups your number too high" + lottoTry);
        } else if (playerNum == winNumber) {
            System.out.println(" Congratulations you have won");
        }


    }

}


