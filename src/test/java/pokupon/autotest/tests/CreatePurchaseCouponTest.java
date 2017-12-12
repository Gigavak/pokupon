package pokupon.autotest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.globalTestData.RandomEmail;
import pokupon.autotest.pages.CreatePurchaseCoupon;

import java.util.concurrent.TimeUnit;

public class CreatePurchaseCouponTest {

    public static WebDriver driver;
    public static CreatePurchaseCoupon createPurchaseCoupon;
    LoginData loginData = new LoginData();
    RandomEmail randomEmail =new RandomEmail();

    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Firefox");
        driver = DriverFactory.driver;

        createPurchaseCoupon = new CreatePurchaseCoupon(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }

    @Test(priority = 0)
    public void addPurchaseCoupon() {

        createPurchaseCoupon.inputLogin(loginData.getManagerUserName());
        createPurchaseCoupon.inputPassword(loginData.getManagerUserPassword());
        createPurchaseCoupon.clickLoginButton();
        driver.get("https://pokupon.ua/manager");
        createPurchaseCoupon.clickChooseButton();
        createPurchaseCoupon.addPurchaseCoupon();
        createPurchaseCoupon.couponTitle(randomEmail.getSaltString());
        createPurchaseCoupon.couponDiscount("20");
        createPurchaseCoupon.couponStartAt("2017-12-11 00:00:00");
        createPurchaseCoupon.couponFinishAt("2018-02-28 00:00:00");
        createPurchaseCoupon.couponMaxUses("1000");
        createPurchaseCoupon.couponMinOrderAmount("50");
        createPurchaseCoupon.couponMaxUsesCountPerUser("10");
        createPurchaseCoupon.checkAllCheckbox();
//        createPurchaseCoupon.couponPriceWithoutPercent();
        createPurchaseCoupon.submitButton();

    }
    @Test(priority = 1)
    public void addAutoGeneration(){
        createPurchaseCoupon.editCoupon();
        createPurchaseCoupon.couponAutoGenerationcheckBox();
        createPurchaseCoupon.couponAutoGenerateCount("1");
        createPurchaseCoupon.clickGenerateButton();
        createPurchaseCoupon.couponCode();
        createPurchaseCoupon.submitButton();
    }
}
