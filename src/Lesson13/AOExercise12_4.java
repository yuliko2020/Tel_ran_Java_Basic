package Lesson13;

public class AOExercise12_4 {
    public static void main(String[] args) {
        printLineNTimes("hello",3);
    }
    static void printLineNTimes(String sayWhat, int times){
        for (int i = 0; i < 10; i+=2) {
            System.out.println(sayWhat);
        }
    }
}
