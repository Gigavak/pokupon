package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserBonus {

    public AddUserBonus(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(id = "user_email")
    WebElement userEmail;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(xpath = ".//*[@id='popup-sign-in-form-submit']")
    WebElement loginButton;

    @FindBy(id = "q")
    WebElement inputSearch;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/form/div[5]/input")
    WebElement clickSearchSubmit;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[3]/table/tbody/tr[2]/td[10]/div/a[2]")
    WebElement editUserProfile;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div/ul/li[3]/a")
    WebElement userBalance;

    @FindBy(id = "bonus_amount")
    WebElement sumBonusAmount;

    @FindBy(id = "bonus_note")
    WebElement bonusNote;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/form/input")
    WebElement addBonuses;

    //remove bonuses
    @FindBy(css = ".reduce_bonus")
    WebElement removeUserBonuses;

    @FindBy(id = "reduce_bonus_amount")
    WebElement reduceBonuses;

    @FindBy(id = "reduce_bonus_note")
    WebElement reduceNote;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/form/input")
    WebElement clickRemoveSubmitButton;


    public void inputEmail(String login){
        userEmail.sendKeys(login);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

    public void inputSearch(String userName){
        inputSearch.sendKeys(userName);
    }
    public void clickSearchSubmit(){
        clickSearchSubmit.submit();
    }
    public void editUserProfile(){
        editUserProfile.click();
    }
    public void userBalance(){
        userBalance.click();
    }
    public void sumBonusAmount(String sum){
        sumBonusAmount.sendKeys(sum);
    }
    public void bonusNote(String note){
        bonusNote.sendKeys(note);
    }
    public void addBonuses(){
        addBonuses.click();
    }
    //remove bonuses
    public void removeUserBonuses(){
        removeUserBonuses.click();
    }
    public void reduceBonuses(String reduce){
        reduceBonuses.sendKeys(reduce);
    }
    public void reduceNote(String note){
        reduceNote.sendKeys(note);
    }
    public void removeSubmit(){
        clickRemoveSubmitButton.submit();
    }
}
