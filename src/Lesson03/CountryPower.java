package Lesson03;

public class CountryPower {
    public static void main(String[] args) {
    /* getRelationSquare();
        double a = 207595;
        double b = 603628;
        getRelationSquareTwo(a, b);*/

        double belarusSquare = 207595;
        double ukraineSquare = 603628;
        System.out.println(" naidem sootnoshenie belarusi i ukraini");
        getRelation(belarusSquare, ukraineSquare);

        double moskowSquare = 2511;
        double berlnSquare = 891;
        System.out.println(" naidem sootnoshenie moskvi  i berlina");
        getRelation(belarusSquare, ukraineSquare);

        double pankow = 5066;
        double marzahn = 19500;
        System.out.println(" naidem sootnoshenie pankow i marzahn");
        getRelation(pankow, marzahn);

        final double TWO_ROOMS = 60;
        final double FOR_ROOMS = 90;

        getRelation(TWO_ROOMS, FOR_ROOMS);


    }


    public static void getRelation(double geometricFigureOne, double geometricFigureTwo) {
        double result;
        result = geometricFigureOne / geometricFigureTwo;
        System.out.println(" otvet " + result);


    }

    public static void getRelationSquare() {
        double bel = 207595;
        double ukr = 603628;
        double relation = bel / ukr;
        System.out.println(relation);


    }

}
