package imperative_Lesson38;

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


    public void findBmiClassIndex() {
        double personWeight = weight;
        double personHeight = height;

         bmi = personWeight / (personHeight * personHeight);
    }

}
