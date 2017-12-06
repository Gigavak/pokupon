package someTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pokupon.autotest.globalTestData.DriverFactory;

import java.util.concurrent.TimeUnit;

//Не работает

public class TestJSExecutor {
    public static void main (String[] args){
        DriverFactory.getBrowser("Chrome");
        WebDriver driver = DriverFactory.driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua");
        JavascriptExecutor js;
        if (driver instanceof JavascriptExecutor){
            js = (JavascriptExecutor)driver;
//            ((JavascriptExecutor)driver).executeScript("WebElement a = driver.findElement(By.xpath(\"/html/body/main/section[1]/div/div[2]/div[1]/div[1]\")); a.click");
        } else {
            throw new IllegalStateException("This driver does not support JavaScript!");
        }
        js.executeScript("return document.evaluate('/html/body/main/section[1]/div/div[2]/div[1]/div[1]', document.body, null, XPathResult.ANY_TYPE, null)[0].click()");
//        WebElement a = driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/div[1]/div[1]"));
//        a.click();
        driver.close();


    }
}
