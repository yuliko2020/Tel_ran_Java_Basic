package Lesson12;

public class ChristmasTreeFour {
    public static void main(String[] args) {
        int side = 7;
        christmasTreeFour(side);
    }
    //равнобедренный треугольник
    public static void christmasTreeFour(int side){
        String star = "*";
        String space = " ";
        String starOne = "+";
        String spaceLine = " ";
        String starLine = " ";
        String starOneLine = "4";
        String line = "";
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine + space;
        }
        for (int i = 0; i < side; i++) {
            spaceLine = spaceLine.substring(0, spaceLine.length() - 1);
            starLine = starLine + star;
            starOneLine = starOneLine + starOne;
            line = spaceLine + starLine + starOneLine;
            System.out.println(line);
        }
    }
    // ромб - at home

}
