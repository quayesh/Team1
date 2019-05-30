package facebookPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends CommonAPI {
    @FindBy(name = "firstname")
    WebElement FN;
    @FindBy(name="lastname")
    WebElement LN;

    public void setFirstName(){

        FN.sendKeys("abm");
    }
    public void setLastName(){
        LN.sendKeys("Qua");
    }
}
