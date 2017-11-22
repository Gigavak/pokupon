package pokupon.autotest.tests;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pokupon.autotest.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    public static WebDriver driver;
    public static LoginPage loginPage;

    @BeforeClass
    public static void setup() {
//        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
//        driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }

    @Test
    public void addLoginPageTest() {

        loginPage.inputLogin("r.humeniuk@superdeal.com.ua");
        loginPage.inputPassword("afina");
        loginPage.clickLoginButton();
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
    }

    @After
    public void tearDown(){ driver.close();
    }
}
