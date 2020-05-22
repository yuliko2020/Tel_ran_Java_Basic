package Lesson05;
/**
 * Tel ran first project
 * 27/04/2020  12:36
 */
public class CoffeeMachine {
    public static void main(String[] args) {
        int choose = 2;
        myChoose(choose);
    }
        public static void myChoose ( int choose){
            switch (choose) {
                case 3:
                    latte();
                    break;
                case 2:
                    americano();
                    break;
                case 1:
                    cappucino();
                    break;
                default:
                    americano();
            }
        }
        public static void latte () {
            System.out.println("---");
            System.out.println("We are created latte for you master");
            milk(40);
            coffee(30);
            water(70);
            System.out.println("---");
        }
        public static void cappucino () {
            System.out.println("---");
            System.out.println("We are created cappucino for you master");
            milk(30);
            coffee(40);
            water(20);
            System.out.println("---");

        }
        public static void americano() {
            System.out.println("---");
            System.out.println("We are created americano for you master");
            milk(0);
            coffee(40);
            water(10);
            System.out.println("---");
        }
        public static void water(int ml) {
            System.out.printf("Added %d ml of water \n", ml);
        }

        public static void milk(int ml) {
            System.out.printf("Added %d ml of milk \n", ml);
        }

        public static void coffee(int ml) {
            System.out.printf("Added %d ml of coffee \n", ml);
        }

    }