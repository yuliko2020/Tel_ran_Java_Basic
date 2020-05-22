package Lesson13;

public class AOExercise12_2 {
    public static void main(String[] args) {
        int digit = 234;
        int hundreds = 0;
        int decimal = 0;
        int units = 0;

        hundreds = digit / 100;
        decimal = (digit - hundreds * 100) / 10;
        units = (digit - hundreds * 100 - decimal * 10);
        System.out.println(hundreds + decimal + units);

    }
}
