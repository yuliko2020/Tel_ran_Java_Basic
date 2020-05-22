package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  11:26
 */
public class HelloBoolean {

    public static void main(String[] args) {
        //myBoolean();
        //yourNotMe();
        //System.out.println("Rebenok i karmannue dengi : " + yourOrMe());
        //System.out.println("Dva ofisera: " + yourAndMe());
        System.out.println("Otpusk udalsya ? " + vacation());
    }

    public static boolean vacation() {
        boolean alpy = true;
        boolean babushka = false;
        boolean iAmHappy = alpy ^ babushka;
        return iAmHappy;
    }

    public static boolean yourAndMe() {
        boolean officerOne = false;
        boolean officerTwo = true;
        boolean result = officerOne & officerTwo;
        return result;
    }

    public static boolean yourOrMe() {
        boolean papa = true;
        boolean mama = true;
        boolean child = papa | mama;
        return child;
    }

    public static void yourNotMe() {
        boolean a = true;
        boolean b = !a;
        System.out.println(b);
    }

    public static void myBoolean() {
        int a =3;
        int b = 5;
        boolean boolTwo = false;
        boolean boolThree = true;
        boolean boolOne = a <= b;
        boolean boolFor = a >= b;
        System.out.println(boolOne);
        System.out.println(boolFor);
        // Smartphonu,kotorie deshevle 500 euro ,novue, s android versiei 9 i vushe , i Samsung ili Nokia
    }


}


