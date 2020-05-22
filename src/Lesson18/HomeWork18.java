package Lesson18;

/**
 * Tel ran first project
 * 18/05/2020  19:20
 */
public class HomeWork18 {
    public static void main(String[] args) {
        //triangle(10);
        AnketaMe();
    }

    public static void triangle(int a) {
        String star = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = line + " " + star;
            System.out.println(line);
        }
    }
    public static void AnketaMe() {
        String name = new String(" Меня зовут \"Юлия Шиклуна\"");
        System.out.println(name);
    }

}
