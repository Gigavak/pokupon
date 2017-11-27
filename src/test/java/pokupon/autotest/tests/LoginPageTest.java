package pokupon.autotest.tests;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    public static WebDriver driver;
    public static LoginPage loginPage;
    LoginData loginData= new LoginData();

    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Chrome");

        driver = DriverFactory.driver;

        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }

    @Test
    public void addLoginPageTest() {

        loginPage.inputLogin(loginData.getSimpleUserName());
        loginPage.inputPassword(loginData.getSimpleUserPassword());
        loginPage.clickLoginButton();
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
    }

    @After
    public void tearDown(){ driver.close();
    }
}
