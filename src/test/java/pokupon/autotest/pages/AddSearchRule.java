package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by gigavat on 23.08.17.
 */
public class AddSearchRule {
    public AddSearchRule(WebDriver driver) {

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

    @FindBy(linkText = "Правила поиска")
    WebElement searchButton;

    @FindBy(linkText = "Добавить правило")
    WebElement clickAddRule;

    @FindBy(id = "search_condition_keyword_keyword")
    WebElement addKeyword;

    @FindBy(id = "search_condition_keyword_provider_pn")
    WebElement radioButtonPN;

    @FindBy(xpath = "//*[@id=\"categories_ids_\"]")
    WebElement chooseCategory;

    @FindBy(id = "submit_form")
    WebElement submitButton;


    public void inputLogin(String login){
        loginField.sendKeys(login);
    }
    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
    public void clickChooseButton(){
        searchButton.click();
    }
    public void clickAddRuleButton(){
        clickAddRule.click();
    }
    public void inputKeywordName(String keyword){
        addKeyword.sendKeys(keyword);
    }
    public void clickRadioButtonPN(){
        radioButtonPN.click();
    }
    public void clickCategoryButton(){
        chooseCategory.click();
    }
    public void clickSubmitButton(){
        submitButton.click();
    }

}
