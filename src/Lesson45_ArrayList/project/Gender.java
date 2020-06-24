package Lesson45_ArrayList.project;

/**
 * TelRanJavaBasicModulOne
 * 24/06/2020  12:44
 */
public enum Gender {
    MALE(1),
    FEMALE(2),
    DIVERSE(3);


    public int gender;

    Gender(int gender) {
        this.gender = gender;

    }

    public int getGender() {
        return gender;
    }
}
