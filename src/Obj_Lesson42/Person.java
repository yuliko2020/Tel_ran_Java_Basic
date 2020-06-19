package Obj_Lesson42;

/**
 * TelRanJavaBasicModulOne
 * 19/06/2020  10:04
 */
public class Person {
    private String name;
    private String firstName;
    public int age;

    public Person(String ln, String fn) {
        name = ln;
        firstName = fn;
    }

    public Person() {
        this("Doe", "John");
    }

    public Person(String ln, String fn, int ag) {
        name = ln;
        firstName = fn;
        this.age = ag;
    }

    public void setName(String ln, String fn) {
        this.name = ln;
        firstName = fn;
    }

    public String fullName() {
        return (name + " " + firstName);
    }

    public String getFirstName() {
        return firstName;
    }


}
