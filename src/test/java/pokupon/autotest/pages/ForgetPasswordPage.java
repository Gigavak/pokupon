package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPasswordPage {



    public ForgetPasswordPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;


    @FindBy(xpath = "/html/body/main/section/div/div/form[1]/div[2]/button")
    WebElement forgetPasswordButton;

    @FindBy(css =".devise > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > label:nth-child(4) > input:nth-child(2)")
    WebElement userEmail;

    @FindBy(xpath = "//*[@id=\"popup-remind-form-submit\"]p")
    WebElement sendButton;




    public void clickForgetPasswordButton(){forgetPasswordButton.click();}
    public void inputUserEmail(String email){userEmail.sendKeys(email);}
    public void clickSendButton(){sendButton.click();}
}
