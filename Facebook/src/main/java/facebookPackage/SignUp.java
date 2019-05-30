package facebookPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends CommonAPI {
    @FindBy(name = "firstname")
    WebElement FN;
    @FindBy(name = "lastname")
    WebElement LN;
    @FindBy(name = "reg_email__")
    WebElement MN;
    @FindBy(name = "reg_passwd__")
    WebElement NP;

    public void setFirstName() {

        FN.sendKeys("abm");
    }

    public void setLastName() {

        LN.sendKeys("Qua");
    }

    public void setMobileNumber() {
        MN.sendKeys("123456789");

    }

    public void createNewPassword() {
        NP.sendKeys("hello");
    }
}
