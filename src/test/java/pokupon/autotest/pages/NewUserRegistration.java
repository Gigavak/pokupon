package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserRegistration {
    public  NewUserRegistration(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    private String password;

    @FindBy(id = "user_email")
    WebElement userEmail;

    @FindBy(id = "popup-register-form-submit")
    WebElement submitButton;

    //input values into mail
    @FindBy(id ="id-1")
    WebElement mailLogin;

    @FindBy(id ="id-2")
    WebElement mailPassword;

    @FindBy(xpath = "/html/body/div/div/main/form/button")
    WebElement submitMailButton;

    @FindBy(className = "msglist__row_href")
    WebElement someMail;


    @FindBy(className = "readmsg__subject")
    WebElement getPassword;



    public void userEmail(String login){
        userEmail.sendKeys(login);
    }

    public void submitButton() {
        submitButton.click();
    }

    //input values into mail

    public void mailLogin(String mailLoginField) {
        mailLogin.sendKeys(mailLoginField);
    }

    public void mailPassword(String mailPass) {
        mailPassword.sendKeys(mailPass);
    }

    public void submitMailButton() {
        submitMailButton.submit();
    }

    public void someMail() {
        someMail.click();
    }

    public void getPassword() {
        password = getPassword.getText().toString();
    }

    public String getSavedPassword(){
        return password;
    }


}
