package Lesson08;

/**
 * Tel ran first project
 * 30/04/2020  12:03
 */
public class HelloModulo {
    public static void main(String[] args) {
        helloHelloModulo();

        System.out.println(findLeapYear(190));
        System.out.println(findLeapYear(1990));
        System.out.println(findLeapYear(2020));
        System.out.println(findLeapYear(2019));
        System.out.println("-----");
        System.out.println(findLeapYear(10));
        System.out.println(findLeapYear(2020));

    }

    private static void findeNumber( int number ){
         int leap   = number % 2;

    }

    private static boolean findLeapYear(int year) {
        int leap = year % 4;
        if (leap == 0) {
            return true;
        } else {
            return false;
        }

    }


    private static boolean Simple(int year) {
        return year % 4 == 0;

    }

    private static void helloHelloModulo() {
        // 56 % 24=8;
        //56 / 24 =2;
        int a = 1;
        int b = 10;
        int c = 1 / 10;

        int d = 1 % 10;


        System.out.println(" Result deleniya " + c);
        System.out.println(" Result deleniya " + d);


        int делимое = 75;
        int делитель = 13;
        int f = делимое % делитель;

        int остаток = делимое - (делимое / делитель) * делитель;
        int j = 7 % 2;

        System.out.println(f);
        System.out.println(остаток);


    }
}
