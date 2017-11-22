package pokupon.autotest.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pokupon.autotest.pages.ForgetPasswordPage;

import java.util.concurrent.TimeUnit;

public class ForgetPasswordTest {

    public static WebDriver driver;
    public static ForgetPasswordPage forgetPasswordPage;


    @BeforeClass
    public static void setup() {
//        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
//        driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        forgetPasswordPage = new ForgetPasswordPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
        System.out.println("All tests started");
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test
    public void sendForgetPassword(){


        try {
            forgetPasswordPage.clickForgetPasswordButton();
        }catch (Exception e){
            System.out.println("Xpath clickForgetPasswordButton not found");
        }

        try {
            forgetPasswordPage.inputUserEmail("gigavak@ukr.net");
        }catch (InvalidSelectorException e){
            System.out.println("Css selector inputUserEmail not found");
        }

        try {
            forgetPasswordPage.clickSendButton();
        }catch (Exception e){
            System.out.println("Xpath clickSendButton not found");
        }

    }


}
