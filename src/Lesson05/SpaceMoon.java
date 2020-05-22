package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  10:53
 */
public class SpaceMoon {
    public static void main(String[] args) {
        // chto bi poslat raketu v cosmoc nam nado :
        // temperatura,dostatochnoe kolichestvo topliva, 4 chlena ekipaja
        int ekipaj = team();
        int bak = fuel();
        fly(ekipaj, 25, bak);
    }

    public static void fly(int team, int temperatur, int fuel) {
        // проверяем количество экипажа, температуры и топлива
        // Обратный отсчёт

        System.out.println("you can fly");
    }

    public static int team() {
        // вычисления
        int team = 4;
        return team;
    }
    public static int fuel() {
        // вычисления изменились
        int toplivo = 10_000;
        return toplivo;
    }

}