package Lesson12;

public class Password {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        countdown(5, 1, "star");
        countdownTwo();
        generateMT(a);
        reverse();
        getSum();
        printLineNtimes(a, "Hello");
        primeNumbers();
    }

    //1-Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке
    //Например: 123 -> 321; 768 -> 867;
    public static void reverse() {
        String str = "123";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("Строка чисел: " + str);
        System.out.println("Строка в обратном порядке: " + reverse);
    }

    //2- Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа.
    // Например: 123 -> 6 (1+2+3) ; 768 -> 21 (7+6+8)
    public static void getSum() {
        int num = 999;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

    //3-Дано целое трехзначное число. Написать метод, который определит четность/ нечетность разрядов этого числа.
    // Например: 123 -> 1 – нечет. 2- чет. 3-нечет; 768 -> 1 – нечет. 2- чет. 3-чет;
    public static void evenOdd() {
        int num = 7;
        if (num % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }

    //4-Реализовать метод, который выводит на экран заданную строку N раз.
    public static void printLineNtimes(int a, String line) {
        a = 3;
        line = "Hello ";
        for (int i = 0; i < a; i++) {
            System.out.println("Вывести на экран - " + line);
        }

    }

    //5-Реализовать метод(ы)“Обратный отсчёт”который выводит на экран цифры от 5 до 1, затем выводит строку „start“
    public static void countdown(int a, int b, String c) {
        c = "star";
        for (int i = 5; i >= b; i--)
            System.out.println(i);
        System.out.println("star");
    }

    //6- Реализовать метод “ Обратный отсчёт ” который выводит на экран цифры от 5 до 1 текстом,
    // затем выводит строку „start“.
    public static void countdownTwo() {
        int countdown = 5;
        for (int i = 1; i >= countdown; i--)
            System.out.println(i);
        System.out.println("Five");
        System.out.println("Four");
        System.out.println("Three");
        System.out.println("Two");
        System.out.println("One");
        System.out.println("Star");
    }

    //Напишите программу, которая выводит на консоль простые числа в промежутке от 2 до 100.
    public static void primeNumbers() {
        int i;
        int j;
        boolean result = true;
        for (i = 2; i < 100; i++) {
            result = true;
        }
        for (j = 2; j <= i / j; i++)


            System.out.println(" Prime number" + i);
    }


    // добавить 0 к однозначным числам - дома
    public static void generateMT(int a) {
        a = 10;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }


}
