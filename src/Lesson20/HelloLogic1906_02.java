package Lesson20;

/**
 * Tel ran first project
 * 20/05/2020  11:07
 */
public class HelloLogic1906_02 {

    public static boolean makeBricks(int smallBricksCount, int bigBricksCount, int goalSize) {

        int sizeSmall = 1;
        int sizeBig = 5;

        for (int i = 0; i <= smallBricksCount; i++) {
            for (int j = 0; j <= bigBricksCount; j++) {
                int maybeGoal = i * sizeSmall + j * sizeBig;
                //System.out.println(maybeGoal);
                if (maybeGoal == goalSize) return true;
                //количество мал. кирпичей * на размер мал. +количество бол. * на размер бол == size row; //то true

            }
        }
        return false;
    }

    public static boolean makeBricksDos(int smallBricksCount, int bigBricksCount, int goalSize) {
        int sizeSmall = 1;
        int sizeBig = 5;
        //  большие кир.
        int maybeGoal = goalSize % (bigBricksCount * sizeBig) + smallBricksCount;
        return maybeGoal >= 0; // not solved
    }

    // Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
    // inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper
    // "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
    // In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
    // Define the helper below and at the same indent level as the main noTeenSum().
    public static int noTeenSum(int a, int b, int c) {
        int result = fixTeen(a) + fixTeen(b) + fixTeen(c);
        return result;
    }

    public static int fixTeen(int n) {

        if (n >= 13 & n <= 19 ^ (n == 15 | n == 16)) return 0;
        return n;
    }

    // Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    // Return 0 if they both go over
    public static int blackjack(int a, int b) {
        a = over21(a);
        b = over21(b);
        if (a > b) return a;
        return b;
    }

    public static int over21(int n) {
        if (n > 21) return 0;
        return n;
    }

    // 4. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
    // it does not count towards the sum.
    public static int loneSum(int a, int b, int c) {
        if (a == b & a == c) {
            a = 0;
            b = 0;
            c = 0;
        } else if (a == b) {
            a = 0;
            b = 0;
        } else if (a == c) {
            a = 0;
            c = 0;
        } else if (b == c) {
            b = 0;
            c = 0;
        }
        return a + b + c;
    }
}
