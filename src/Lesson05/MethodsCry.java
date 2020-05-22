package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  10:36
 */
public class MethodsCry {
    public static void main(String[] args) {
        callMe ();
    }

    public static int giveMeYourNumber(){
        // proizoshlo znakovstvo
        // day mne svoy nomer
        int telNumber =23456;
        return telNumber;

    }

    public  static void callMe (){

        // zvonoc
        int girlNumber = giveMeYourNumber();
        System.out.println( "zvonoc posle cluba:"+ girlNumber);
    }

}
