package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unitilites.Driver;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Email address or phone number']")
    public WebElement emailKutusu;

    @FindBy(xpath = "/input[@placeholder='Password']" )
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButtonu;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement basariliGirisYapilamadiYaziElementi;
}
