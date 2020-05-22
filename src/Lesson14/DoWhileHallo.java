package Lesson14;

public class DoWhileHallo {
    public static void main(String[] args) {
        //doWhileTest();
        justWhile();

    }

    private static void justWhile() {
        // Декларирование и инициализация переменной
        int i = 0;

        // Команда, которая будет выполнена минимум один раз
        do {
            // Команда выполняется трижды
            System.out.println("i равно " + i);
            // Инкриментирование переменной
            i += 10;
        }
        // Условие выхода из цикла
        while (i <= 20);
    }

    private static void doWhileTest() {
        int b = 10;
        do {
            b++;
            System.out.println(b);
        } while (b < 10);
        System.out.println(b);
    }

}

