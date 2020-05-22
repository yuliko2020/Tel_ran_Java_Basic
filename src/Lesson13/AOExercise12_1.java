package Lesson13;

public class AOExercise12_1 {
    public static void main(String[] args) {
        System.out.println("ожидаем 321 - " + intReverse(123));
        System.out.println(intReverse(768));
    }
    /*
        Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке. Например:
    123 -> 321
    768 -> 867
     */
    static int intReverse(int digit) {
        // x % 100 = это у нас сотни
        // (x - сотни) % 10 это у нас десятки
        // (x минус сотни и минус десятки) = это у нас единицы
        // сначала единицы умножаем на сто, десятки на десять, сотни = новое трёхзначное число наоборот.

        int hundreds = 0;
        int decimal = 0;
        int units = 0;

        // если мы знаем разрядность числа, то мы знаем сколько знаков в числе
        // то есть мы знаем n
        int n = 3;
        for (int i = 0; i > n; i++) {

        }

        hundreds = digit / 100;
        System.out.println("наши сотни " + hundreds);
        decimal = (digit - hundreds * 100) / 10;
        System.out.println("десятки " + decimal);
        units = (digit - hundreds * 100 - decimal * 10);
        System.out.println("единицы " + units);
        return units * 100 + decimal * 10 + hundreds;
    }

    public static void veryClever(int digit) {
        String temp = String.valueOf(digit);
        String reverse;
        reverse = new StringBuffer(temp).reverse().toString();
    }

}
