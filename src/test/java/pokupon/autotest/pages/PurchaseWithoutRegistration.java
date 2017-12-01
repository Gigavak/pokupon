package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseWithoutRegistration {
    public WebDriver driver;

    public PurchaseWithoutRegistration (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/main/section[1]/div/div[2]/div[1]/div[1]/div[4]/div/a/div")
    WebElement mainShare;

}
