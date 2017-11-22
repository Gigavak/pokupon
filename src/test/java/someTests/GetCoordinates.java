package someTests;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCoordinates {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://pokupon.ua/kiev/new_year");

        WebElement element = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[2]/div/div/a[1]"));

        Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
        System.out.println(xcord+ ", "+ycord);
    }

}
