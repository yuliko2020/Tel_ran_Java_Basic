package Lesson39_Hw_Swan;

/**
 * TelRanJavaBasicModulOne
 * 16/06/2020  19:39
 */
public class Swan {
    int age;
    boolean children;
    String color;
    String breed;


    void swims() {

        System.out.println("The swan swims in the lake !");
    }

    void hiss() {

        System.out.println("The swan hisses !");
    }

    void eats() {
        if (children) {
            System.out.println("Don't come I'm afraid");
        } else hiss();

    }

    void flies() {
        System.out.println("The swan flies away !");
    }

}
