package Obj_Lesson40;

/**
 * TelRanJavaBasicModulOne
 * 17/06/2020  10:42
 */
public class Car {
    String modelName;
    String type;
    String motorID;
    String color = "серый";
    double volumeMotor;
    int tiles = 4;// kolesa
    int doors = 5;
    int mileage;

    public Car() {

    }

    public Car(String newModelName,
               String type,
               String motorID,
               String color,
               double volumeMotor,
               int tiles,
               int doors,
               int mileage) {
        this.modelName = newModelName;
        this.type = type;
        this.motorID = motorID;
        this.color = color;
        this.volumeMotor = volumeMotor;
        this.tiles = tiles;
        this.doors = doors;
        this.mileage = mileage;

    }

    public Car(String factoryColor) {
        color = factoryColor;
    }

    public Car(int kolesa) {
        tiles = kolesa;
    }

    public Car(int newDoors, int kolesa) {
        doors = newDoors;
    }

    void move(int km) {
        System.out.println("Машина проехала " + km);
        mileage += km;
    }

    void paint(String newColor) {
        System.out.println("Машина перекрашена в " + newColor + " из " + color);
        color = newColor;

    }

}

class carTest {
    public static void main(String[] args) {
        Car myNewCar = new Car();
        myNewCar.move(100);
        System.out.println(myNewCar.mileage);

        myNewCar.move(400);
        System.out.println(myNewCar.mileage);
        myNewCar.paint("розовый");

        Car ferari = new Car("Yelow");
        System.out.println(ferari.color);
    }
}
