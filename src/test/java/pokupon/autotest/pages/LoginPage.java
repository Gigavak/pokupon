package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){

        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id = "user_email")
    WebElement loginField;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(xpath = ".//*[@id='popup-sign-in-form-submit']")
    WebElement loginButton;

    @FindBy(css = ".login")
    WebElement userDropdown;

    @FindBy(css = ".user-menu > a:nth-child(6)")
    WebElement userSignOut;

    public void inputLogin(String login){
        loginField.sendKeys(login);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void clickUserDropdown(){userDropdown.click();}
    public void clickSignOut(){userSignOut.click();}
}
