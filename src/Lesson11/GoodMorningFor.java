package Lesson11;

/**
 * Tel ran first project
 * 06/05/2020  09:36
 */
public class GoodMorningFor {
    public static void main(String[] args) {
        introductionToLoopFor();

    }
    /*
		for (начало; условие; шаг) {
		  // ... тело цикла ... в котором можно выполнять одну, две, три или даже очень много операций.
		}
		for (initialization condition; testing condition; increment/decrement){
			statement(s)
		}
		 */
    //Область видимости по английски Scope

    public static void introductionToLoopFor() {
        int a;
        a=1;
        int apple;
        int pineapple;
        int mandarine = 10;

        for (int i = 1; i < 10; i++) {
            a++;
            int b = 10;
            // System.out.println("Переменная а в ревом цикле  " + a);
            //System.out.println("итератор первого цикла  " + i);
            //System.out.println("Просто б  " + b);
        }
        for (int i = 1; i < 20; i++) {
            a++;
            int b = 20;
        }

        System.out.println("Переменная а в первом цикле a :" + a);

        for (int i = 100; i > 0; i--) {
           // System.out.println("Количество оставшихся мандаринок  :" + i);

        }

    }

}
