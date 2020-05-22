package Lesson09;

/**
 * Tel ran first project
 * 04/05/2020  20:52
 * Написать новый класс Calculator и метод newCalculate;
 * который принимает два целых
 * числа и оператор String ( "*", "+","-",":"), а возвращает операцию между этими числами.
 * Недопустить деление на ноль.
 */
public class Calculator {

    public static void main(String[] args) {
        int a = 100;
        int b = -12;

        System.out.println("Результат операции:");
        System.out.println(" -Вычитания : " + newCalculator(a, b, "-"));
        System.out.println(" -Сложение : " + newCalculator(a, b, "+"));
        System.out.println("-у множения  операции:" + newCalculator(a, b, "-"));
        System.out.println("-деления операции:" + newCalculator(a, b, ":"));

        newCalculatorTest();
        newCalculatorIfTest();
    }

    public static String newCalculatorIf(int a, int b, String toDo) {
        String result = "";
        if (toDo == "+") {
            result = String.valueOf(a + b);
        } else if (toDo == "-") {
            result = String.valueOf(a - b);
        } else if (toDo == "*") {
            result = String.valueOf(a * b);
        } else if (toDo == ":") {
            result = avoidZeroTwo(a, b);
        } else {
            result = " Operator ne raspoznan!Help!";
        }

        return result;
    }

    private static void newCalculatorIfTest(){
        System.out.println("4*5 - ожидаем 20 - " + newCalculatorIf(4, 5, "*"));
        System.out.println("3/5 - ожидаем 0 " + newCalculatorIf(3, 5, ":"));
        System.out.println("3/0 - ожидаем ошибку - " + newCalculatorIf(3, 0, ":"));
        System.out.println("10-6 - ожидаем 20 - " + newCalculatorIf(10, 6, "-"));
        System.out.println("4+5 - ожидаем 9 - " + newCalculatorIf(4, 5, "+"));
        System.out.println("4 абычто 5 - ожидаем ошибку - " + newCalculatorIf(4, 5, "дфгхдхйнгфйхг"));
    }



    public static String avoidZeroTwo(int a, int b) {
        String tempResult = "";
        if (b == 0) {
            tempResult = "Ошибка ,деление на 0 невозможно ";
        } else {
            tempResult = String.valueOf(a / b);
        }
        return tempResult;
    }

    public static String avoidZero(int digit) {
        String tempResult = Integer.toString(digit);//


        if (digit == 0) {
            tempResult = "Ошибка ,деление на 0 невозможно ";

        }
        return tempResult;

    }


    public static String newCalculator(int a, int b, String toDo) {
        String result = "";
        switch (toDo) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case ":":
                result = avoidZeroTwo(a, b);
                break;
            default:
                result = "Mistake";
                break;
        }

        return result;
    }


    public static void newCalculatorTest() {

        System.out.println("slojenie,ojidaem 5 " + newCalculator(5, 0, "+"));
        System.out.println("vichitanie ,ojidaem ,,," + newCalculator(5, 0, "-"));
        System.out.println("umnojenie,ojidaem ,,, " + newCalculator(5, 0, "*"));
        System.out.println("delenie,ojidaem ,,, " + newCalculator(5, 0, ":"));
    }

}
