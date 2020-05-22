package Lesson06;

/**
 * Tel ran first project
 * 27/04/2020  12:52
 */
public class
HelloSwitch {
    public static void main(String[] args) {
         int osenkachetverty = 5;
      System.out.println(crimeAndPunishment( osenkachetverty ));

        //int seasonYear = 4;
        System.out.println();


    }


    public static void seasons(int month) {

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
                seasonyear = " Invalid month";
                break;
        }
        System.out.println(seasonyear);

    }

    public static String crimeAndPunishment(int rating) {

        String tribute;
        switch (rating) {
            case 5:
                tribute = " bicycle";
                break;
            case 4:
                tribute = "Actionn Cam GoPro5";
                break;
            case 3:
                tribute = " Nagradi ne budet,ne zaslujil";
                break;
            case 2:
                tribute = "poteryanii chas ";
                break;
            case 1:
                tribute = " poznakomimsya s remnom";
                break;
            default:
                tribute = " takoy osenki net ";
                break;


        }
        return tribute;
    }
}