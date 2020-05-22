package Lesson14;

public class Floyd {
    public static void main(String[] args) {
        floydGenerate(10);
    }

    private static void floydGenerate(int line) {
        int n = 1;
        int temp = 15;
        for (int i = 1; i < line; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }

    }
}