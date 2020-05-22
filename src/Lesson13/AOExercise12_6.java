package Lesson13;

import org.w3c.dom.ls.LSOutput;

public class AOExercise12_6 {
    public static void main(String[] args) {
        countdown(1);
        System.out.println(intSwitchString(2));
    }

    static void countdown(int n) {
        System.out.println("Старт");
        for (int i = 1; i < n; i++) {
            System.out.println();
        }
        System.out.println("Старт");
    }

    static String intSwitchString(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "один";
                break;
            case 2:
                result = "два";
                break;
            case 3:
                result = "три ";
                break;
            default:
                result = "Повторите ввод";
                break;
        }
        return result;

    }

}
