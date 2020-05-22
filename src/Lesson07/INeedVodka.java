package Lesson07;

/**
 * Tel ran first project
 * 29/04/2020  12:21
 */
public class INeedVodka {
    public static void main(String[] args) {
        int age = 10;
        checkAge( 16);
        checkAge(17);
        checkAge( 18);
        checkAge( 30);

    }

    public static void checkAge(int age) {

        if (age < 16) {
            System.out.println(" Pokupatelyu "+age+ " Tovari dlya vzroslih ");
        }else if (age >= 18 ){
            System.out.println(" Pokupatelyu "+age+  " Mojno prodavat vse tovari ");
        }else {
            System.out.println( " Pokupatelyu "+age+ " Tabak prodavat mojno ,pivo toje , vodka net "
            );
        }

    }
}

