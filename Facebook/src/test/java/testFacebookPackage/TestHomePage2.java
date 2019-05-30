package testFacebookPackage;

import base.CommonAPI;
import facebookPackage.HomePage2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage2 extends CommonAPI{
    HomePage2 homePage2;
    @BeforeMethod
    public  void init() {
        homePage2 = PageFactory.initElements(driver,HomePage2.class);


    }

   //  @Test(priority = 1)
    public void setEmailBoxTest(){
        homePage2.setEmailBox();
    }
    //@Test
    public void setPasswordTest(){
        homePage2.setPassword();

    }
    @Test
    public void applyXpathTest(){
        clickByXpath("//*[@id=\"js_0\"]/ul/li[16]/a");

    }


}
