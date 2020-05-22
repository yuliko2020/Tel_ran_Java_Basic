package Lesson07;

/**
 * Tel ran first project
 * 29/04/2020  20:47
 * При движении до 50 км / час нарушений нет;
 * для вождения от 50 км / час до 65 км / час устного осуждения и лекции в течение 5 минут;
 * за превышение скорости от 16 км / ч - штраф в размере 40 евро;
 * за поездку от 100 км / ч до 130 км / ч - штраф в размере 500 евро;
 * а за проезд более 130 км / ч - штраф в размере 1000 евро, лишение прав на 3 года и конфискация транспортного средства.
 */

public class HomeWork07 {
    public static void main(String[] args) {
        int speed = 50;
        getSpeed(65);
        getSpeed(66);// должно быть 16 км/ч , не могу понять как нужно ввести данные
        getSpeed(100);
        getSpeed(130);
        getSpeed(speed);

        int color = 1;
        trafficLights(color);
    }

    public static void getSpeed(int speed) {
        if (speed <= 50) {
            System.out.println(" Если водитель едет со скоростью " + speed + " то нарушений нет ");
        } else if (speed <= 65) {
            System.out.println(" Если водитель едет со скоростью от 50 - " + speed + " км/ч: час устного осуждения и лекции в течение 5 минут ");
        } else if (speed <= 66) {
            System.out.println(" За вождение от " + speed + "км/ч:- штраф в размере 40 евро  ");
        } else if (speed <= 100) {
            System.out.println(" за превышение скорости от " + speed + "км/ч:-  штраф в размере 500 евро");
        } else if (speed <= 130) {
            System.out.println(" за превышение скорости от " + speed + "км/ч более штраф в размере 1000 евро, " +
                    "лишение прав на 3 года и конфискация транспортного средства  ");
        }

    }

    public static void trafficLights(int color) {
        String colorString;
        switch (color) {
            case 1:
                colorString = "  red -  you must Stop ";
                break;
            case 2:
                colorString = "yellow - you should Stop ";
                break;
            case 3:
                colorString = "green - you can drive ";
                break;
            default:
                colorString = " Invalid  ";
                break;
        }
        System.out.println("Attention traffic light is" + colorString);
    }
}