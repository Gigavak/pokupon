package someTests;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by gigavat on 23.08.17.
 */
public class GetCookie {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(GetCookie.class);
        WebDriver driver = new FirefoxDriver();
        driver.get("http://pokupon.ua");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Size of cookies :"+cookies.size());

        for (Cookie cookie:cookies){
          System.out.println(cookie.getName()+": "+cookie.getValue());
        }
    }
}
