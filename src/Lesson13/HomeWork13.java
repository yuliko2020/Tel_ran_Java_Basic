package Lesson13;

public class HomeWork13 {
    public static void main(String[] args) {
        adultPerson(false);
        checkAge(true);
        vacationTwo(4);
        generateMT(10, 0);

    }

    private static void adultPerson(boolean a) {
        int age = 0;
        if (a) {
            age = 18;
        } else {
            age = 16;
        }
        System.out.println(age);
    }

    public static void checkAge(boolean a) {
        int age = (a) ? 18 : 16;
        System.out.println(age);

    }

    public static void vacation(boolean permission) {
        if (permission) {
            System.out.println("Я поеду в лагерь ");
        } else {
            System.out.println(" Я останось на всё лето дома !");
        }
    }

    public static void vacationTwo(int permission) {
        String studyingYear = "";
        studyingYear = (permission >= 4) ? "Я поеду в лагерь" : "Я останусь на всё лето дома !";
        System.out.println(" Как результат моей учёбы : " + studyingYear);
    }

    // Пыталась доделать таблицу ,но увы не получается
    public static void generateMT(int a, int number) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i * j + " ");
            }
            if (number < 10) {
                System.out.print(" ");
            } else if (number >= 100) {
                System.out.print("   ");
            } else if (number > 10) {
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}

