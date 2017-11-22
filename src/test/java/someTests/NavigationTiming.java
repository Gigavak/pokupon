package someTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

public class NavigationTiming {
    @Test
    public void testLogin() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://pokupon.ua");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Получаем время Load Event End (окончание загрузки страниы)
        long loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd;");
        // Получаем Navigation Event Start (начало перехода)
        long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart;");
        // Разница между Load Event End и Navigation Event Start - это время загрузки страницы
        System.out.println("Page Load Time is " + (loadEventEnd - navigationStart)/1000 + " seconds.");
    }

}
