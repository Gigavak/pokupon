package someTests;

import java.util.Random;

public class RandomEmail {
    public static void main(String[] args) {
        System.out.println(randomEmail(getSaltString()));

    }


    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static String randomEmail(String random){
        String randomEm = random + "@yopmail.com";
        return randomEm;
     }
}
