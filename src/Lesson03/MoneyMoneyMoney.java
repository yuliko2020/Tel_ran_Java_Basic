package Lesson03;
/**
 * Tel ran first project
 * 24/04/2020  23:16
 * Написать программу расчёта роста денежного клада в банке. Сумма вклада 100€, время вклада 7 лет, процент дохода вклада 2,3%. Вывести результат на экран за каждый год в виде:
 *  *  * Сумма вклада в конце первого года = a
 *  *  * Сумма вклада в конце второго года = b
 *  *  * Сумма вклада в конце NN года = c
 *  *  * Доход за Y лет составил = d
 *  *  * При расчёте пользоваться float и ответить на следующие вопросы:
 *  *  * Используя какие типы данных можно решить эту задачу? Почему? Что произойдёт при использовании типа данных byte?
 *  *  * Решите предыдущую задачу если банк выплачивает проценты на проценты.
 */
public class MoneyMoneyMoney {
    public static void main(String[] args) {
        getBankAccount();

    }

    public static void getBankAccount() {
        double moneyClients = 1000;
        double percent = 3.5;
        int year = 7;
        double result = 0;

        result = (moneyClients / 100) * percent * year;

        System.out.println(result + moneyClients);

    }


}
