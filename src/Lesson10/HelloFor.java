package Lesson10;

/**
 * Tel ran first project
 * 05/05/2020  11:42
 * // i++ можно записать как i = i+1
 * int a = 0;
 * a + +;
 * a = 0 + 1 ;
 * a + = 1 ;
 * system out println( a );
 */
public class HelloFor {
    public static void main(String[] args) {
        fabricForWekk();

    }

    public static void fabricForWekk() {
        int weekDays = 7;
        for (int i = 1; i < weekDays; i++) {

            System.out.println("День" + i);
            System.out.println("-------");
            System.out.println("Новый день ");
            System.out.println("Я встаю в шесть утра ");
            System.out.println("Иду на завод ");
            System.out.println("Заканчиваю работу ");
            System.out.println("Возвращаюсь");
            System.out.println("Я уже дома ");
            System.out.println("Курю с соседом");
            System.out.println("Иду спать ");
            System.out.println("День подошёл к концу ");
            System.out.println("--------- ");
        }


    }

    public static void fabric() {

        boolean morning = true;
        boolean evening = true;

        if (morning) {
            // idem na zavod
        } else if (evening) {
            // vozvrat domoi
        }

    }

}
