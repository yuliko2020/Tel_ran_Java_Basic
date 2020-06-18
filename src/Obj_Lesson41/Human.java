package Obj_Lesson41;

/**
 * TelRanJavaBasicModulOne
 * 18/06/2020  10:04
 */
public class Human {
    String name;
    int speed;
    Dog dog;
    boolean emailCheck = false;


    Human() {

    }

    Human(String name) {
        this.name = name;
    }

    Human(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    void walk(int speed) {
        this.speed = speed;
    }

    void run() {
        int runSpeed = this.speed * 3;
        System.out.println(runSpeed);
    }

    public void walkWithDog(int speed) {
        walk(speed);
        dog.runAround(speed * 2);
    }
}

class Dog {
    String name;
    int speed;


    Dog() {

    }

    Dog(String name) {
        this.name = name;
    }

    void runAround(int skorost) {
        this.speed = skorost;
        System.out.println("Скорость собаки "+ speed);
    }


}

class Test {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tuzic");
        Human lastMan = new Human(" Vasechkin", myDog);

        lastMan.walkWithDog(5);
    }
}
