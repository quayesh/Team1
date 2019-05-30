package testFacebookPackage;

import base.CommonAPI;
import facebookPackage.AccountSecurity;
import facebookPackage.Places;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccountSecurity extends CommonAPI {
    AccountSecurity security;

    @BeforeMethod
    public void inti() {
        security = PageFactory.initElements(driver, AccountSecurity.class);
    }

    @Test
    public void clickAccountSecurity() {
        security.clickAccountSecurity();

    }

    @Test
    public void clickCreateAccount() {
        security.clickCreateAccount();

    }

    @Test
    public void clickFriending() {
        security.clickFriending();

    }

    @Test
    public void clickOnHomePage() {
        security.clickOnHomePage();

    }

    @Test
    public void messaging() {
        security.messagingButton();

    }

    @Test
    public void storiesButton() {
        security.storiesButton();

    }
    @Test
    public void photoTab() {
        security.photoTab();

    }


}