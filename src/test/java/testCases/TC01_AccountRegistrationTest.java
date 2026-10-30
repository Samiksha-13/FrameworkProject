package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseTestClass;

public class TC01_AccountRegistrationTest extends BaseTestClass {

    @Test
    public void verifyAccountRegistration(){
        logger.info("**Starting test case**");

        HomePage hp = new HomePage(driver);
        hp.clickMyaccount();
        logger.info("**Clicked on my account**");
        hp.clickRegister();
        logger.info("**Clicked on registration page**");

        RegistrationPage rp = new RegistrationPage(driver);
        logger.info("**Filling registration details**");
        rp.setFirstname("john");
        rp.setLastname("dey");
        rp.setEmail("john@gmail.com");
        rp.setTelephone("351315276");
        rp.setPass("xyz1234");
        rp.setConfirmPass("xyz1234");
        rp.clickCheckbox();
        rp.clickContinue();
        logger.info("**Finished test case**");
    }
}
