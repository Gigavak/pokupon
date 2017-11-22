package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {

    public AuthorizationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;


    @FindBy(id = "user_email")
    WebElement userEmail;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(id = "user_email")
    WebElement invalidEmail;

    @FindBy(id = "user_email")
    WebElement emptyEmail;

    @FindBy(id = "user_email")
    WebElement clearEmail;

    @FindBy(id = "user_password")
    WebElement clearPassword;

    @FindBy(xpath = ".//*[@id='popup-sign-in-form-submit']")
    WebElement loginButton;




    public void inputEmail(String login){
        userEmail.sendKeys(login);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void inputInvalidEmail(String login){
        invalidEmail.sendKeys(login);
    }
    public void inputEmptyEmail(String login){emptyEmail.sendKeys(login);}
    public void clearEmailField(){clearEmail.clear();}
    public void clearPasswordField(){clearPassword.clear();}
}
