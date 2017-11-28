package someTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextCopyPaste {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://pokupon.ua");

        String mytext = driver.findElement(By.xpath("/html/body/footer/section[1]/div/div/div[4]/a[1]")).getText();
        driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys(mytext);
    }
}
