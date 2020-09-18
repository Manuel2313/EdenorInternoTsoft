package helper;

import java.util.Random;

public class Email {

    private static final String EMAIL = "pruebadeqa03";
    private static final String EMAIL_HOST = "@gmail.com";

    public static String getNewEmail(){
        Random rad = new Random();
        String newEmail = EMAIL + "-" + rad.nextInt(100) + EMAIL_HOST;
        return newEmail;
    }


}
