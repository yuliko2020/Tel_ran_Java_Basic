package Lesson06;

/**
 * Tel ran first project
 * 29/04/2020  09:38
 */
public class Range10 {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(90));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(-10));
        System.out.println(nearHundred(-500));
        System.out.println(nearHundred(-90));
        System.out.println(nearHundred(-190));
        System.out.println(nearHundred(-200));
        System.out.println("Второй метод" + nearHundredTwo(-95, 10, 100, 200));


    }

    public static boolean nearHundredTwo(int n, int range, int target1, int target2) {
        n = Math.abs(n);
        return n >= target1 - range & n <= target1 + range || n >= target2 - range & n <= target2 + range;
    }



    public static boolean nearHundred(int n) {
        n = Math.abs(n);
        boolean bool = true;
        int range = 10;
        int target1 = 100;
        int target2 = 200;
        bool = n >= target1 - range & n <= target1 + range || n >= target2 - range & n <= target2 + range;
        return bool;
    }

}
