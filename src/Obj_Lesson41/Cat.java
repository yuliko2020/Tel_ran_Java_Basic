package Obj_Lesson41;

import java.util.Date;

/**
 * TelRanJavaBasicModulOne
 * 18/06/2020  11:20
 */
public class Cat {
    private String name;
    private double price = 100;

    private String breed;
    private Date birthDate;
    private String color;
    private boolean passport;
    private String gender;
    private double weight;
    private double height;
    private int chipNumber;
    private Adress adress;

    Cat() {
        setName("Pushistick ");
        setName("fofofo "+price);
    }

    private Date getBirthDate() {

        return birthDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() { // возвращает , ничего не принимает только отдает
        return name;
    }

    public void setName(String name) {// setter исполняет , принимает параметр , изменяет или создает
        this.name = name;
    }

    public double getPrice(double price) {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreed(String breed) {
        return breed;
    }

    private void setBreed(String breed) {
        this.breed = breed;
    }


}

class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());
        cat.setName("Tiger ");
        System.out.println(cat.getName());
        cat.setPrice(200);

        cat.setColor("White");
        System.out.println(cat.getColor());

    }
}


class Adress {
    String city;
    String street;
    int houseNumber;
    int zip;

    Adress(int zip, String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.houseNumber = houseNumber;
    }
}

