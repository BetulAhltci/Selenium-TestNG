package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unitilites.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@data-testid='royal_login_button']")
    public WebElement loginButtonu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement basariliGirisYapilamadiYaziElementi;
}
