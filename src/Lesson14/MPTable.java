package Lesson14;

public class MPTable {
    public static void main(String[] args) {
        mpGenerate(10);

    }

    private static void mpGenerate(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(spaceForTable(i, j));
            }
            System.out.println(" ");


        }
    }

    private static String spaceForTable(int a, int b) {
        if (a * b < 10) {
            return "   " + String.valueOf(a * b);
        } else if (a * b <= 100) {
            return "  " + String.valueOf("" + "" + a * b);
        }
        return String.valueOf(a * b);
    }
}