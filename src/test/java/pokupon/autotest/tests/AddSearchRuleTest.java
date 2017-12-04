package pokupon.autotest.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.globalTestData.LoginData;
import pokupon.autotest.pages.AddSearchRule;

import java.util.concurrent.TimeUnit;


public class AddSearchRuleTest {
    public  WebDriver driver;
    public static AddSearchRule addSearchRule;
    LoginData loginData = new LoginData();

    @BeforeClass
    public void setup(){

        DriverFactory.getBrowser("Firefox");
        driver = DriverFactory.driver;

        addSearchRule = new AddSearchRule(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");

    }
    @Test
    public void addSearchRuleTest() {

        addSearchRule.inputLogin(loginData.getManagerUserName());
        addSearchRule.inputPassword(loginData.getManagerUserPassword());
        addSearchRule.clickLoginButton();
        driver.get("https://pokupon.ua/manager");
        addSearchRule.clickChooseButton();
        addSearchRule.clickAddRuleButton();
        addSearchRule.inputKeywordName("Море");
        addSearchRule.clickRadioButtonPN();
        addSearchRule.clickCategoryButton();
        addSearchRule.clickSubmitButton();
    }
    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
