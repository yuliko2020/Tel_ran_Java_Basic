package Lesson03;

public class GoodMorningMagic {
    public static void main(String[] args) {
        //magicVariable();
        //int a = 2;
        // int b = 3;
        //magicAddition(a, b);



    }

    public static void magicAddition(int a, int b) {
        int c = a + b;
        System.out.println("Sum a and b = c: " + c);

    }



    public static void magicVariable() {
        double firstVariable = 2.0;
        double secondVariable = 63.0;
        double thirdVariable = 10.0;
        double result = Math.pow(firstVariable, thirdVariable);
        System.out.println(" result math op :" + result);
        double secondResult = Math.pow(firstVariable, secondVariable);
        int lifeResult = (int) secondResult;
        System.out.println("preobrazov result vozvedeniiy i stepen 2^20:" + lifeResult);
    }

}
