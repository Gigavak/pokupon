package pokupon.autotest.tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.RandomEmail;
import pokupon.autotest.pages.LoginPage;
import pokupon.autotest.pages.PurchaseWithoutRegistration;
import java.util.concurrent.TimeUnit;

public class PurchaseWithoutRegistrationTest {
    private static final int PAY_TERMINAL = 1;
    private static final int PAY_BANK = 2;


    public static WebDriver driver;
    public static PurchaseWithoutRegistration purchaseWithoutRegistration;
    RandomEmail randomEmail = new RandomEmail();
    public static LoginPage loginPage;


    public void payWithoutRegistrationGeneral (String email, int payMethod){
        purchaseWithoutRegistration.takeMainShare();
        purchaseWithoutRegistration.clickMultiOrSimpleButtonBuy();
        try {
            purchaseWithoutRegistration.clickFirstButtonInSelect();
        } catch (NoSuchElementException e){
        }catch (Exception e){
        }
        purchaseWithoutRegistration.inputEmail(email);
        switch (payMethod){
            case PAY_TERMINAL:
                purchaseWithoutRegistration.clickPayWithTerminal();
                purchaseWithoutRegistration.checkH2TitleTerminalPaje();
            break;
            case PAY_BANK:
                purchaseWithoutRegistration.clickPayWithBank();
                purchaseWithoutRegistration.checkH2TitleBankPaje();
                break;
        }


    }

    @BeforeClass
    public static void setup() {
        DriverFactory.getBrowser("Firefox");
        driver = DriverFactory.driver;
        purchaseWithoutRegistration = new PurchaseWithoutRegistration(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void payWithoutRegistrationTerminal(){
        String email;
        email = randomEmail.randomEmail(randomEmail.SaltString());
        payWithoutRegistrationGeneral(email, 1);
        purchaseWithoutRegistration.checkIsLogined(email);
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
    }

    @Test
    public void payWithoutRegistrationBank(){
        String email;
        email = randomEmail.randomEmail(randomEmail.SaltString());
        payWithoutRegistrationGeneral(email, 2);
        purchaseWithoutRegistration.checkIsLogined(email);
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
    }

    @Test
    public void secondPayWithSameEmail(){
        String email;
        email = randomEmail.getRandomMail();
        payWithoutRegistrationGeneral(email,1);
        purchaseWithoutRegistration.checkIsLogined(email);
        loginPage.clickUserDropdown();
        loginPage.clickSignOut();
        payWithoutRegistrationGeneral(email,1);
        purchaseWithoutRegistration.checkIsNotLogined();



    }




}
