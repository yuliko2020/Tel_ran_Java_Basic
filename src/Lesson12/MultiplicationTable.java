package Lesson12;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a = 10;
        int b;
        generateMT(10, 0);
    }

    // добавить "" к однозначным числам - дома
    public static void generateMT(int a, int number) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(i * j + " ");
            }
            if (number <= 10) {
                System.out.print(" ");
            } else if (number >= 100) {
                System.out.print("   ");
            } else if (number >= 10) {
                System.out.print("    ");
            }
            System.out.println();
        }
    }

}
