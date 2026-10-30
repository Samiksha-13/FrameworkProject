package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseTestClass;

public class TC02_LoginTest extends BaseTestClass {

    @Test
    public void verify_login(){

        logger.info("**Starting test case**");

        HomePage hp = new HomePage(driver);
        hp.clickMyaccount();
        hp.clickLogin();

        LoginPage lp = new LoginPage(driver);
        lp.setEmail(p.getProperty("email"));
        lp.setPass(p.getProperty("pass"));
        lp.clickButton();

        logger.info("**Finished test case**");
    }
}
