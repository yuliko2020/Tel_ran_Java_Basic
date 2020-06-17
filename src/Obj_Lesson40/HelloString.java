package Obj_Lesson40;

/**
 * TelRanJavaBasicModulOne
 * 17/06/2020  09:42
 */
public class HelloString {
    public static void main(String[] args) {
        // String Pool
        String firstName1 = "Andrey";
        String firstName2 = "Andrey";
        String firstName3 = new String("Andrey");
        String firstName4 = new String("Andrey");

        System.out.println( firstName1 == firstName2);
        System.out.println("Объекты  " + firstName3 == firstName4);
        System.out.println("Объект и литерал " + firstName1 == firstName3);
        System.out.println("------------------------");
        System.out.println("Литералы  " + firstName1.equals(firstName2));
        System.out.println("Объекты " + firstName3.equals(firstName4));
        System.out.println("Объект и литерал " + firstName1.equals(firstName3));
        System.out.println("----------------------------");

    }
}
