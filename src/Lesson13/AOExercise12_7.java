package Lesson13;

public class AOExercise12_7 {
    public static void main(String[] args) {
        primeNumbers(2, 7);
    }

    static void primeNumbers(int min, int max) {
        for (int i = min; i <= max; i++) {
            int count = 0;

            for (int j = min; j <= i && count < 2; j++) { // если число делиться не только на себя без остатка
                if (i % j == 0) { //проверяем остаток деления
                    count = count + 1; // увеличиваем темпоральную вспомогательную переменную , если остаток деления 0
                }
            }
            if (count < 2)
                System.out.println(i);
        }
    }
}
