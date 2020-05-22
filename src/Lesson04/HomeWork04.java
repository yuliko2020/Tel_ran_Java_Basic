package Lesson04;



/**
 * Tel ran first project
 * 25/04/2020  19:13
 */
public class HomeWork04 {
    public static void main(String[] args) {
        findChar();
        personalData();
        upperCase();
    }

    public static void findChar() {
        char question = '\u003F';
        char frenchFranc = '\u20A3';
        char at = '\u0040';
        char smileOne = '\u263A';
        char smileTwo = '\u0024';
        char mobilePhone = '\u1F4F';
        char numberSign = '\u0023';

        System.out.println(question);
        System.out.println(frenchFranc);
        System.out.println(at);
        System.out.println(smileOne);
        System.out.println(smileTwo);
        System.out.println(mobilePhone);
        System.out.println(numberSign);

    }

    public static void personalData() {
        String firstName = "Yuliia";
        String lastName = "Scicluna";
        String homeCity = " Odessa ";
        String homeAdress = "Deribasovskaya ";
        String phoneNumber = " 0123456789";
        String space = " ";

        String firstName1 = "Yuliia";
        String business = "'student programmer'";

        System.out.println(firstName1 + " - " + business);


        System.out.println("Welcome: " + firstName + space + lastName);
        System.out.println("City: " + homeCity);
        System.out.println("Adress: " + homeAdress);
        System.out.println("Phone number: " + phoneNumber);


    }

    public static void upperCase() {
        String text = "Caution no entry ";
        String magic = " Entrance allowed";
        text = text.toUpperCase();
        System.out.println(text);

        String magicSubstring = magic.substring(3);
        //System.out.println(magicSubstring);

        magicSubstring = magic.substring(1, 8);
        System.out.print(magicSubstring);
        System.out.print(" forbidden");


    }


}
