package pokupon.autotest.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.pages.AuthorizationPage;

import java.util.concurrent.TimeUnit;

public class InvalidAuthorizationPageTest {

    public static WebDriver driver;
    public static AuthorizationPage authorizationPage;

    @BeforeClass
    public static void setup() {
       //driver = new FirefoxDriver();
        driver = new ChromeDriver();

        authorizationPage = new AuthorizationPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }
    @Test
    public void test1() {
        //All invalid tests for user authorization

        authorizationPage.inputEmail("abc@gmail.com");
        authorizationPage.inputPassword("12312");
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 1)
            public void test2() {
        authorizationPage.inputInvalidEmail("wrew");
        authorizationPage.inputPassword("12342");
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 2)
            public void test3() {
        authorizationPage.clearEmailField();
        authorizationPage.inputEmptyEmail("");
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 3)
            public void test4() {
        authorizationPage.clearPasswordField();
        authorizationPage.inputEmail("abc@gmail.com");
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 4)
            public void test5(){
        authorizationPage.clearEmailField();
        authorizationPage.clickLoginButton();
    }


}
