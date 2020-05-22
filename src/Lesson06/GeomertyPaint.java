package Lesson06;

/**
 * Tel ran first project
 * 28/04/2020  11:27
 * Школа приняла на работу молодую учительницу геометрии. И первым делом она решила привести кабинет точных наук в порядок.
 * В подвале школы были найдены:
 * точная копия спутника земли ПС-1. Диаметр сферы 58см.
 * жестяной куб со стороной 40см.
 * правильная четырёхугольная пирамида "Хеопса" со стороной основания 20см и боковыми рёбрами 30см
 * и чёрный ящик с размерами 80см30см20см Всё было в достаточно запущенном состоянии и новая учительница решила всё покрасить в красный цвет.
 * Сколько денег на покраску нужно потратить если на один квадратный метр надо 60мл краски, а балончик с аэрозольной краской 400мл стоит 7€.
 */
public class GeomertyPaint {
    public static void main(String[] args) {
        double side = 0.4; // в метрах
        double diameter = 0.58; // в метрах
        double base = 0.2; //
        double sidePyramid = 0.3;
        double boxL = 0.8;
        double boxW = 0.2;
        double boxH = 0.3;
        double paintConsumptionForMeter = 0.06; // литры на один метр
        double priceBalon = 7.00; // евро за балончик
        double volumeBalon = 0.4;

        double aCube = areaCube(side);
        double aSputnik = areaSputnik(diameter);
        double aPyramid = areaPyramid(base, sidePyramid);
        double aBox = areaBox(boxL, boxH, boxW);
        double aSum = sumAreas(aCube, aPyramid, aBox, aSputnik);

        double allPaintForAllSquare = paintFlowCalculation(aSum, paintConsumptionForMeter);
        double literPrice = paymentForLiter(priceBalon, volumeBalon);
        double paintCost = amount(literPrice, allPaintForAllSquare);
        int sprayingResult = sprayingQuantity(allPaintForAllSquare, volumeBalon);

        System.out.println(aCube);
        System.out.println(aSputnik);
        System.out.println(aPyramid);
        System.out.println(aBox);
        System.out.println("Если площадь всех фигур равна " + aSum +
                " метров, а расход краски " + paintConsumptionForMeter +
                " за один метр, то расход краски: " + allPaintForAllSquare
        );
        System.out.println("Стоимость литра краски в евро: " + literPrice);
        System.out.println("Краска как бы стоит, если не считать, что надо купить балон " + paintCost + "€");
        System.out.println("Итого, балонов: " + sprayingResult +
                " Директору нужно выдать столько денег на покраску: " + priceBalon * sprayingResult);
    }

    public static double paymentForLiter(double priceBalon, double volumeBalon) {
        // рассчитываем цену литра краски
        // для этого цену за балончик делим на его объём
        return priceBalon / volumeBalon;
    }

    public static double amount(double priceForLiter, double paintFlow) {
        // рассчитывается стоимость краски, которая нужна на покраску поверхностей
        // количество краски умножить на её стоимость
        return priceForLiter * paintFlow;
    }

    public static double areaCube(double side) {
        return Math.pow(side, 2) * 6;
    }

    public static double areaSputnik(double diameter) {
        final double PI = 3.14;
        return Math.pow(diameter / 2, 2) * 4 * PI;
    }

    public static double areaPyramid(double base, double side) {
        double hight = Math.sqrt(side * side - base * base / 4);
        double areaTriangle = base * hight / 2.0;
        double areaBasePyramid = Math.pow(base, 2);
        return areaBasePyramid + 4 * areaTriangle;
    }

    public static double areaBox(double w, double h, double l) {
        return 2 * (w * h + h * l + l * w);
    }

    public static double sumAreas(double sputnik, double pyramid, double cube, double box) {
        return sputnik + pyramid + cube + box;
    }

    public static double paintFlowCalculation(double square, double paintConsumption) {
        // считаем расход краски на все поверхности
        // принимаем метры и литры на метр
        // умножаем площадь в метрах square на расход краски на один квадратный метр
        return square * paintConsumption;
    }

    public static int sprayingQuantity(double paintQantity, double sprayingVolume) {
        // чтобы узнать количество балончиков
        // нам нужно количество краски поделить на вместимость балончика
        return (int) Math.ceil(paintQantity / sprayingVolume);
    }
}
