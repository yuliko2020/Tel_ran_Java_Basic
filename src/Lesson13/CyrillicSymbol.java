package Lesson13;

public class CyrillicSymbol {
    public static void main(String[] args) {
        cyrillicTest();


    }

    public static void cyrillicTest() {
        String firstOne = "абвгдэптрейлкдйгфлсдгфхервйктхкасфхакиу";
        String name = "АЁ";
        System.out.println(name.codePointAt(0));
        System.out.println(name.codePointAt(1));

        for (int i = 1040; i < 1072; i++) {
            char temp = (char) i;
            System.out.print(temp);

        }
    }

}
