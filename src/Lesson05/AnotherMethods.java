package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  10:46
 */
public class AnotherMethods {
    public static void main(String[] args) {
        String lastName = "Podlubnyj";
        String endName = "A n d r e j";

        int summe = addition(4,6);
        System.out.println(addition(5, 7));

    }
    public static int giveMeLength(String firstName, String lastName) {
        int myLength = (firstName + lastName).length();
        return myLength;
    }

    public static int addition(int x, int y) {
        return x + y;
    }
    public static double bodyMassIndex(int yaer, String gender, int width){
        // vuchisleniya
        double bmi = 30.5;
        return bmi;
    }
}
