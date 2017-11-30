package pokupon.autotest.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.pages.NewUserRegistration;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class NewUserRegistrationTest {
    public static WebDriver driver;
    public static NewUserRegistration newUserRegistration;
    LoginData loginData= new LoginData();


    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Chrome");

        driver = DriverFactory.driver;

        newUserRegistration = new NewUserRegistration(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_up");
    }
    @Test(priority = 1)
    public void addNewUser(){

        newUserRegistration.userEmail(loginData.getNewUserRegistrationName());
        newUserRegistration.submitButton();

    }
    @Test(priority = 2)
    public void newTabMailAgent(){
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://www.yopmail.com/ru/");

        newUserRegistration.mailLogin(loginData.getNewUserMailLogin());
        newUserRegistration.mailPassword(loginData.getNewUserMailPassword());
        newUserRegistration.submitMailButton();
        newUserRegistration.someMail();
        newUserRegistration.getPassword();
    }

    @Test(priority = 3)
    public void backTab(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        newUserRegistration.submitPassword(newUserRegistration.getSavedPassword());
        newUserRegistration.submitContinue();

    }
}
