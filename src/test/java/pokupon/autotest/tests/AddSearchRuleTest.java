package pokupon.autotest.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.globalTestData.DriverFactory;
import pokupon.autotest.pages.AddSearchRule;

import java.util.concurrent.TimeUnit;


public class AddSearchRuleTest {
    public  WebDriver driver;
    public  AddSearchRule addSearchRule;

    @BeforeClass
    public void setup(){

        DriverFactory.getBrowser("Chrome");

        driver = DriverFactory.driver;


        addSearchRule = new AddSearchRule(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");

    }
    @Test
    public void addSearchRuleTest() {

        addSearchRule.inputLogin("");
        addSearchRule.inputPassword("");
        addSearchRule.clickLoginButton();
        driver.get("https://pokupon.ua/manager");
        addSearchRule.clickChooseButton();
        addSearchRule.clickAddRuleButton();
        addSearchRule.inputKeywordName("Море");
        addSearchRule.clickRadioButtonPN();
        addSearchRule.clickCategoryButton();
        //addSearchRule.clickSubmitButton();
    }
//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
