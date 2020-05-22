package Lesson07;

/**
 * Tel ran first project
 * 29/04/2020  11:54
 */
public class HelloIf {
    public static void main(String[] args) {
        boolean permisshion = false;
        vacation(permisshion);

        double speed = 5.0;
        spaceShutle(speed);

    }

    private static void spaceShutle(double speed) {
        final double SUPERCONSTANT_G = 9.8;
        if (speed < SUPERCONSTANT_G) {

            System.out.println(" Pervonachalnoe uskorenie nedostatochno");
            System.out.println(" raceta ne mojet startovat");
            System.out.println(" podgotovit avariinie slujbi ");

        } else {
            System.out.println(" Raceta uletaet v kosmos");
            System.out.println(" Vipustit relis ob uspeshnom zapuske ");
            System.out.println("Predstavit vseh programistov k gos nagradam");
        }


    }

    public static void vacation(boolean permission) {

        if (permission) {
            System.out.println("Ya poedu v lager  ");
        } else {
            System.out.println(" Ya ostanus na vse leto doma !");
        }

    }


}

