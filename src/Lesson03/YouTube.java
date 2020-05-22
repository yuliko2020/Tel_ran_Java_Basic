package Lesson03;

/**
 * Tel ran first project
 * 25/04/2020  17:48
 */
public class YouTube {
    public static void main(String[] args) {
        //swimmingPool();
        double firstVariable = 70;
        double secondVariable = 50;
        tubeForEver(firstVariable, secondVariable);
        tubeForEver(50, 70);
        tubeForEver(firstVariable, 80);
    }

    /*Через первую трубу бассейн можно наполнить за 20 ч, а через вторую — за 30 ч.
    За сколько часов наполнится бассейн через обе эти трубы?
    Through the first pipe the pool can be filled in 20 hours, and through the second in 30 hours.
    In how many hours will the pool need to be filled through both of these pipes?
 */
    public static void swimmingPool() {
        int firstTube = 20;
        int secondTube = 30;
        int result = 0;
        //1 / 20 +1 / 30
        // 30 * 1 / 20 * 30 + 20 *1 / 30 * 20 =
        result = secondTube * firstTube / (secondTube + firstTube);
        System.out.println(result);

    }

    public static void tubeForEver(double tubeOne, double tubeTwo) {
        double result = tubeTwo * tubeOne / (tubeTwo + tubeOne);
        System.out.println(result);
    }

}
