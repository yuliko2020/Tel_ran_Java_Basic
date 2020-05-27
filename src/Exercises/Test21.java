package Exercises;

/**
 * Tel ran first project
 * 23/05/2020  23:32
 */
public class Test21 {
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));//→ 2
        System.out.println(countYZ("day fez"));// → 2
        System.out.println(countYZ("day fyyyz"));//→ 2
    }
    //05_ES_03_Given a string, count the number of words ending in 'y' or 'z'
    // -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
    // We'll say that a y or z is at the end of a word if there is not an alphabetic letter
    // immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
    public static int countYZ(String str) {
        int count = 0;
        //If it has at least 2 characters, we check both ends to see how many matching instances we have.
        if (str.length() >= 2) {
            if (!Character.isLetter(str.charAt(1))
                    && (str.charAt(0) == 'y' ||
                    str.charAt(0) == 'Y' ||
                    str.charAt(0) == 'z' ||
                    str.charAt(0) == 'Z')) {
                count++;
            } else if (Character.isLetter(str.charAt(str.length() - 2))
                    && (str.charAt(str.length() - 1) == 'y' ||
                    str.charAt(str.length() - 1) == 'Y' ||
                    str.charAt(str.length() - 1) == 'z' ||
                    str.charAt(str.length() - 1) == 'Z')) {
                count++;
            }
            return count;
        }
        //If it has more than 3 characters, we check the middle using a for loop.
        if (str.length() >= 3) {
            for (int i = 2; i < str.length(); i++) {
                char testOne = str.charAt(i - 2);
                char testTwo = str.charAt(i - 1);
                char testThree = str.charAt(i);
                //if the first char is a letter, second is a "YZyz" char, and the third is not a letter, we increment ret by 1.
                if (Character.isLetter(testOne) && (testTwo == 'y' ||
                        testTwo == 'Y' || testTwo == 'z' ||
                        testTwo == 'Z') && (!Character.isLetter(testThree))) {
                    count++;
                }

                return count;
            }

            return count;
        }
        return count;
    }
}
