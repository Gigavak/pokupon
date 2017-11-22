package someTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirefoxSwitchTabs {
    public static void main(String[] args) {
        String URL="http://www.google.com";
        DesiredCapabilities dc = DesiredCapabilities.firefox();
        dc.setCapability("marionette", true);
        WebDriver driver =  new FirefoxDriver(dc);
        driver.get(URL);
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com/');");
    }
}
