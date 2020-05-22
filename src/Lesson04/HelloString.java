package Lesson04;

public class HelloString {
    public static void main(String[] args) {
        // stringRelation();
        //upperCase();
       // goodMorningString();
       // oldDatabase();
        getArticle();

    }

    public static void stringRelation() {
        String firstName = " Andrey";
        String lastName = "Podlubnyj";
        String emailAdresse = "andron13@gmail.com";
        int old = 18;
        // System.out.println("Welcome to our site : " + firstName + " " + lastName);

        String user = firstName + "" + lastName;
        int lengthDisplay = user.length();
        //System.out.println(" Dlina stroki" + lengthDisplay);


        firstName = firstName.substring(2);
        System.out.println(firstName);
    }

    public static void upperCase() {

        String text = "iy iz lesu vishel,bil silnii moroz \n fgködflgk";
        text = text.toUpperCase();
        System.out.println(text);

        String text2 = " oni lgut";
        text2 = text2.toLowerCase();
        System.out.println(text2);

    }

    public static void getArticle() {

        String articleTitle = "london is the capital";
        articleTitle = articleTitle.substring(0, 1).toUpperCase() + articleTitle.substring(1).toLowerCase();

        System.out.println(articleTitle);

        articleTitle = articleTitle.toUpperCase();
        System.out.println(articleTitle);

        System.out.println(articleTitle.toLowerCase());

    }

    public static void oldDatabase() {
        String number = "10";
        int result = Integer.parseInt(number);
        result = result + 1;
        result++;
        System.out.println(result);
    }

    public static void goodMorningString() {
        String firstName = "Петя";
        String lastName = "Васечкин";
        char copyright = '\u00A9';
        char copyrightTwo = '©';
        String copyrightStr = "©";
        String space = " ";
        System.out.println(firstName + space + lastName + space + copyright + " ");
    }

}