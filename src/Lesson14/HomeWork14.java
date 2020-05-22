package Lesson14;

import java.util.Scanner;

/**
 * Tel ran first project
 * 12/05/2020  16:30
 */
public class HomeWork14 {
    public static void main(String[] args) {
        //getSum(2, 4);
        multiplicationTable();
        //printSquare(4, 4);
        //printSquareTest(5, 5);
        //myScannerHello();
    }
    // Напишите программу, которой надо представиться.
    // Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
    // Для считывания данных типа String используйте метод next(): input.next()
    public static void myScannerHello() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("Your age please: ");
        old = input.nextInt();
        if (old >= 18) {
            System.out.println(" Welcome to our page .");
        } else {
            System.out.println(" You can`t be registered in our page   .");
        }
        String question;
        System.out.println(" Enter your name . ");
        question= input.next() ;
        System.out.println(" Enter your family name . ");
        question= input.next() ;
        System.out.println(" Enter your e-mail . ");
        question = input.next();
        System.out.println("Have a nice time:) we are happy you chose us . ");

    }
    //Реализовать метод печатающий таблицу умножения для заданного числа Пример: 3x1=3,3x2=6,,,3x10=30
    private static void multiplicationTable() {
        for (int i = 3; i <=3; i++)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }


    }
    //Напишите метод, который выводит на экран квадрат с заданной стороной символами “*”
    private static void printSquare(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //Попытка сделать do while который выводит на экран квадрат с заданной стороной символами “*”
    private static void printSquareTest(int a, int b) {
        String c = "*";
        do {
            System.out.println("*");
            a += 5;
        }
        while (a <= 5);
        System.out.println(a);

    }




    //Дано два числа (a и b). Написать метод, который вернет сумму всех чисел между (a и b).
    // Если a равно b, метод должен вернуть  a+b :  Пример: sum(2,4) -> 9
    public static void getSum(int a, int b) {

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                System.out.println(j + i);
            }
            //System.out.println(i);

        }
        if (a == b) {
            System.out.println(a + b);
        }

    }
}