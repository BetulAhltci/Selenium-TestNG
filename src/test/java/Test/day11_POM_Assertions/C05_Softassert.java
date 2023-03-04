package Test.day11_POM_Assertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import unitilites.ConfigReader;
import unitilites.Driver;

public class C05_Softassert {

    @Test
    public void amazontesti(){
        /*
        Genel olarak test edin denirde hard assert
        dogrulayın(verify) denirse soft assert kullanılır
         */
        //amazon ana sayfaya gidip dogru sayfayada oldugumu dogrulayın
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"url amazon içermiyor");


        //nutella içim arama yapıp,sonucların nutalla icerdiğini dogrulayın
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);

        expectedIcerik="nutella";
        String aramaSonucYazisi=amazonPage.aramaSonucElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains(expectedIcerik),"arama sonucu nutella içermiyor");


        //ilk urune tıklayıp, urun isminde nutella içerdiğini dogrulayın
        amazonPage.ilkUrun.click();
        expectedIcerik="nutella";
        String actualIlkUrunIsim=amazonPage.ilkUrunIsimElementi.getText();

        softAssert.assertTrue(actualIlkUrunIsim.contains(expectedIcerik),"ilk urun ismi nutella içermiyor");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
