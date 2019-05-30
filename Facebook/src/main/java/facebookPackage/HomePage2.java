package facebookPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePage2 extends CommonAPI {
    @FindBy(id = "email")
    WebElement emailBox;
    @FindBy(name = "pass")
    WebElement password;
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement clickLogIn;

    public void setEmailBox() {
        emailBox.sendKeys("abm");


    }

    public void setPassword() {
        password.sendKeys("1234");
        sleepFor(3);

    }

    public void clickLogIn() {
        clickLogIn.click();
    }

}



