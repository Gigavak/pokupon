package someTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchBrowserTabsChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pokupon.ua");

        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");


        driver.get("http://www.gmail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1)); //switches to new tab
//        driver.get("https://superdeal.ua");
//
//        driver.switchTo().window(tabs.get(0)); // switch back to main screen
//        driver.get("https://pokupon.ua/users/sign_up");
    }
}
