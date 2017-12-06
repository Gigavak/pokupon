package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseWithoutRegistration extends PurchaseShare {

    @FindBy(id = "customer_email")
    WebElement castomerEmail;

    @FindBy(css = ".login")
    WebElement isLogined;

    @FindBy(css = "div.payment-opt:nth-child(11)")
    WebElement paymantTerminal;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/button")
    WebElement closeCheckEmailPopup;

    @FindBy (css = ".orders > div:nth-child(1) > h2:nth-child(1)")
    WebElement checkH2TerminalPaje;

    @FindBy (css = "div.payment-opt:nth-child(12)")
    WebElement paymantBank;

    @FindBy (css = ".orders > div:nth-child(1) > h2:nth-child(1)")
    WebElement checkH2BanklPaje;

    public PurchaseWithoutRegistration(WebElement mainShare, WebElement multiButtonBuy, WebElement firstButtonInSelect, WebElement simpleButtonBuy, WebElement castomerEmail, WebElement isLogined, WebElement paymantTerminal, WebElement closeCheckEmailPopup, WebElement checkH2TerminalPaje, WebElement paymantBank, WebElement checkH2BanklPaje) {
        super(mainShare, multiButtonBuy, firstButtonInSelect, simpleButtonBuy);
        this.castomerEmail = castomerEmail;
        this.isLogined = isLogined;
        this.paymantTerminal = paymantTerminal;
        this.closeCheckEmailPopup = closeCheckEmailPopup;
        this.checkH2TerminalPaje = checkH2TerminalPaje;
        this.paymantBank = paymantBank;
        this.checkH2BanklPaje = checkH2BanklPaje;
    }
    public PurchaseWithoutRegistration(){
        super();
    }




}
