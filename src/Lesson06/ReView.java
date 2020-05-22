package Lesson06;

/**
 * Tel ran first project
 * 28/04/2020  09:36
 */
public class ReView {
    public static void main(String[] args) {
        //exercise01();
        exercise06();

    }

    public static void exercise01() {
        System.out.println(" Hello World!");

    }

    public static void exercise02() {
        int a = 5;
        int b = 6;
        int c = a + b;
        long veryLongIntejer = 200_985_734_958L;
        System.out.println(c);


    }

    public static void exercise03() {

        double veryDouble = 3.14;
        final double PI = Math.PI;
        System.out.println(PI);

        final int MIN = 100;
        final int MAX = 50;

    }

    public static void exercise04() {
        char at = '@';
        char oneHundrede = 100;
        String myVeryShortString = "";
        myVeryShortString = myVeryShortString + at;
        myVeryShortString = myVeryShortString + oneHundrede;
        System.out.println(myVeryShortString);


    }

    public static void exercise05() {

        boolean iKnow = true;
        boolean youKnowNothingJohnSnow = true;
        boolean result = iKnow && youKnowNothingJohnSnow;
        boolean toBeOrNotToBe = iKnow || youKnowNothingJohnSnow;
        boolean a = (7 + 8) * 5 > 7 + 8 * 5; // true
        boolean b = ((7 + 8) * 4 != 7 + 4 * 5); // true
        boolean c = (3 + 4 > 9 + 1 & 16 - 5 > 3 * 4); // false
        boolean d = false & true | false ^ true; // true
        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;  //  true
        boolean f = !(3 * 4 < 7 + 8); //false

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);


    }
    public static void exercise06(){
        int starNumber =1;
        String  starName ="";
        switch ( starNumber){
            case 1 :
                starName = "Sun";
                break;
            case 2 :
                starName = "Aldebaran";
                break;
            case 3 :
                starName = "Andromeda";
                break;
            default:
                starName = " I dont know ";
                break;



        }
        System.out.printf(" Star number N°%d %s ", starNumber,starName);
    }
}
