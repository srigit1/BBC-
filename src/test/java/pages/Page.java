package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Page {

    private WebDriver driver = Driver.getDriver();


    public void getUrl(final String url) {

        driver.navigate().to(url);
    }

    public Page()
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;

    }

    @FindBy (id ="idcta-username")
    public WebElement signinLink;


    @FindBy (id ="user-identifier-input")
    public WebElement usernameTextbox;

    @FindBy (id ="password-input")
    public WebElement passwordTextbox;

    @FindBy (xpath="//button[@id='submit-button']")
    public WebElement signinButton;


    public void clickSignin() throws InterruptedException {
        signinLink.click();
        Thread.sleep(2000);
    }

    public void passUserInfo(String username,String password)
    {
        usernameTextbox.sendKeys(username);
        passwordTextbox.sendKeys(password);
    }

    public void login()
    {
        signinButton.click();
    }







}
