package Lesson21;

/**
 * Tel ran first project
 * 22/05/2020  12:29
 */
public class Password {
    public static void main(String[] args) {
        System.out.println(pwdGenerate(21));
        System.out.println(pwdGenerate(5));
        System.out.println(pwdGenerate(10));
        System.out.println(pwdGenerate(15));

    }

    private static String pwdGenerate(int passwordLenght) {
        String myPassword = "";
        //if (пароль не содержит цифр,пароль уже минимум половина минимальной длины
        // в которой цифра должна содержаться {то сгенерируй одну цифру}
        if (checkNumberinPassword(myPassword, passwordLenght)) {

        }
        for (int i = 0; i < passwordLenght-1; i++) {
            if (i % 20 == 0) {
                myPassword = generateLatinSymbol() + myPassword;
            } else if (i % 2 == 0) {
                myPassword += generateLatinSymbol().toLowerCase();
            } else myPassword += generateDigitsSymbol().toUpperCase();


        }
        generateDigitsSymbol();
        return myPassword;
    }

    private static boolean checkNumberinPassword(String passwordIsNow, int mustHaveLengthPassword) {
        int numberPercent = 10;

        if (passwordIsNow.length() < numberPercent && !passwordIsNow.contains("1")) ;

        return false;
    }

    private static String generateDigitsSymbol() {

        String myDigit = "";
        int temp = (int) (Math.random() * 9);
        myDigit = String.valueOf(temp);
        return myDigit;

    }

    private static String generateLatinSymbol() {
        char myLatinChar;
        myLatinChar = (char) (Math.random() * (90 - 65) + 65);
        return "" + myLatinChar;

    }

}
