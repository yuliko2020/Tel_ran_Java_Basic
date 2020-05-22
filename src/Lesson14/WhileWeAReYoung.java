package Lesson14;

public class WhileWeAReYoung {
    public static void main(String[] args) {
        //helloWhile(); ,бесконечность
        //helloBoolean();
    }

    private static void helloBoolean() {
        int n = 1;
        boolean b = n < 10;
        boolean c = checkTrue();
        if (c) {
            System.out.println("Строка");
        } else {
            System.out.println("Ничего не получилось");
        }
    }

    private static boolean checkTrue() {
        // невероятно сложный код
        return false;
    }

    private static void helloWhile() {
        int i = 0;
        int a;
        a = 7;
        a = initA();
        a = i + a;
        boolean checkTrueOrFalce = i < 10;
        while (checkTrueOrFalce) {
            System.out.println(i);
            i++;
        }
        for (int j = 0; j < 10; i++) {
            System.out.println(i);
        }
    }

    private static int initA() {
        //какой то очень сложный код
        return 6;
    }

    private static void equalsForAndWhile() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int w = 0;
        while (w < 10) {
            System.out.println(w);
            w++;
        }
        int k = 1;
        boolean b = false;
        while (b) {
            System.out.println("ответ");
            if (k == 20)
                //код
                break; // выход из цикла
        }

        do {
            // Команда();
            k++;
        }
        while (b);

    }

}
