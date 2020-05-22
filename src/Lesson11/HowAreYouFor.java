package Lesson11;

/**
 * Tel ran first project
 * 06/05/2020  10:11
 * <p>
 * Данные числа а и б , где   Б > 0  Вывести B раз число А
 */
public class HowAreYouFor {
    public static void main(String[] args) {
       //myPrettyPrintByFor();
        //reviewFor();
        //magicFor();
        reviewForOne();
    }

    public static void reviewForOne() {
        int a = 0;
        int b = 10;
        for (int i = 0; i < b; i++) {
            System.out.println(" Значение B :" + a);
        }

    }

    private static void magicFor() {
        for (int i = 1; i < 20; i = 2 * i) {
            System.out.println(i);
        }

    }

    public static void myPrettyPrintByFor() {

        for (int i = 1; i < 10; i++) {

            // System.out.print(i);
        }

        for (int i = 1; i < 1_000_000_000; i = 10 * i) {
            // System.out.println(i);
        }

        String s = "s";
        for (int i = 0; i < 10; i++) {
            s = s + "a";
            System.out.println(s);
        }

    }

    public static void reviewFor() {

        int a = 20;
        int b = 11;
        int c;
        for (int i = 0; i < a; i++) {
            b = b + 1;
            c = i + 1;

            System.out.println(" Значение Ц :" + c);
        }
        System.out.println(" Значение b :" + b);
    }


}
