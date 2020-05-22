package Lesson03;

public class HelloDouble {
    public static void main(String[] args) {
        //addFloat();
        //intDivision();
        //douableDivision();
        goodMorningPi();
        //magicNumber();
        //magiccasting();


    }
    public static void magiccasting(){
        int a = 5;
        double b = a;
        //automatic
        double c =2.4;
        int d = (int)c ;
        System.out.println(d);
    }

    public static void magicNumber() {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        double var7 = var1 / var2;

        double var25 = var1 / var4;

        System.out.println("Int Var3 - " + var3);
        System.out.println("Int Var6 - " + var6);
        System.out.println("Int Var7 - " + var7);
        System.out.println("Int Var25 - " + var25);

        int var11 = (int) (var1 / var4);

        System.out.println("Int Var11 - " + var11);
        System.out.println("Magic " + 5.0 / var2);

    }

    public static void goodMorningPi() {
        final double PI = 3.14;
        //
        //
        double r = 1000_000.0;
        r = r + 1;
        double square = PI * r * r;
        System.out.println(" area our square : " + square);
        // 1_000_000 1E+06 = 1*10
        //1E-06 = 1/10


    }

    public static void douableDivision() {
        double a, b, c;
        a = 1;
        b = 10;
        c = a / b;
        System.out.println("result divid a and b give result c " + c);

    }


    public static void intDivision() {
        int a, b, c;
        a = 1;
        b = 10;
        c = a / b;
        System.out.println("result divid a and b give result c " + c);

    }

    public static void addFloat() {
        float a = 3.5f;
        float b = 4.5F;
        float c = (float) 5.5;
        float d = a + b + c;
        System.out.println("a + b + c:" + d);

    }
}
