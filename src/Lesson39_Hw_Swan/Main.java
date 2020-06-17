package Lesson39_Hw_Swan;

/**
 * TelRanJavaBasicModulOne
 * 16/06/2020  19:39
 */
public class Main {
    public static void main(String[] args) {
        Swan blackSwan = new Swan();
        blackSwan.age = 2;
        blackSwan.breed = "Cygnus atratus ";
        blackSwan.color = "black";
        blackSwan.children = true;

        Swan whiteSwan = new Swan();
        whiteSwan.color = "white";
        whiteSwan.age = 3;
        whiteSwan.breed = "Cygnus olor";//Лебедь шипун
        whiteSwan.children = false;

        System.out.println("Black Swan - " + blackSwan.breed + ("- ") + blackSwan.age + " ears old and likes children its-" + blackSwan.children);
        blackSwan.swims();


        System.out.println("White swan-" + whiteSwan.breed + ("- ") + whiteSwan.age + " ears old and likes children its-" + whiteSwan.children);
        whiteSwan.flies();
        whiteSwan.eats();


    }
}
