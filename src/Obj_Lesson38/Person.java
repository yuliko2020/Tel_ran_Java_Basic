package Obj_Lesson38;

/**
 * TelRanJavaBasicModulOne
 * 16/06/2020  11:15
 */
public class Person {
    String firstName;
    double weight;
    double height;
    int age;
    String gender;
    double bmi;
    boolean matriculation;
    char selfTotem;

    public Person() {
        //Пустое
    }

    public Person(double personWeight, double personHeight) {
        weight = personWeight;
        height = personHeight;

        findBmiClassIndex();
    }

    public Person(String personName) {
        firstName = personName;
    }

    public void findBmiClassIndex() {
        double personWeight = weight;
        double personHeight = height;

         bmi = personWeight / (personHeight * personHeight);
    }

}
