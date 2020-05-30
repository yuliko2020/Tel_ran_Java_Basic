package Lesson25;

/**
 * TelRanJavaBasicModulOne
 * 28/05/2020  10:04
 */
public class JustBoolean {
    public static void main(String[] args) {


    }

    public static void trip(boolean vacation, boolean weekend) {
        if (vacation || !weekend) {
            System.out.println("Мы едем в отпуск ");
        }
        System.out.println(" Мы никуда не едем");

    }

    public static boolean no23(int[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 2 || args[i] == 3) {
                return false;
            }
        }
        return false;
    }
}
