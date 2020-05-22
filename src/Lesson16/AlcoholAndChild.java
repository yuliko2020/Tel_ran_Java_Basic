package Lesson16;
import java.util.Scanner;
/**
 * Tel ran first project
 * 14/05/2020  15:38
 */
public class AlcoholAndChild {
    public static String kasirka() {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Скажите пожалуйста сколько вам лет?");
        age = sc.nextInt();

        String result = "";
        String resultTrue = "Ой, а по вам и не скажешь. \n Продажа алкоголя разрешена";
        String resultFalse = "Продажа алкоголя запрещена";

        if (age >= 18) {
            result = resultTrue;
        } else {
            result = resultFalse;
        }
        return result;
    }
}
