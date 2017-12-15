package pokupon.autotest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.RandomEmail;
import pokupon.autotest.pages.NewUserRegistration;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class NewUserRegistrationTest {
    public static WebDriver driver;
    public static NewUserRegistration newUserRegistration;
    RandomEmail randomEmail =new RandomEmail();


    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Firefox");

        driver = DriverFactory.driver;

        newUserRegistration = new NewUserRegistration(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_up");
    }
    @Test(priority = 1)
    public void addNewUser(){

        newUserRegistration.userEmail(randomEmail.getRandomMail());
        newUserRegistration.submitButton();

    }
    @Test(priority = 2)
    public void newTabMailAgent(){
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://www.yopmail.com/ru/");

        newUserRegistration.mailLogin(randomEmail.getRandomMail());
        newUserRegistration.submitMailButton();
        newUserRegistration.driver.switchTo().frame(driver.findElement(By.id("ifmail")));
        newUserRegistration.getPassword();
    }

    @Test(priority = 3)
    public void backTab(){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        newUserRegistration.submitPassword(newUserRegistration.getSavedPassword());
        newUserRegistration.submitContinue();

    }
    @AfterClass
    public void tearDown(){ driver.quit();
    }
}
