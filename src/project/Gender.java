package project;

/**
 * TelRanJavaBasicModulOne
 * 26/06/2020  11:11
 */
public enum  Gender {
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
