package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  10:03
 */
public class Repeat {
    public static void main(String[] args) {
        tryWithOutCry();
    }

    public static void tryWithOutCry() {
        String name = "Petya§Vasеchkin";
        name = name.replace('е','ё');
        System.out.println(name);

        char symbol = name.charAt(4);
        System.out.print("Chetvettii index : " +symbol);


    }

}