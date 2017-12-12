package pokupon.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CreatePurchaseCoupon {

    public CreatePurchaseCoupon(WebDriver driver) {

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

    @FindBy(linkText = "Промокоды на заказы")
    WebElement purchaseCouponButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[1]/div/div/a")
    WebElement addPurchaseCoupon;

    @FindBy(id = "purchase_coupon_title")
    WebElement couponTitle;

    @FindBy(id = "purchase_coupon_discount")
    WebElement couponDiscount;

    @FindBy(id ="purchase_coupon_start_at")
    WebElement couponStartAt;

    @FindBy(id = "purchase_coupon_finish_at")
    WebElement couponFinishAt;

    @FindBy(id = "purchase_coupon_max_uses_count")
    WebElement couponMaxUses;

    @FindBy(id ="purchase_coupon_min_order_amount")
    WebElement couponMinOrderAmount;

    @FindBy(id ="purchase_coupon_max_uses_count_per_user")
    WebElement couponMaxUsesCountPerUser;

    //if need use coupon discount without percents
    @FindBy(id ="purchase_coupon_discount_in_percents")
    WebElement couponPriceWithoutPercent;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div[3]/table/tbody/tr[1]/td[6]/div")
    WebElement editCoupon;

    @FindBy(id = "purchase_coupon_for_multiple_codes_autogeneration")
    WebElement couponAutoGenerationCheckBox;

    @FindBy(id = "purchase_coupon_generate_count")
    WebElement couponAutoGenerateCount;

    @FindBy(id = "generate_purchase_coupons_btn")
    WebElement clickGenerateButton;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/form/div[2]/div[10]/div[2]/table/tbody/tr/td[1]")
    WebElement couponCode;


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
        purchaseCouponButton.click();
    }
    public void addPurchaseCoupon(){addPurchaseCoupon.click();}
    public void couponTitle(String title){
        couponTitle.sendKeys(title);
    }
    public void couponDiscount(String discount){
        couponDiscount.sendKeys(discount);
    }
    public void couponStartAt(String startAt){
        couponStartAt.sendKeys(startAt);
    }
    public void couponFinishAt(String finishAt){couponFinishAt.sendKeys(finishAt);}
    public void couponMaxUses(String maxUses){
        couponMaxUses.sendKeys(maxUses);
    }
    public void couponMinOrderAmount(String minOrder){
        couponMinOrderAmount.sendKeys(minOrder);
    }
    public void couponMaxUsesCountPerUser(String maxUsesPerUser){
        couponMaxUsesCountPerUser.sendKeys(maxUsesPerUser);
    }
    public void checkAllCheckbox(){
        List<WebElement> allCheckbox = driver.findElements(By
                .xpath("//input[@type='checkbox']"));

        for (WebElement ele : allCheckbox) {

            if (!ele.isSelected()) {

                ele.click();

            }
        }
    }

    //if need use coupon discount without percents
//    public void couponPriceWithoutPercent(){couponPriceWithoutPercent.click();}

    public void submitButton(){
        submitButton.submit();
    }
    public void editCoupon(){editCoupon.click();}
    public void couponAutoGenerationcheckBox(){
        couponAutoGenerationCheckBox.click();
    }
    public void couponAutoGenerateCount(String autoCount){
        couponAutoGenerateCount.sendKeys(autoCount);
    }
    public void clickGenerateButton(){
        clickGenerateButton.click();
    }
    public void couponCode(){
       String purchaseCode = couponCode.getText().toString();
       System.out.println("Код промокода: " + purchaseCode);

    }
}
