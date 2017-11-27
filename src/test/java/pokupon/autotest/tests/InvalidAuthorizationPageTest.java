package pokupon.autotest.tests;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.pages.AuthorizationPage;

import java.util.concurrent.TimeUnit;

import static pokupon.autotest.globalTestData.DriverFactory.driver;

public class InvalidAuthorizationPageTest {

    //public static WebDriver driver;
    public static AuthorizationPage authorizationPage;
    LoginData loginInput = new LoginData();


    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Chrome");

        driver = DriverFactory.driver;

        authorizationPage = new AuthorizationPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }
    @Test
    public void test1() {
//        All invalid tests for user authorization

        authorizationPage.inputEmail(loginInput.getInvalidUserName());
        authorizationPage.inputPassword(loginInput.getInvalidUserPassword());
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 1)
            public void test2() {
        authorizationPage.clearEmailField();
        authorizationPage.inputInvalidEmail("wrew");
        authorizationPage.inputPassword(loginInput.getInvalidUserPassword());
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 2)
            public void test3() {
        authorizationPage.clearEmailField();
        authorizationPage.clearPasswordField();
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 3)
            public void test4() {
        authorizationPage.inputEmail(loginInput.getInvalidUserName());
        authorizationPage.clickLoginButton();
    }
    @Test(priority = 4)
            public void test5(){
        authorizationPage.clearEmailField();
        authorizationPage.inputPassword(loginInput.getInvalidUserPassword());
        authorizationPage.clickLoginButton();
    }


}
