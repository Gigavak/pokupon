package someTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectTest {


    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://pokupon.ua/kiev/new_year");


        Select select = new Select(driver.findElement(By.id("station_id")));
        select.selectByVisibleText("Дорогожичи (1)");



    }
}
