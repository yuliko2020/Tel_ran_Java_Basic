package Lesson45_ArrayList.project;

import java.util.Date;

/**
 * TelRanJavaBasicModulOne
 * 24/06/2020  12:38
 */
public class Person {
    private String firstName;
    private int height;
    private double weight;
    private Date birthDay;
    public Gender gender;
    //Version alpha 002 made 24 june 2020 year
    //11.00.01--11(мажорная версия - не бета-верся )+2 --изменения внутри весрии +3 какие-то добавления
    //это называется версинирование
    //private final long VERSION_PERS = 2020_04_24_00_00_2l;


    public Person() {
    }

    public Person(String firstName, int height, double weight,  Gender gender) {
        this.firstName = firstName;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public Gender getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}


class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.gender = Gender.FEMALE;
    }


}
