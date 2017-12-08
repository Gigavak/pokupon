package pokupon.autotest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.RandomEmail;
import pokupon.autotest.pages.PurchaseWithoutRegistration;

import java.util.concurrent.TimeUnit;

public class PurchaseWithoutRegistrationTest {

    public static WebDriver driver;
    public static PurchaseWithoutRegistration purchaseWithoutRegistration;
    public RandomEmail randomEmail;


    @BeforeClass
    public static void setup() {
        DriverFactory.getBrowser("Firefox");
        driver = DriverFactory.driver;
        purchaseWithoutRegistration = new PurchaseWithoutRegistration(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua");
    }

    @Test
    public void payWithoutRegistrationTerminal(){
        purchaseWithoutRegistration.takeMainShare();
        purchaseWithoutRegistration.clickMultiOrSimpleButtonBuy();
        purchaseWithoutRegistration.clickFirstButtonInSelect();
        String email = randomEmail.getRandomMail();
        purchaseWithoutRegistration.inputEmail(email);
        purchaseWithoutRegistration.clickPayWithTerminal();
        purchaseWithoutRegistration.checkIsLogined(email);
    }

}
