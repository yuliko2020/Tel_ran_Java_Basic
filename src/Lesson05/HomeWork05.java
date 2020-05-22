package Lesson05;

/**
 * Tel ran first project
 * 27/04/2020  12:06
 */
public class HomeWork05 {
    public static void main(String[] args) {
        // ((7 + 8) * 5 > 7 + 8 * 5)
        // ((7 + 8) * 4 != 7 + 4 * 5)
        // (3 + 4 > 9 + 1 & 16 - 5 > 3 * 4)
        // false & true | false ^ true;
        //  16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5
        //!(3 * 4 < 7 + 8)
        seasonsYear();

        boolean a = (7 + 8) * 5 > 7 + 8 * 5; // true
        boolean b = ((7 + 8) * 4 != 7 + 4 * 5); // true
        boolean c = (3 + 4 > 9 + 1 & 16 - 5 > 3 * 4); // false
        boolean d = false & true | false ^ true; // true
        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;  //  true
        boolean f = !(3 * 4 < 7 + 8); //false



        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f );

    }

    public static void seasonsYear() {
        int month = 2;
        String seasonyear;
        switch (month) {
            case 1:
                seasonyear = " ";
                break;
            case 2:
                seasonyear = " Winter ";
                break;
            case 3:
                seasonyear = "Sprint";
                break;
            case 4:
                seasonyear = "";
                break;
            case 5:
                seasonyear = " ";
                break;
            case 6:
                seasonyear = " Summer";
                break;
            case 7:
                seasonyear = " ";
                break;
            case 8:
                seasonyear = " ";
                break;
            case 9:
                seasonyear = " Autumn ";
                break;
            case 10:
                seasonyear = " ";
                break;
            case 11:
                seasonyear = "";
                break;
            case 12:
                seasonyear = " ";
                break;
            default:
                seasonyear = " Invalid month ";
                break;
        }
        System.out.println( " Season of the year :" + seasonyear);

    }


}
