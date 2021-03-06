package pokupon.autotest.globalTestData;

import java.util.Random;

public class RandomEmail extends LoginData {
    private String randomMail = randomEmail(SaltString());

    public RandomEmail(String managerUserName, String managerUserPassword, String simpleUserName, String simpleUserPassword, String invalidUserName, String invalidUserPassword, String newUserMailPassword, String randomMail) {
        super(managerUserName, managerUserPassword, simpleUserName, simpleUserPassword, invalidUserName, invalidUserPassword,newUserMailPassword);
        this.randomMail = randomMail;
    }
    public RandomEmail (){
        super();
    }

    public String getRandomMail() {
        return randomMail;
    }

    public void setRandomMail(String randomMail) {
        this.randomMail = randomMail;
    }

    public String SaltString() {
        String SALTCHARS = "abcdefghijklmnoprstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public String randomEmail(String random){
        String randomEm = random + "@yopmail.com";
        return randomEm;
    }

}
