package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

public class TestLogin {

    @Test(groups = {"login.email"})
    public void loginByEmailTest() {
        String loginEmail = "ihprishchepa@gmail.com";
        String loginPassword = "ihprishchepa123";
        WebDriverManager.chromedriver().setup();
        new HomePage(new ChromeDriver())
                .openRozetka()
                .clickOnUserButton()
                .enterEmail(loginEmail)
                .enterPassword(loginPassword)
                .clickOnLoginButton();
    }

    @Test(groups = {"login.phone"})
    public void loginByPhoneTest() {
        String loginPhone = "0958721327";
        String loginPassword = "ihprishchepa123";
        WebDriverManager.chromedriver().setup();
        new HomePage(new ChromeDriver())
                .openRozetka()
                .clickOnUserButton()
                .enterPhone(loginPhone)
                .enterPassword(loginPassword)
                .clickOnLoginButton();
    }

    @Test(groups = {"login.facebook"})
    public void loginByFacebookTest() {
        WebDriverManager.chromedriver().setup();
        new HomePage(new ChromeDriver())
                .openRozetka()
                .clickOnUserButton()
                .clickOnFacebookButton();
    }

    @AfterMethod
    public void closeBrowser() {
        BasePage.setDown();
    }
}
