package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[text()=\"My Account\"]")
    WebElement clk_myaccount;

    @FindBy(xpath = "//a[text()=\"Register\"]")
    WebElement clk_register;

    @FindBy(xpath = "//a[text()=\"Login\"]")
    WebElement clk_login;

    public void clickMyaccount(){
        clk_myaccount.click();
    }

    public void clickRegister(){
        clk_register.click();
    }

    public void clickLogin(){
        clk_login.click();
    }
}
