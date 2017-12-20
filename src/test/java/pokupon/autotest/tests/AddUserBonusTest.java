package pokupon.autotest.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.pages.AddUserBonus;

import java.util.concurrent.TimeUnit;

import static pokupon.autotest.globalTestData.DriverFactory.driver;

public class AddUserBonusTest {

    public static AddUserBonus addUserBonus;
    LoginData loginInput = new LoginData();

    @BeforeClass
    public static void setup() {

        DriverFactory.getBrowser("Firefox");

        driver = DriverFactory.driver;

        addUserBonus = new AddUserBonus(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
    }
    @Test(priority = 0)
    public void test1(){
        addUserBonus.inputEmail(loginInput.getManagerUserName());
        addUserBonus.inputPassword(loginInput.getManagerUserPassword());
        addUserBonus.clickLoginButton();
        driver.get("https://pokupon.ua/manager");
    }
    @Test(priority = 1)
    public void addBonuses(){
        addUserBonus.inputSearch("r.humeniuk");

        addUserBonus.clickSearchSubmit();
        try{
            Thread.sleep(300);
        addUserBonus.editUserProfile();}
        catch (Exception e){System.out.println(e);}
        addUserBonus.userBalance();
        addUserBonus.sumBonusAmount("1000");
        addUserBonus.bonusNote("test");
        addUserBonus.addBonuses();
    }
    @Test(priority = 2)
    public void removeBonuses(){
        addUserBonus.removeUserBonuses();
        addUserBonus.reduceBonuses("1000");
        addUserBonus.reduceNote("test");
        addUserBonus.removeSubmit();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
