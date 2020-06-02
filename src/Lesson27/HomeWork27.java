package Lesson27;

/**
 * TelRanJavaBasicModulOne
 * 02/06/2020  19:33
 */
public class HomeWork27 {
    public static void main(String[] args) {
        mineSweeper();
    }

    public static void mineSweeper() {
        int[][] gameBoard = new int[10][10];

        for (int row = 0; row < gameBoard.length; row++) {
            for (int column = 0; column < gameBoard.length; column++) {
                gameBoard[row][column] = (row + 1) * (column + 1);
                System.out.printf("%4d", gameBoard[row][column]);
            }
            System.out.println();
        }

    }

}

