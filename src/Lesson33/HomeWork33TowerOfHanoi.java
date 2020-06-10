package Lesson33;

/**
 * TelRanJavaBasicModulOne
 * 10/06/2020  17:47
 */
public class HomeWork33TowerOfHanoi {
    static int count = 1;

    public static void main(String[] args) {
        hanoiTower(3, "A", "B", "C");
    }

    //пирамидка из N дисков на первом из трёх столбиков (назовём их A, B ,C ),наша задача - переместить
    // диски со столбика А на столбик В , и не допустить чтобы большой диск переместился поверх меньшего.
    public static void hanoiTower(int n, String start, String temp, String end) {
        if (n == 1) {
            System.out.println(count + " Переместить диск с " + start + " на " + end);
            count++;
        } else {
            hanoiTower(n - 1, start, end, temp);
            System.out.println(count + " Переместить диск с " + start + " на " + end);
            count++;
            hanoiTower(n - 1, temp, start, end);

        }


    }
}
