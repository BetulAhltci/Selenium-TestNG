package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import unitilites.Driver;

public class QdPage {
 public HTMLInputElement loginButonu;

 public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement ilkLoginLinli;

    @FindBy(id="login-email")
    public WebElement emailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement basariliGiriselementi;

}
