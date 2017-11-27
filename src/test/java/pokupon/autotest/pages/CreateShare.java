package pokupon.autotest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by gigavat on 22.08.17.
 */
public class CreateShare  {
    public CreateShare(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public WebDriver driver;

//авторизация на сайте под админ пользователем

    @FindBy(id = "user_email")
    WebElement loginField;

    @FindBy(id = "user_password")
    WebElement passwordField;

    @FindBy(xpath = ".//*[@id='popup-sign-in-form-submit']")
    WebElement loginButton;

//создать новую акцию

    @FindBy(linkText = "Акции")
    WebElement certificateButton;

    @FindBy(linkText = "Управление акциями (Акции)")
    WebElement clickChoose;

    @FindBy(linkText = "Добавить акцию")
    WebElement addCertificate;

//вкладка Название

    @FindBy(id = "campaign_translations_attributes_ru_title")
    WebElement nameRuCertificate;

    @FindBy(id = "campaign_translations_attributes_ru-sd_title")
    WebElement nameRuSdCertificate;

    @FindBy(id = "campaign_translations_attributes_ru_middle_title")
    WebElement nameRuSendCertificate;

    @FindBy(id = "campaign_translations_attributes_ru-sd_middle_title")
    WebElement nameRuSDSendCertificate;

    @FindBy(id = "campaign_translations_attributes_ru_short_title")
    WebElement nameRuSmsCertificate;

    @FindBy(id = "campaign_translations_attributes_ru-sd_short_title")
    WebElement nameRuSDSmsCertificate;

    @FindBy(id = "campaign_sd_key")
    WebElement keySD;

    //вкладка Поставщик
    @FindBy(linkText = "Поставщик")
    WebElement merchantTab;

    @FindBy(id = "s2id3")
    WebElement searchMerchant;


//вкладка Активна

    @FindBy(linkText = "Активна")
    WebElement activeTab;

    @FindBy(id = "campaign_start_at")
    WebElement couponDateStartAt;

    @FindBy(id = "campaign_finish_at")
    WebElement couponDateFinishAt;

    @FindBy(id= "campaign_draft_false")
    WebElement chooseDraft;

    @FindBy(id = "campaign_visible_true")
    WebElement chooseShowOnWeb;

    @FindBy(id ="campaign_merchant_only_false")  //when need to use yes id = "campaign_merchant_only_true"
    WebElement showOnMerchant;

    @FindBy(id ="campaign_turn_on_reservation")
    WebElement turnOnReservation;

    @FindBy(id ="campaign_providers_ids_1") // when need to use SD provider id = "campaign_providers_ids_2"
    WebElement chooseProvider;


    //@FindBy(id = "campaign_visible_to_web") // default value = true
    //WebElement showOnFullWeb;

    //@FindBy(id = "campaign_visible_to_mobile_applications") // default value = true
    //WebElement showOnMobile;

    //@FindBy(id = "cities_all") // if need to choose all sities
    //WebElement chooseAllCities;

    @FindBy(id = "campaign_cities_ids_1") //another cities id = campaign_cities_ids_1-44
    WebElement chooseCity;

//вкладка Категории

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/ul/li[4]/a")
    WebElement categoryTab;


//    @FindBy(id = "campaign_charity_true") //default value id = campaign_charity_false
//    WebElement chooseCharity;

//    @FindBy(id ="campaign_main_display") //default value checked
//    WebElement checkCampaign;

    @FindBy(css = "#tab-categories > div:nth-child(4) > div:nth-child(1) > fieldset:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(40) > ul:nth-child(2) > li:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > label:nth-child(1) > input:nth-child(2)")
    WebElement chooseCrumbsCategories;

    @FindBy(id = "PN_1955")
    WebElement chooseRadioCrumbsCategories;

//вкладка Описание

    @FindBy(linkText = "Описание")
    WebElement chooseShareDescriptionTab;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru_description")
    WebElement clickDescriptionRu;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru_description")
    WebElement inputDescriptionRu;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru-sd_description")
    WebElement clickDescriptionRuSD;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru-sd_description")
    WebElement inputDescriptionRuSD;

    @FindBy(id ="s2id4")
    WebElement inputKeywords;

    @FindBy(className = "select2-result-label")
    WebElement inputTextKeywords;

    @FindBy(id ="_campaign_translations_attributes_ru_new_description_ifr")
    WebElement newDesignDescriptionRu;

    @FindBy(id ="_campaign_translations_attributes_ru-sd_new_description_ifr")
    WebElement newDesignDescriptionRuSd;

    @FindBy(id = "_campaign_translations_attributes_ru_service_description_ifr")
    WebElement descriptionServiceRu;

    @FindBy(id = "_campaign_translations_attributes_ru-sd_service_description_ifr")
    WebElement descriptionServiceRuSd;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru_description_for_mail")
    WebElement descriptionForMailRu;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru-sd_description_for_mail")
    WebElement descriptionForMailRuSd;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru_terms")
    WebElement descriptionConditionsRu;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru-sd_terms")
    WebElement descriptionConditionsRuSd;

    @FindBy(id = "campaign_translations_attributes_ru_coupon_cost_included_ifr")
    WebElement descriptionCouponCostIncludedRu;

    @FindBy(id = "campaign_translations_attributes_ru-sd_coupon_cost_included_ifr")
    WebElement descriptionCouponCostIncludedRuSd;

    @FindBy(id = "campaign_translations_attributes_ru_coupon_additional_charges_ifr")
    WebElement descriptionCouponAdditionalCostRu;

    @FindBy(id ="campaign_translations_attributes_ru-sd_coupon_additional_charges_ifr")
    WebElement descriptionCouponAdditionalCostRuSd;

    @FindBy(id = "_campaign_translations_attributes_ru_coupon_how_to_use_certificate_correctly_ifr")
    WebElement descriptionCouponHowToUseRu;

    @FindBy(id = "_campaign_translations_attributes_ru-sd_coupon_how_to_use_certificate_correctly_ifr")
    WebElement descriptionCouponHowToUseRuSd;

    @FindBy(id = "campaign_translations_attributes_ru_short_description_for_engine")
    WebElement shortDescriptionRu;

    @FindBy(id = "campaign_translations_attributes_ru-sd_short_description_for_engine")
    WebElement shortDescriptionRuSd;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru_feature")
    WebElement descriptionFeatureRu;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru-sd_feature")
    WebElement descriptionFeatureRuSd;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru_offer")
    WebElement descriptionOfferRu;

    @FindBy(id = "cke_contents_campaign_translations_attributes_ru-sd_offer")
    WebElement descriptionOfferRuSd;

    @FindBy(id = "campaign_translations_attributes_ru_meta_keywords_string")
    WebElement metaKeywordRu;

    @FindBy(id = "campaign_translations_attributes_ru-sd_meta_keywords_string")
    WebElement metaKeywordRuSd;

    @FindBy(id = "campaign_translations_attributes_ru_meta_description")
    WebElement metaDescriptionRu;

    @FindBy(id = "campaign_translations_attributes_ru-sd_meta_description")
    WebElement metaDescriptionRuSd;

    //вкладка стоимость
    @FindBy(linkText = "Стоимость")
    WebElement costTab;

    @FindBy(id = "campaign_coupon_price")
    WebElement couponPrice;

    @FindBy(id = "campaign_revenue_amount")
    WebElement couponRevenue;

    @FindBy(id = "campaign_full_price")
    WebElement couponFullPrice;

    @FindBy(id = "campaign_discount_percentage")
    WebElement discountPercentage;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div[2]/form/div[2]/div/div[6]/fieldset/div[1]/div[2]/button")
    WebElement calculateButton;

    //таб картинки
    @FindBy(linkText = "Картинки")
    WebElement tabPictures;

    @FindBy(id = "add_image_link")
    WebElement addImage;

    @FindBy(id = "campaign_logo")
    WebElement uploadImageLogo;

    @FindBy(id ="submit_form")
    WebElement submit;

    //авторизация админ пользователя
    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }
    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void clickLoginButton() {
        loginButton.click();
    }

    //создание акции
    public void clickCertificateButton() {
        certificateButton.click();
    }
    public void clickChooseCertificate() {
        clickChoose.click();
    }
    public void clickAddCertificate() {
        addCertificate.click();
    }

// добавление данных в текстовые поля в таб Название
    public void inputNameCertificate(String nameRu) {
        nameRuCertificate.sendKeys(nameRu);
    }
    public void inputNameRuSdCertificate(String nameRuSd) {
        nameRuSdCertificate.sendKeys(nameRuSd);
    }
    public void inputRuSendCertificate(String nameRuSend) {
        nameRuSendCertificate.sendKeys(nameRuSend);
    }
    public void inputRuSDSendCertificate(String nameRuSD) {
        nameRuSDSendCertificate.sendKeys(nameRuSD);
    }
    public void inputRuSmsCertificate(String nameRuSms) {
        nameRuSmsCertificate.sendKeys(nameRuSms);
    }
    public void inputRuSDSmsCertificate(String nameRuSDSms) {
        nameRuSDSmsCertificate.sendKeys(nameRuSDSms);
    }
    public void inputKeySD(String nameKeySD) {
        keySD.sendKeys(nameKeySD);
    }

    //добавление данных в таб Поставщик
    public void merchantTab(){merchantTab.click();}
    public void searchMerchant(){searchMerchant.click();}


//переход и добавление данных в таб Активна
    public void clickActiveTab() {
        activeTab.click();
    }
    public void inputCouponStartAt(String start) {
        couponDateStartAt.sendKeys(start);
    }
    public void inputCouponFinishAt(String finish) {
        couponDateFinishAt.sendKeys(finish);
    }
    public void clickChooseDraft(){
        chooseDraft.click(); }
    public void clickShowOnWeb() {
        chooseShowOnWeb.click();
    }
    public void clickShowOnMerchant(){
        showOnMerchant.click();
    }
    public void clickTurnOnReservation(){
        turnOnReservation.click();
    }
    public void clickChooseProvider(){
        chooseProvider.click();
    }
    //public void clickShowOnFullWeb(){showOnFullWeb.click();}
    //public void clickShowOnMobile(){showOnMobile.click();}
    //public void clickChooseAllCities(){chooseAllCities.click();}
    public void clickChooseCity(){chooseCity.click();}

//переход и добавление данных в таб Категории
    public void clickCategoryTab(){categoryTab.click();}
    //public void clickCharityRadioButton(){chooseCharity.click();}
    //public void clickCheckCampaign(){checkCampaign.click();}
    public void clickCrumbsCategories(){chooseCrumbsCategories.click();}
    public void clickRadioCrumbsCategories(){chooseRadioCrumbsCategories.click();}

//переход и добавление данных в таб Описание
    public void clickShareDescriptionTab(){chooseShareDescriptionTab.click();}
    public void clickDescriptionRu(){clickDescriptionRu.click();}
    public void inputDescriptionRu(String ru){inputDescriptionRu.sendKeys(ru);}
    public void clickDescriptionRuSD(){clickDescriptionRuSD.click();}
    public void inputDescriptionRuSD(String ruSd){inputDescriptionRuSD.sendKeys(ruSd);}
    public void inputKeywords(){inputKeywords.click();}
    public void inputKeywords(String keywords){inputKeywords.sendKeys(keywords);}
    public void inputTextKeywords(){inputTextKeywords.click();}
    public void newDesignDescriptionRu(){newDesignDescriptionRu.click();}
    public void newDesignDescriptionRu(String descriptionRu){newDesignDescriptionRu.sendKeys(descriptionRu);}
    public void newDesignDescriptionRuSd(){newDesignDescriptionRuSd.click();}
    public void newDesignDescriptionRuSd(String descriptionRuSd){newDesignDescriptionRuSd.sendKeys(descriptionRuSd);}
    public void descriptionServiceRu(){descriptionServiceRu.click();}
    public void descriptionServiceRu(String serviceRu){descriptionServiceRu.sendKeys(serviceRu);}
    public void descriptionServiceRuSd(){descriptionServiceRuSd.click();}
    public void descriptionServiceRuSd(String serviceRuSd){descriptionServiceRuSd.sendKeys(serviceRuSd);}
    public void descriptionForMailRu(){descriptionForMailRu.click();}
    public void descriptionForMailRu(String descriptionMail){descriptionForMailRu.sendKeys(descriptionMail);}
    public void descriptionForMailRuSd(){descriptionForMailRuSd.click();}
    public void descriptionForMailRuSd(String descriptionMailRuSd){descriptionForMailRuSd.sendKeys(descriptionMailRuSd);}
    public void descriptionConditionsRu(){descriptionConditionsRu.click();}
    public void descriptionConditionsRu(String conditionsRu){descriptionConditionsRu.sendKeys(conditionsRu);}
    public void descriptionConditionsRuSd(){descriptionServiceRuSd.click();}
    public void descriptionConditionsRuSd(String conditionsRuSd){descriptionConditionsRuSd.sendKeys(conditionsRuSd);}
    public void descriptionCouponCostIncludedRu(){descriptionCouponCostIncludedRu.click();}
    public void descriptionCouponCostIncludedRu(String costRu){descriptionCouponCostIncludedRu.sendKeys(costRu);}
    public void descriptionCouponCostIncludedRuSd(){descriptionCouponCostIncludedRuSd.click();}
    public void descriptionCouponCostIncludedRuSd(String costRuSd){descriptionCouponCostIncludedRuSd.sendKeys(costRuSd);}
    public void descriptionCouponAdditionalCostRu(){descriptionCouponAdditionalCostRu.click();}
    public void descriptionCouponAdditionalCostRu(String additionalCostRu){descriptionCouponAdditionalCostRu.sendKeys(additionalCostRu);}
    public void descriptionCouponAdditionalCostRuSd(){descriptionCouponAdditionalCostRuSd.click();}
    public void descriptionCouponAdditionalCostRuSd(String additionalCostRuSd){descriptionCouponAdditionalCostRuSd.sendKeys(additionalCostRuSd);}
    public void descriptionCouponHowToUseRu(){descriptionCouponHowToUseRu.click();}
    public void descriptionCouponHowToUseRu(String couponUseRu){descriptionCouponHowToUseRu.sendKeys(couponUseRu);}
    public void descriptionCouponHowToUseRuSd(){descriptionCouponCostIncludedRu.click();}
    public void descriptionCouponHowToUseRuSd(String couponUseRuSd){descriptionCouponHowToUseRuSd.sendKeys(couponUseRuSd);}
    public void shortDescriptionRu(String shortRu){shortDescriptionRu.sendKeys(shortRu);}
    public void shortDescriptionRuSd(String shortRuSd){shortDescriptionRuSd.sendKeys(shortRuSd);}
    public void descriptionFeatureRu(){descriptionFeatureRu.click();}
    public void descriptionFeatureRu(String featureRu){descriptionFeatureRu.sendKeys(featureRu);}
    public void descriptionFeatureRuSd(){descriptionFeatureRuSd.click();}
    public void descriptionFeatureRuSd(String featureRuSd){descriptionFeatureRuSd.sendKeys(featureRuSd);}
    public void descriptionOfferRu(){descriptionOfferRu.click();}
    public void descriptionOfferRu(String offerRu){descriptionOfferRu.sendKeys(offerRu);}
    public void descriptionOfferRuSd(){descriptionOfferRuSd.click();}
    public void descriptionOfferRuSd(String offerRuSd){descriptionOfferRuSd.sendKeys(offerRuSd);}
    public void metaKeywordRu(String keywordRu){metaKeywordRu.sendKeys(keywordRu);}
    public void metaKeywordRuSd(String keywordRuSd){metaKeywordRuSd.sendKeys(keywordRuSd);}
    public void metaDescriptionRu(String descriptionRu){metaDescriptionRu.sendKeys(descriptionRu);}
    public void metaDescriptionRuSd(String descriptionRuSd){metaDescriptionRuSd.sendKeys(descriptionRuSd);}

    //переход и добавление данных в таб Описание
    public void costTab(){costTab.click();}
    public void couponPrice(){couponPrice.clear();}
    public void couponPrice(String price){couponPrice.sendKeys(price);}
    public void couponRevenue(){couponRevenue.clear();}
    public void couponRevenue(String revenue){couponRevenue.sendKeys(revenue);}
    public void couponFullPrice(){couponFullPrice.clear();}
    public void couponFullPrice(String fullPrice){couponFullPrice.sendKeys(fullPrice);}
    public void discountPercentage(){discountPercentage.clear();}
    public void discountPercentage(String percentage){discountPercentage.sendKeys(percentage);}
    public void calculateButton(){calculateButton.click();}

    //переход и добавление данных в таб Картинки
    public void tabPictures(){tabPictures.click();}
    public void addImage(){addImage.click();}
    public void uploadImageLogo(String value){uploadImageLogo.sendKeys(value);}
    public void submit(){submit.click();}


}