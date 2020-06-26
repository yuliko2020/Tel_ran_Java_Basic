package Lesson45_ArrayList.project;
import java.util.ArrayList;

/**
 * TelRanJavaBasicModulOne
 * 24/06/2020  12:24
 */

public class Pool {
    public static ArrayList listOfAlcohol() {
        ArrayList<Alcohol> listOfAlcohol = new ArrayList<>();

        Alcohol beer = new Alcohol("Bier ", 4.5);
        Alcohol redWine = new Alcohol("Red wine ", 10.5);
        Alcohol champagne = new Alcohol("Champagne  ", 9.0);
        Alcohol vodka = new Alcohol("Vodka ", 40.0);
        Alcohol whiskey = new Alcohol("Whiskey ", 4.5);
        Alcohol witheWine = new Alcohol("Withe Wine ", 10.0);
        Alcohol absinthe = new Alcohol("Absinthe ", 50.0);
        Alcohol samogon = new Alcohol("Samogon ", 10.0);


        Alcohol kefir = new Alcohol("Kefir ", 0.05);
        Alcohol kvas = new Alcohol("Kvas ", 0.01);

        Alcohol another = new Alcohol("Another ", 20.0);
        listOfAlcohol.add(beer);
        listOfAlcohol.add(redWine);
        listOfAlcohol.add(champagne);
        listOfAlcohol.add(vodka);
        listOfAlcohol.add(whiskey);
        listOfAlcohol.add(witheWine);
        listOfAlcohol.add(absinthe);
        listOfAlcohol.add(samogon);
        listOfAlcohol.add(kefir);
        listOfAlcohol.add(kvas);
        listOfAlcohol.add(another);

        return listOfAlcohol();
    }

    public static ArrayList<Person> createPersonList(){
        ArrayList <Person>personList=new ArrayList<>();
        Person igor=new Person("Igor",175,86,Gender.MALE);
        Person andrey=new Person("Andreyr",160,90,Gender.MALE);
        Person gena=new Person("Gena",180,100,Gender.MALE);
        Person sveta=new Person("Sveta",175,70,Gender.FEMALE);
        Person ira=new Person("Ira",165,55,Gender.FEMALE);


        personList.add(igor);
        personList.add(andrey);
        personList.add(gena);
        personList.add(sveta);
        personList.add(0,ira);
        return personList;
    }

}
