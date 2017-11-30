package someTests;

import java.util.Random;

public class RandomEmail {
    private static String randomEmail;

    public RandomEmail(String randomEmail) {
        this.randomEmail = randomEmail;
    }

    public String getRandomEmail() {
        return randomEmail;
    }

    public void setRandomEmail(String randomEmail) {
        this.randomEmail = randomEmail;
    }
    public static String ramdom(){
        String alphabet = "";
        int N = 10;
        Random r = new Random();
        for (int i = 0; i<N; i++){
            System.out.print(alphabet.charAt(r.nextInt(N)));
        }
        return alphabet;
    }
}
