package someTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {

    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.get("https://pokupon.ua/kiev/new_year");


        WebElement From = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div/div/a[1]"));
        WebElement To = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div/div/a[2]"));
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder.clickAndHold(From)
                .moveToElement(To)
                .release(To)
                .build();
        dragAndDrop.perform();

    }
}
kvlokjvg