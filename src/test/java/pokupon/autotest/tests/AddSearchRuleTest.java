package pokupon.autotest.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pokupon.autotest.pages.AddSearchRule;

import java.util.concurrent.TimeUnit;


public class AddSearchRuleTest {
    public static WebDriver driver;
    public static AddSearchRule addSearchRule;

    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        driver = new FirefoxDriver();
        addSearchRule = new AddSearchRule(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/users/sign_in");
        //driver.get("https://pokupon.ua/");

    }
    @Test
    public void addSearchRuleTest() {

        addSearchRule.inputLogin("r.humeniuk@superdeal.com.ua");
        addSearchRule.inputPassword("afina");
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
