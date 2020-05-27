package Lesson21;
/**
 * Tel ran first project
 * 23/05/2020  13:50
 */
public class HelloMyLovelyRecursion {
    public static void main(String[] args) {
        //System.out.println(bunnyEars(0));// 0
        //System.out.println(bunnyEars(1));// 2
        //System.out.println(bunnyEars(2));//5

        System.out.println(count7(717));//-> 2
        System.out.println(count7(7));//-> 1
        System.out.println(count7(123));//-> 0
        System.out.println(count7(77777));//-> 5
    }

    // У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов.
    // У нечётных кроликов по два уха. А у чётных кроликов вроде как по три уха. Это из-за того, что они все подняли ногу.
    //Посчитайте количество видимых нами "ушей". Не использовать циклы или умножение.
    public static int bunnyEars(int count) {
        if (count == 0) return 0;// если кроликов совсем нет
        else if (count == 1) return 2;// если 1 кролик / нечёт/ 2 уха
        else return 5 + bunnyEars(count - 2);// 5 количество ушей сразу для пары : чёт . и нечёт
    }

    //Дано положительное целочисленное N. Верните количество семёрок в числе. 717 - вернёт 2.
    //Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6), а деление на 10 удалит правую цифру(126 / 10 равно 12).
    //Авторы задачи были к нам слишком добры и практически решили её прямов условии.
    public static int count7(int n) {
        if (n == 0) return 0;
        else if (n % 10 == 7) return 1 + count7(n / 10);
        return count7(n/10);
    }
}

