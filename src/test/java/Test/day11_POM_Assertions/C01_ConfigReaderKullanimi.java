package Test.day11_POM_Assertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import unitilites.ConfigReader;
import unitilites.Driver;

public class C01_ConfigReaderKullanimi {

    @Test
    public void test01(){
        //amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //nutella için arama yapalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        //arama sonuclarının arattıgımız test datasını içerdiğini test edelim
        String expectedIcerik=ConfigReader.getProperty("amazonAranacakKelime");
        String actualAramaSonucYazisi=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));

        Driver.closeDriver();
    }
}
