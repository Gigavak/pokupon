package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pokupon.autotest.globalTestData.RandomEmail;

public class PurchaseWithoutRegistration extends PurchaseShare {

    @FindBy(id = "customer_email")
    private WebElement castomerEmail;

    @FindBy(css = ".login")
    private WebElement isLogined;

    @FindBy(css = "div.payment-opt:nth-child(11)")
    private WebElement paymantTerminal;

    @FindBy(xpath = "/html/body/div[4]/div[2]/div/button")
    private WebElement closeCheckEmailPopup;

    @FindBy (css = ".orders > div:nth-child(1) > h2:nth-child(1)")
    private WebElement checkH2TerminalPaje;

    @FindBy (css = "div.payment-opt:nth-child(12)")
    private WebElement paymantBank;

    @FindBy (css = ".orders > div:nth-child(1) > h2:nth-child(1)")
    private WebElement checkH2BanklPaje;

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

    public WebElement getCastomerEmail() {
        return castomerEmail;
    }

    public void setCastomerEmail(WebElement castomerEmail) {
        this.castomerEmail = castomerEmail;
    }

    public WebElement getIsLogined() {
        return isLogined;
    }

    public void setIsLogined(WebElement isLogined) {
        this.isLogined = isLogined;
    }

    public WebElement getPaymantTerminal() {
        return paymantTerminal;
    }

    public void setPaymantTerminal(WebElement paymantTerminal) {
        this.paymantTerminal = paymantTerminal;
    }

    public WebElement getCloseCheckEmailPopup() {
        return closeCheckEmailPopup;
    }

    public void setCloseCheckEmailPopup(WebElement closeCheckEmailPopup) {
        this.closeCheckEmailPopup = closeCheckEmailPopup;
    }

    public WebElement getCheckH2TerminalPaje() {
        return checkH2TerminalPaje;
    }

    public void setCheckH2TerminalPaje(WebElement checkH2TerminalPaje) {
        this.checkH2TerminalPaje = checkH2TerminalPaje;
    }

    public WebElement getPaymantBank() {
        return paymantBank;
    }

    public void setPaymantBank(WebElement paymantBank) {
        this.paymantBank = paymantBank;
    }

    public WebElement getCheckH2BanklPaje() {
        return checkH2BanklPaje;
    }

    public void setCheckH2BanklPaje(WebElement checkH2BanklPaje) {
        this.checkH2BanklPaje = checkH2BanklPaje;
    }

    public WebDriver driver;
    public PurchaseWithoutRegistration (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void inputEmail(String email){
        castomerEmail.sendKeys(email);
    }

    public void clickPayWithTerminal (){
        paymantTerminal.click();
    }

    public void clickPayWithBank(){
        paymantBank.click();
    }

    public void checkIsLogined(String email){
        String[] emailPart = email.split("@");
        if (isLogined.getText().equals(emailPart[0])){
            System.out.println("User is logined");
            System.out.println(emailPart[0].toString());
        } else {
            System.out.println("Problems with registration");
            System.out.println(emailPart[0].toString());
        }
    }


}
