package pokupon.autotest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.pages.PurchaseShare;

import java.util.concurrent.TimeUnit;

public class PurchaseShareTest {
    public static WebDriver driver;
    public static PurchaseShare purchaseShare;

    @BeforeTest
    public static void setup(){
        DriverFactory.getBrowser("Firefox");
        driver = DriverFactory.driver;
        purchaseShare = new PurchaseShare(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua");
    }

    @Test
    public void clickSomething(){

        purchaseShare.takeMainShare();
        purchaseShare.clickMultiButtonBuy();
        purchaseShare.clickFirstButtonInSelect();
    }
}
