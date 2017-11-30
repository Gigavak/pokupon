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
    @FindBy(id = "login")
    WebElement mailLogin;

    @FindBy(className = "sbut")
    WebElement submitMailButton;

    @FindBy(xpath = "/html/body/div/div[3]/div[2]/table[2]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/p[5]")
    WebElement getPassword;

    //input values into submit password field
    @FindBy(id = "password")
    WebElement submitPassword;

    @FindBy(id = "popup-sign-in-form-submit")
    WebElement submitContinue;


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

    public void submitMailButton() {
        submitMailButton.submit();
    }

    public void getPassword() {

        password = getPassword.getText().toString();
        System.out.println(password);
        int index = password.indexOf(":");
        password = password.substring(index+1, password.length());
    }

    public String getSavedPassword(){
        return password;
    }

    //input values into submit password field
    public void submitPassword(String pass) {
        submitPassword.sendKeys(password);
    }

    public void submitContinue() {
        submitContinue.submit();
    }



}
