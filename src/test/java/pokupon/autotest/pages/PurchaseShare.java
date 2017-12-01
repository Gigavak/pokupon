package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseShare {


    public PurchaseShare(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(css = ".favorites")
    WebElement mainShare;

    @FindBy(css = "button.deal-buy:nth-child(2)")
    WebElement multiButtonBuy;

    @FindBy (css = ".col-12 > label:nth-child(2) > div:nth-child(3) > a:nth-child(1)")
    WebElement firstButtonInSelect;

    @FindBy (css = "button.yellow:nth-child(4)")
    WebElement simpleButtonBuy;

    public void takeMainShare(){
        mainShare.click();
    }
    public void clickMultiButtonBuy(){
        multiButtonBuy.click();
    }
    public void clickFirstButtonInSelect(){
        firstButtonInSelect.click();
    }
    public void clickSimpleButtonBuy(){
        simpleButtonBuy.click();
    }


}
