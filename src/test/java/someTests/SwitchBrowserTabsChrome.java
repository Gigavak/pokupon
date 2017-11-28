package someTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class SwitchBrowserTabsChrome {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://pokupon.ua");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("http://superdeal.ua");
        driver.switchTo().window(tabs.get(0));


    }
}
