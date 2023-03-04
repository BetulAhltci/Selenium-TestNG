package Test.day12_xmlFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import unitilites.ConfigReader;
import unitilites.Driver;
import unitilites.TestBaseRapor;

public class C03_RaporluPozitifLoginTesti extends TestBaseRapor {

    @Test
    public void pozitifLoginTesti() {
        extentTest=extentReports.createTest("Pozitif login testi","gecerli bilglerle giris yapılabilmeli");
        //qd ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //Login linkine tiklayalım
        QdPage qdPage = new QdPage();
        qdPage.ilkLoginLinli.click();

        //gecerli kllanici adi ve password ile giriş yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButton.click();

        //basarili bir sekilde giris yapıldigini test edin
        Assert.assertTrue(qdPage.basariliGiriselementi.isDisplayed());

    }
}
