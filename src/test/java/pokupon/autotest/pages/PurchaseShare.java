package pokupon.autotest.pages;

import org.apache.maven.plugins.annotations.Execute;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class PurchaseShare {

    @FindBy(xpath = "/html/body/main/section[1]/div/div[2]/div[1]/div[1]")
//    @FindBy(xpath = "/html/body/main/section[2]/div/div[2]/div/div[1]/div[2]")
    WebElement mainShare;

    @FindBy(css = "button.deal-buy:nth-child(2)")
    WebElement multiButtonBuy;

    @FindBy (css = ".col-12 > label:nth-child(2) > div:nth-child(3) > a:nth-child(1)")
    WebElement firstButtonInSelect;

    @FindBy (css = "button.yellow:nth-child(4)")
    WebElement simpleButtonBuy;

    public PurchaseShare(WebElement mainShare, WebElement multiButtonBuy, WebElement firstButtonInSelect, WebElement simpleButtonBuy) {
        this.mainShare = mainShare;
        this.multiButtonBuy = multiButtonBuy;
        this.firstButtonInSelect = firstButtonInSelect;
        this.simpleButtonBuy = simpleButtonBuy;
    }
    public PurchaseShare(){
        super();
    }
    public WebDriver driver;
    public PurchaseShare(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void takeMainShare(){
        mainShare.click();
    }
    public void clickMultiOrSimpleButtonBuy(){
        try {
            if(multiButtonBuy.getSize()!=null){
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                    multiButtonBuy.click();
        } catch (NoSuchElementException e){
            simpleButtonBuy.click();
        }

    }
    public void clickMultiButtonBuy(){
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        multiButtonBuy.click();


    }
    public void clickFirstButtonInSelect(){
         firstButtonInSelect.click();
    }
    public void clickSimpleButtonBuy(){
        simpleButtonBuy.click();
    }


}
