package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath="//input[@name='firstname']")
    WebElement txt_firstname;

    @FindBy(xpath="//input[@name='lastname']")
    WebElement txt_lastname;

    @FindBy(xpath="//input[@name='email']")
    WebElement txt_email;

    @FindBy(xpath="//input[@name='telephone']")
    WebElement txt_telephone;

    @FindBy(xpath="//input[@name='password']")
    WebElement txt_password;

    @FindBy(xpath="//input[@name='confirm']")
    WebElement txt_confirmpassword;

    @FindBy(xpath="//input[@type='checkbox']")
    WebElement click_checkbox;

    @FindBy(xpath="//input[@type='submit']")
    WebElement click_button;

    public void setFirstname(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    public void setLastname(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    public void setEmail(String email){
        txt_email.sendKeys(email);
    }

    public void setTelephone(String tele){
        txt_telephone.sendKeys(tele);
    }

    public void setPass(String pass){
        txt_password.sendKeys(pass);
    }

    public void setConfirmPass(String confirmpass){
        txt_confirmpassword.sendKeys(confirmpass);
    }

    public void clickCheckbox(){
        click_checkbox.click();
    }

    public void clickContinue(){
        click_button.click();
    }
}
