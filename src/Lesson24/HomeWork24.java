package Lesson24;

import java.util.Arrays;

/**
 * TelRanJavaBasicModulOne
 * 27/05/2020  17:27
 */
public class HomeWork24 {
    public static void main(String[] args) {
        int[] a1 = new int[]{4, 5};
        int[] b1 = new int[]{4, 2};
        int[] c1 = new int[]{3, 5};
        //System.out.println(no23(a1));//true
        //System.out.println(no23(b1));//→false
        //System.out.println(no23(c1));// →false
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{2, 3, 5};
        int[] c = new int[]{1, 2, 1};
        System.out.println(Arrays.toString(fix23(a)));//→ [1, 2, 0]
        System.out.println(Arrays.toString(fix23(b)));//→ [2, 0, 5]
        System.out.println(Arrays.toString(fix23(c)));//→ [1, 2, 1]
    }

    //09_EA_01:6_ Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    // set the 3 element to 0. Return the changed array.
    private static int[] fix23(int[] number) {
        if (number[0] == 2 && number[1] == 3) number[1] = 0;
        if (number[1] == 2 && number[2] == 3) number[2] = 0;
        return new int[]{number[0], number[1], number[2]};
    }

    //09_EA_01:5_Given an int array length 2, return true if it does not contain a 2 or 3.
    private static boolean no23(int[] nums) {

        return (nums[0] != 2 && nums[1] != 3 && nums[1] != 2 && nums[0] != 3);
    }


}

