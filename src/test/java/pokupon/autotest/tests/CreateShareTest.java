package pokupon.autotest.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pokupon.autotest.pages.CreateShare;

import java.util.concurrent.TimeUnit;

/**
 * Created by gigavat on 22.08.17.
 */
public class CreateShareTest {

    public static WebDriver driver;
    public static CreateShare createShare;

    @BeforeClass
    public static void setup(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        createShare = new CreateShare(driver);
        driver.get("https://pokupon.ua/users/sign_in");
    }
    //login into admin account
    @Test(description="Navigates to the login page")
    public void test1() {
        createShare.inputLogin("r.humeniuk@superdeal.com.ua");
        createShare.inputPassword("afina");
        createShare.clickLoginButton();
        driver.get("https://pokupon.ua/manager");


    }
    //choose share tab and add new share
    @Test(priority = 1)
    public void test2(){
        createShare.clickCertificateButton();
        createShare.clickChooseCertificate();
        createShare.clickAddCertificate();
    }
    //add values into name subtab
    @Test(priority = 2)
    public void test3() {
        createShare.inputNameCertificate("Avtobot");
        createShare.inputNameRuSdCertificate("Avtobot2");
        createShare.inputRuSendCertificate("Avtobot3");
        createShare.inputRuSDSendCertificate("Avtobot4");
        createShare.inputRuSmsCertificate("Avtobot5");
        createShare.inputRuSDSmsCertificate("Avtobot6");
        createShare.inputKeySD("12345678");
    }
    //add values into merchant subtab
    @Test(priority = 3)
    public void test4(){
        createShare.merchantTab();
        createShare.searchMerchant();
    }
    //add values into active subtab
    @Test(priority = 4)
    public void test5() {
        createShare.clickActiveTab();
        createShare.inputCouponStartAt("2017-08-17 00:00:00");
        createShare.inputCouponFinishAt("2017-12-17 00:00:00");
        createShare.clickChooseDraft();
        createShare.clickShowOnWeb();
        createShare.clickShowOnMerchant();
        createShare.clickTurnOnReservation();
        createShare.clickChooseProvider();
        //createShare.clickShowOnFullWeb();
        //createShare.clickShowOnMobile();
        //createShare.clickChooseAllCities();
        createShare.clickChooseCity();
    }

    //add values into category subtab
    @Test(priority = 5)
    public void test6(){
        createShare.clickCategoryTab();
        //createShare.clickCharityRadioButton();
        //createShare.clickCheckCampaign();
        createShare.clickCrumbsCategories();
        createShare.clickRadioCrumbsCategories();
    }

    //add values into share description tab
    @Test(priority = 6)
    public void test7(){
        createShare.clickShareDescriptionTab();
        createShare.clickDescriptionRu();
        createShare.inputDescriptionRu("Avtobot");
        createShare.clickDescriptionRuSD();
        createShare.inputDescriptionRuSD("Avtobot");
        createShare.inputKeywords();
        createShare.inputKeywords("Avtobot");
        createShare.inputTextKeywords();
        createShare.newDesignDescriptionRu();
        createShare.newDesignDescriptionRu("Avtobot");
        createShare.newDesignDescriptionRuSd();
        createShare.newDesignDescriptionRuSd("Avtobot");
        createShare.descriptionServiceRu();
        createShare.descriptionServiceRu("Avtobot");
        createShare.descriptionServiceRuSd();
        createShare.descriptionServiceRuSd("Avtobot");
        createShare.descriptionForMailRu();
        createShare.descriptionForMailRu("Avtobot");
        createShare.descriptionForMailRuSd();
        createShare.descriptionForMailRuSd("Avtobot");
        createShare.descriptionConditionsRu();
        createShare.descriptionConditionsRu("Avtobot");
        createShare.descriptionConditionsRuSd();
        createShare.descriptionConditionsRuSd("Avtobot");
        createShare.descriptionCouponCostIncludedRu();
        createShare.descriptionCouponCostIncludedRu("Avtobot");
        createShare.descriptionCouponCostIncludedRuSd();
        createShare.descriptionCouponCostIncludedRuSd("Avtobot");
        createShare.descriptionCouponAdditionalCostRu();
        createShare.descriptionCouponAdditionalCostRu("Avtobot");
        createShare.descriptionCouponAdditionalCostRuSd();
        createShare.descriptionCouponAdditionalCostRuSd("Avtobot");
        createShare.descriptionCouponHowToUseRu();
        createShare.descriptionCouponHowToUseRu("Avtobot");
        createShare.descriptionCouponHowToUseRuSd();
        createShare.descriptionCouponHowToUseRuSd("Avtobot5000");
        createShare.shortDescriptionRu("Avtobot");
        createShare.shortDescriptionRuSd("Avtobot");
        createShare.descriptionFeatureRu();
        createShare.descriptionFeatureRu("Avtobot");
        createShare.descriptionFeatureRuSd();
        createShare.descriptionFeatureRuSd("Avtobot");
        createShare.descriptionOfferRu();
        createShare.descriptionOfferRu("Avtobot");
        createShare.descriptionOfferRuSd();
        createShare.descriptionOfferRuSd("Avtobot");
        createShare.metaKeywordRu("Avtobot");
        createShare.metaKeywordRuSd("avtobot");
        createShare.metaDescriptionRu("Avtobot");
        createShare.metaDescriptionRuSd("Avtobot");
    }
    @Test(priority = 7)
    public void test8(){
        createShare.costTab();
        createShare.couponPrice();
        createShare.couponPrice("100");
        createShare.couponRevenue();
        createShare.couponRevenue("20");
        createShare.couponFullPrice();
        createShare.couponFullPrice("500");
        createShare.discountPercentage();
        createShare.discountPercentage("10");
        createShare.calculateButton();
    }
    //add values into Tab pictures
    @Test(priority = 8)
    public void test9(){
        createShare.tabPictures();
        createShare.addImage();
        createShare.uploadImageLogo("/home/gigavak/Pictures/images.jpeg");
        createShare.submit();
    }
}

