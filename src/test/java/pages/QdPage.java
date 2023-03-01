package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unitilites.Driver;

public class QdPage {
   public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "//a[text()='Log in']")
    public WebElement ilkLoginLinli;

    @FindBy(id="login-email")
    public WebElement emailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement basariliGiriselementi;

}
