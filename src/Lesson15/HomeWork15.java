package Lesson15;
/*Мастеру плиточнику Сергею Ивановичу Золотыеруки задают часто один и тот же вопрос.
 Сколько будет стоить положить плитку на определённом участке.
* Нам известно, что в час он кладёт примерно один квадратный метр плитки.
 *Его час стоит 27€ без НДС.
 *Стандартная плитка 30 на 20 сантиметров.

 Сергей Иванович обратился в Телран за помощью и вам надо написать для него программу.
 Которая будет принимать размеры стены/пола, стоимость плитки и выдавать:

 Количество требуемых плиток, как целых, так и тех которые надо будет резать.
 *Учтите, что плитку можно класть как вдоль, так и поперёк и только на месте мастер узнает,
 как именно её надо класть.
 *Стоимость материала
 *Стоимость рабочего времени
 *Итоговую ориентировочную стоимость

The master tiler Sergey Ivanovich Zolotiyruki is often asked the same question.
 How much will it cost to put a tile in a certain area.
* We know that he puts about one square meter of tiles per hour.
 * His hour costs 27 € without VAT.
 * Standard tile 30 by 20 centimeters.

 Sergei Ivanovich turned to Telran for help and you need to write a program for him.
 Which will take the size of the wall / floor, the cost of the tile and give out:

 The number of tiles required, both whole and those that will need to be cut.
 * Please note that tiles can be laid both along and across and only in place the master will know
 how exactly it should be put.
 * Material cost
 * Cost of working time
 * Total estimated cost
*/

import java.sql.SQLOutput;

/**
 * Tel ran first project
 * 13/05/2020  17:59
 */
public class HomeWork15 {
    public static void main(String[] args) {
        double workingHour = 1; //  lays 1m² of tiles per hour
        double workPrice = 27; //  Euro for 1 hour of work
        double tilePrice = 2; // 2 euro per tile
        double tax = 19;
        double tileHeight = 0.30;//   tile side
        double tileWidth = 0.20; //  tile side
        double wallHeight = 3; //  wall height
        double wallWidth = 2.50; //  wall Width
        double floorL = 5;
        double floorW = 3;


        double wallArea = wallSize(wallHeight, wallWidth); //  wall size
        double floorSize = floorArea(floorW, floorL); // floor area
        double tileArea = tileUnit(tileHeight, tileWidth); // 1 плитка - 1 tile
        double tileNumWl = tileNumber(wallArea, tileArea); // tiles per wall
        double tileNumFl = tileNumber(floorSize, tileArea); // tiles per floor
        double tilePr = material(tileNumFl, tileNumWl, tilePrice);
        double workingTime = tilePerHour(floorSize, wallArea, workingHour); // working hours
        double workingPrice = MoneyForWork(workingTime, workPrice);
        double fullPrice = totalMoney(workingPrice, tilePr);
        double taxOne = Vat(fullPrice, tax);

        System.out.println(" Wall area - " + wallArea + " м² ");


        System.out.println(" Floor area  " + floorSize + " м² ");
        System.out.println(" Tile area - " + tileArea + "  м²  ");
        System.out.println(" Number of tiles per wall " + tileNumWl + " pcs.");
        System.out.println(" Number of tiles per floor " + tileNumFl + " pcs.");
        System.out.println(" Price of material for wall and floor - " + tilePr + " euro ");
        System.out.println(" Working hours  " + workingTime);
        System.out.println(" Price for complete work " + workingPrice + " euro ");
        System.out.println(" Total price for work and material " + fullPrice + " euro ");
        System.out.println(" Tax at 19% " + taxOne);
        System.out.println(" Total price for work and material plus 19% VAT " + (fullPrice + taxOne) + " euro ");
    }

    private static double Vat(double fullPrice, double tax) {
        return fullPrice * tax / 100;
    }

    private static double totalMoney(double workingPrice, double tilePr) {
        return workingPrice + tilePr;
    }

    private static double MoneyForWork(double workingTime, double workPrice) {
        return workingTime * workPrice;
    }

    private static double material(double tileNumFl, double tileNumWl, double tilePrice) {
        return (tileNumFl + tileNumWl) * tilePrice;
    }

    private static double tilePerHour(double floorSize, double wallArea, double workingHour) {
        return floorSize + wallArea * workingHour;
    }

    private static double tileNumber(double wallArea, double tileArea) {
        return wallArea / tileArea;
    }

    private static double wallSize(double wallLength, double wallWidth) {
        return wallLength * wallWidth;
    }

    private static double floorArea(double floorW, double floorL) {
        return floorW * floorL;
    }

    public static double tileUnit(double tileHeight, double tileWidth) {

        return tileHeight * tileWidth;
    }


    private static double perimeterArea(double wallWidth, double wallLength) {
        return (wallWidth * 2) + (wallLength * 2);
    }

    private static double workingArea(double perimeterArea, double wallHeight) {
        return perimeterArea * wallHeight;
    }


}















