package project;

import java.util.ArrayList;


/**
 * TelRanJavaBasicModulOne
 * 26/06/2020  11:13
 */
public class Pool {
    public static ArrayList listOfAlcohol() {
        Alcohol beer = new Alcohol("Bier", 4.5);
        Alcohol redWine = new Alcohol("Red Wein", 10.5);
        Alcohol champagne = new Alcohol("Sekt", 9.0);
        Alcohol vodka = new Alcohol("Vodka", 40.0);
        Alcohol whisky = new Alcohol("Whisky", 40.0);
        Alcohol whiteWine = new Alcohol("White Wein", 10.5);
        Alcohol absinthe = new Alcohol("Absinthe", 50.0);
        Alcohol samogon = new Alcohol("Samogon", 55);

        Alcohol kefir = new Alcohol("Kefir", 0.05);
        Alcohol kvas = new Alcohol("Kvas", 0.01);


        Alcohol another = new Alcohol("Schnaps", 20.0);

        listOfAlcohol().add(beer);
        listOfAlcohol().add(redWine);
        listOfAlcohol().add(champagne);
        listOfAlcohol().add(vodka);
        listOfAlcohol().add(whisky);
        listOfAlcohol().add(whiteWine);
        listOfAlcohol().add(absinthe);
        listOfAlcohol().add(samogon);
        listOfAlcohol().add(kefir);
        listOfAlcohol().add(kvas);
        listOfAlcohol().add(another);

        return listOfAlcohol();
    }

    public static ArrayList<Person> createPersonList() {
        ArrayList<Person> personList = new ArrayList<>();
        Person igor = new Person("Игорь", 175, 86, Gender.MALE, 25);
        Person andrej = new Person("Андрей", 160, 90, Gender.MALE, 35);
        Person gena = new Person("Гена", 180, 100, Gender.MALE, 45);
        Person cveta = new Person("Света", 175, 70, Gender.FEMALE, 30);
        Person ira = new Person("Ира", 165, 55, Gender.FEMALE, 40);

        personList.add(igor);
        personList.add(andrej);
        personList.add(gena);
        personList.add(cveta);
        personList.add(0, ira);
        return personList;
    }


}
