package pokupon.autotest.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.globalTestData.RandomEmail;
import pokupon.autotest.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    public static WebDriver driver;
    public static LoginPage loginPage;
    LoginData loginData= new LoginData();
    RandomEmail randomEmail = new RandomEmail();

    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Chrome");

        driver = DriverFactory.driver;

        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }

    @Test
    public void addLoginPageTest() {

        loginPage.inputLogin(randomEmail.getRandomMail());
        loginPage.inputPassword(randomEmail.getSimpleUserPassword());
        loginPage.clickLoginButton();
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
    }

    @AfterClass
    public void tearDown(){ driver.close();
    }
}
