package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class=\"header__button ng-star-inserted\"]")
    private WebElement userButton;

    @FindBy(id = "auth_email")
    private WebElement loginEmail;

    @FindBy(id = "auth_pass")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@class=\"button button--large button--green auth-modal__submit ng-star-inserted\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//button[@class=\"button button--large button--gray button--with-icon auth-modal__social-button auth-modal__social-button_type_facebook\"]")
    private WebElement facebookButton;

    public HomePage openRozetka() {
        driver.get("https://rozetka.com.ua/");
        return this;
    }

    public HomePage clickOnUserButton(){
        userButton.click();
        return this;
    }

    public HomePage enterEmail(String email){
        loginEmail.clear();
        loginEmail.sendKeys(email);
        loginEmail.submit();
        return this;
    }

    public HomePage enterPassword(String password){
        loginPassword.clear();
        loginPassword.sendKeys(password);
        loginPassword.submit();
        return this;
    }

    public HomePage clickOnLoginButton(){
        softAssert.assertEquals(loginButton.getText(),"Войти");
        softAssert.assertAll();
        loginButton.click();
        return this;
    }

    public HomePage enterPhone(String phone){
        loginEmail.clear();
        loginEmail.sendKeys(phone);
        loginEmail.submit();
        return this;
    }

    public HomePage clickOnFacebookButton(){
        softAssert.assertEquals(facebookButton.getText(),"Facebook");
        softAssert.assertAll();
        facebookButton.click();
        return this;
    }

}
