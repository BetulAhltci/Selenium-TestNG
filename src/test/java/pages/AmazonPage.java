package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unitilites.Driver;

public class AmazonPage {
    /*
    Pages class ları sürekli kullandıgımız locate'leri tekrar tekrar locate etmek zorunda kalmaktan
    kurtulmak için kullanlır

    Her pages class'ı Driver class'ında olusan driver'ı kullanır

    @FindBy notayonunun Driver class'ındaki webDriver'ı kullanabilmesi için bu classa tanıtmamız gerekir

    Bunun için her pages sayfası her olusturuldugunda basına parametresiz bir constructor olusturup
    içerisinde driver ı bu class da tanımlıyoruz
     */
     public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement ilkUrunIsimElementi;

}
