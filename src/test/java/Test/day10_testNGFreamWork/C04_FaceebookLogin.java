package Test.day10_testNGFreamWork;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import unitilites.Driver;
import unitilites.ReusableMethods;

public class C04_FaceebookLogin {

    @Test(groups = "smoke")
    public void facebooktesti() {
        FacebookPage facebookPage=new FacebookPage();
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.passwordKutusu.sendKeys(faker.internet().password());
        facebookPage.loginButtonu.click();

        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.basariliGirisYapilamadiYaziElementi.isDisplayed());

        ReusableMethods.bekle(3);

        Driver.closeDriver();


    }

}