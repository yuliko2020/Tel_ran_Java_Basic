package Lesson17;
import java.util.Scanner;

/**
 * Tel ran first project
 * 17/05/2020  20:23
 */
public class Anketa01 {
    public static void main(String[] args) {
        getNameAndDetails();
    }
    public static void getNameAndDetails() {
        String name = "";
        String secondName = "";
        String age = "";
        String profession = "";
        int k = 2;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < k; i++) {
            System.out.print("Ваше имя: ");
            name = input.next();
            System.out.print("Фамилия: ");
            secondName = input.next();
            System.out.print("Возраст: ");
            age = input.next();
            System.out.print("Профессия: ");
            profession = input.next();

        }
        System.out.println("---------------");
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Имя", "Фамилия", "Возраст", "Профессия");
        myFormat(name, secondName, age, profession);

        System.out.println("\nАнкетирование закончено.");
    }

    private static void myFormat(String name, String secondName, String age, String profession) {
        System.out.printf("%-12s%-12s%-12s%-12s\n", name, secondName, age, profession);

    }

}
