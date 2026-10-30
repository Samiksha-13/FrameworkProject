package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//input[@name=\"email\"]")
    WebElement email;

    @FindBy(xpath="//input[@name=\"password\"]")
    WebElement pass;

    @FindBy(xpath="//input[@value=\"Login\"]")
    WebElement btn_login;

    public void setEmail(String emailid){
        email.sendKeys(emailid);
    }

    public void setPass(String password){
        pass.sendKeys(password);
    }

    public void clickButton(){
        btn_login.click();
    }
}
