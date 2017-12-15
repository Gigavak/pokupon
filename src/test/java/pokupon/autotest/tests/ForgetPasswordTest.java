package pokupon.autotest.tests;


import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.pages.ForgetPasswordPage;

import java.util.concurrent.TimeUnit;

public class ForgetPasswordTest {

    public static WebDriver driver;
    public static ForgetPasswordPage forgetPasswordPage;


    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Chrome");

        driver = DriverFactory.driver;

        forgetPasswordPage = new ForgetPasswordPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
        System.out.println("All tests started");
        System.out.println("Page title is: " + driver.getTitle());
    }

    @Test(enabled = false)
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
