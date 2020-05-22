package Lesson13;

public class AOExercise12_3 {
    public static void main(String[] args) {
        oddEven(123);

    }

    public static void oddEven(int a){
        if(a % 2 == 0){
            System.out.println("чёт");
        }else{
            System.out.println("нечет");
        }
    }
}
