package pokupon.autotest.tests;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    public  WebDriver driver;
    public  LoginPage loginPage;
    LoginData loginData= new LoginData();

    @BeforeClass
    public void setup() {

//        driver = new FirefoxDriver();

        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }

    @Test
    public void addLoginPageTest() {

        loginPage.inputLogin(loginData.getManagerUserName());
        loginPage.inputPassword(loginData.getManagerUserPassword());
        loginPage.clickLoginButton();
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
    }

    @After
    public void tearDown(){ driver.close();
    }
}
