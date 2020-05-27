package Lesson23;

/**
 * TelRanJavaBasicModulOne
 * 27/05/2020  17:30
 */
public class GermanCity {
    public static void main(String[] args) {
        germanCity();
    }

    public static void germanCity() {
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Köln", "Potsdam"};
        int allGermanCity = germanCity.length;
        int allLetter = 0;
        for (int i = 0; i < allGermanCity - 1; i++) {
            allLetter = allLetter + germanCity[i].length();
        }
        System.out.println("allGermanCity: " + allGermanCity);
        System.out.println("allLetter: " + allLetter);
    }
}
