package Lesson02;/*
 * Date: 21.04.2020
 * Acquaintance with basic data types: integer primitives
 * Знакомство с базовыми типами данных: целочисленные примитивы
 * Definition, declaration, initialization of variables
 * Определение , объявление, инициализация переменных
 */

public class HelloInteger {
    public static void main(String[] args) {
        //goodMorningInteger();
        //goodMorningByte();
        //goodMorningShort();
        //goodMorningLong();
        // homeWorkbyte();
        //homeWorkInteger();
        //homeWorkShort();


    }

    public static void goodMorningDefinition() {
        int a, b, c, d, g;
        a = 1;
        b = 2;
        c = 3;
        d = a + b + c;
        g = 5;
    }

    public static void goodMorningShort() {
        short firstVariable = 1000;
        short secondVariable = 15000;
        short thirdVariable = (short) (firstVariable + secondVariable);

        System.out.println("If you add a firstVariable: " + firstVariable
                + " \n and secondvariable " + secondVariable
                + " \n \t  That is likely we will get the value thirdVariable: " + thirdVariable);
    }

    public static void goodMorningLong() {
        long a = 12345L;
        long b = 23456L;
        long c = 223_372_036_854_775_807L;
        System.out.println("The sum of all variables in the method :" + (a + b + c));
    }

    public static void goodMorningByte() {
        //
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a + b);
        System.out.println("Streng byte :" + c);

        byte x = 120;
        byte y = 10;
        byte z = (byte) (x + y);
        System.out.print(" guess the meaning " + z);
        // -128 till 127
    }


    public static void goodMorningInteger() {
        // create variables and assign values to these variables
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println("we want to see the sum of the variables a and b: " + c);
        //Find the perimeter of a square with a side equal to 4
        System.out.println("the perimeter of the square with each side 4 cm ,equal : " + 4 * 4);
        // we find the area of the rectangle with sides 5 and 7:
        int x = 5;
        int y = 7;
        int square = x * y;
        System.out.println("area:" + square);

    }

    public static void homeWorkbyte() {
        //Find the perimeter of a square
        byte a = 6;
        byte b = 6;
        byte c = 6;
        byte d = 6;
        System.out.println("the perimeter of the square with  each side 6 cm ,equal : " + 6 * 4);
        // Find the square area
        byte x = 6;
        byte y = 6;
        System.out.println("the area of the square with  each side 6 cm ,equal : " + x * y);

    }

    public static void homeWorkInteger() {
        //find the perimeter of a rectangle with sides 10 and 5
        int a = 10;
        int b = 5;
        int c = 10;
        int d = 5;
        int perimeter = a + b + c + d;
        System.out.println(" perimeter : " + perimeter);
        //find the area of the same rectangle
        int x = 10;
        int y = 5;
        int area = x * y;
        System.out.println("area:" + area);

    }

    public static void homeWorkShort() {
        //Find the surface area  of a cube
        short a = 5;
        short b = 5;
        short v = 6;
        short area = 6 * 5 * 5;
        System.out.println("area :" + area);
        //Find the perimeter of a cube
        short x = 5; // 1 side side of cube 5 cm
        short y = 12; // cube has  12 edges
        short perimeter = 5 * 12;
        System.out.println(" perimeter:" + perimeter);

    }

   
}

